# coding=utf-8
import requests

BASE_URL = "https://backend-prod-lb.tgtg.ninja/api/"
AUTH_ENDPOINT = "auth/v1/"
SIGNUP_ENDPOINT = "signup/v1/"
HIDDENSTORE_ENDPOINT = "hiddenstore/v1/"
ITEM_ENDPOINT = "item/v4/"
LOCATION_ENDPOINT = "location/v1/"
PAYMENT_ENDPOINT = "payment/v1/"
VOUCHER_ENDPOINT = "voucher/v2/"
BASKET_ENDPOINT = "basket/v2/"
TRACKING_ENDPOINT = "tracking/v1/"
SUPPORT_ENDPOINT = "support/v1/"
ORDER_ENDPOINT = "order/v1/"
GDPR_ENDPOINT = "gdpr/v1/"
STORE_ENDPOINT = "store/v3/"
MAP_ENDPOINT = "map/v1/"
USER_ENDPOINT = "user/v1/"

# class PyTGTGJobsError(Exception):
#     def __init__(self, msg):
#         self.msg = msg
#
#     def __str__(self):
#         return repr(self.msg)


class PyTGTG:
    @staticmethod
    def __check_error(r):
        try:
            r.raise_for_status()
        except requests.exceptions.HTTPError as e:
            print(e)
            print(e.response.json())
            raise
        return True

    def __init__(self, email=None, password=None, access_token=None, user_id=None, language=None):
        self.session = requests.Session()
        self.access_token = access_token
        self.refresh_token = None

        self.email = email
        self.password = password
        self.user_id = user_id
        self.language = None
        self.device_type = "ANDROID"
        self.language = "fr-FR"

    def __del__(self):
        self.logout()

    @property
    def headers(self):
        headers = {
            "user-agent": "TGTG/20.1.0 Dalvik/2.1.0 (Linux; U; Android 10; POCOPHONE F1 MIUI/V11.0.4.0.QEJMIXM)",
            "accept-language": "fr-FR"
        }
        if self.access_token:
            headers["authorization"] = f"Bearer {self.access_token}"
        return headers

    @property
    def already_logged(self):
        return self.access_token and self.user_id

    def login(self):
        url = BASE_URL + AUTH_ENDPOINT + "loginByEmail"

        if self.already_logged:
            return

        if not self.email or not self.password:
            raise ValueError(
                "You must fill email and password or access_token and user_id"
            )

        query = {
            "device_type": self.device_type,
            "email": self.email,
            "password": self.password
        }

        r = self.session.post(url, json=query, headers=self.headers)

        if self.__check_error(r):
            self.access_token = r.json()['access_token']
            self.refresh_token = r.json()['refresh_token']
            self.user_id = r.json()['startup_data']['user']['user_id']

    def get_current_user(self):
        """
        Get data of the authenticated user.
        :return dict: User's data
        """

        url = BASE_URL + USER_ENDPOINT

        r = self.session.post(url, headers=self.headers)

        if self.__check_error(r):
            return r.json()

    def logout(self):
        """
        Logs out the user. This will invalidate his tokens.
        """
        url = BASE_URL + AUTH_ENDPOINT + "logout"

        r = self.session.post(url, headers=self.headers)

        self.__check_error(r)
