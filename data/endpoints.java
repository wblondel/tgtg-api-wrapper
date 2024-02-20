package td;

public interface InterfaceC10693a {

    /* app */
    @InterfaceC11753k({"withoutAuthorization: true"})
    @InterfaceC11757o("api/app/v1/app_settings")
    Object m2721g(@NotNull InterfaceC11458a<? super C10137m<AppSettings>> interfaceC11458a);

    @InterfaceC11757o("api/app/v1/myStoreOnboardingSettings")
    Object m2691v(@NotNull InterfaceC11458a<? super C10137m<MyStoreOnboardingSettingsResponse>> interfaceC11458a);

    @InterfaceC11757o("api/app/v1/onStartup")
    Object m2714j0(@NotNull InterfaceC11458a<? super C10137m<StartupResponse>> interfaceC11458a);

    @InterfaceC11757o("api/app/v1/savePushToken")
    Object m2749P(@InterfaceC11743a @NotNull PushToken pushToken, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/app/v1/user_settings")
    Object m2758K0(@NotNull InterfaceC11458a<? super C10137m<UserSettings>> interfaceC11458a);


    /* auth */
    @InterfaceC11757o("api/auth/v4/authByRequestPollingId")
    Object m2738V(@InterfaceC11743a @NotNull AuthByRequestPollingIdRequest authByRequestPollingIdRequest, @NotNull InterfaceC11458a<? super C10137m<LoginResponse>> interfaceC11458a);

    @InterfaceC11757o("api/auth/v4/authByRequestToken")
    Object m2734Z(@InterfaceC11743a @NotNull AuthByRequestTokenRequest authByRequestTokenRequest, @NotNull InterfaceC11458a<? super C10137m<LoginResponse>> interfaceC11458a);

    @InterfaceC11757o("api/auth/v4/loginByDirectWebToAppLoginToken")
    Object m2690v0(@InterfaceC11743a @NotNull DirectWebToAppLoginRequest directWebToAppLoginRequest, @NotNull InterfaceC11458a<? super C10137m<LoginResponse>> interfaceC11458a);

    @InterfaceC11757o("api/auth/v4/authByRequestPin")
    Object m2697s(@InterfaceC11743a @NotNull AuthByRequestPinRequest authByRequestPinRequest, @NotNull InterfaceC11458a<? super C10137m<LoginResponse>> interfaceC11458a);

    @InterfaceC11757o("api/auth/v4/signUpByEmail")
    Object m2695t(@InterfaceC11743a @NotNull SignUpByEmailRequest signUpByEmailRequest, @NotNull InterfaceC11458a<? super C10137m<EmailSignupResponse>> interfaceC11458a);

    @InterfaceC11757o("api/auth/v4/authByEmail")
    Object m2710l0(@InterfaceC11743a @NotNull EmailAuthenticateRequest emailAuthenticateRequest, @NotNull InterfaceC11458a<? super C10137m<EmailAuthenticateResponse>> interfaceC11458a);

    @InterfaceC11757o("api/auth/v4/signUpByThirdParty")
    Object m2713k(@InterfaceC11743a @NotNull SignUpByThirdPartyRequest signUpByThirdPartyRequest, @NotNull InterfaceC11458a<? super C10137m<LoginResponse>> interfaceC11458a);

    @InterfaceC11757o("api/auth/v4/loginByThirdParty")
    Object m2712k0(@InterfaceC11743a @NotNull LoginByThirdPartyRequest loginByThirdPartyRequest, @NotNull InterfaceC11458a<? super C10137m<LoginResponse>> interfaceC11458a);

    @InterfaceC11757o("api/auth/v4/logout")
    Object m2723f(@NotNull InterfaceC11458a<? super Unit> interfaceC11458a);


    /* discover */
    @InterfaceC11757o("api/discover/v1/")
    Object m2751O(@InterfaceC11743a @NotNull DiscoverAllBucketsRequest discoverAllBucketsRequest, @InterfaceC11751i("X-TimezoneOffset") String str, @InterfaceC11751i("X-24HourFormat") String str2, @NotNull InterfaceC11458a<? super C10137m<DiscoverAllBucketsResponse>> interfaceC11458a);

    @InterfaceC11757o("api/discover/v1/bucket")
    Object m2739U(@InterfaceC11743a @NotNull DiscoverSingleBucketRequest discoverSingleBucketRequest, @InterfaceC11751i("X-TimezoneOffset") String str, @InterfaceC11751i("X-24HourFormat") String str2, @NotNull InterfaceC11458a<? super C10137m<DiscoverSingleBucketResponse>> interfaceC11458a);


    /* gdpr */
    @InterfaceC11757o("api/gdpr/v1/{userId}/deleteUser")
    Object m2779A(@InterfaceC11761s(encoded = true, value = "userId") String str, @InterfaceC11743a @NotNull DeleteUserRequest deleteUserRequest, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/gdpr/v1/{userId}/exportUserData")
    Object m2767G(@InterfaceC11761s(encoded = true, value = "userId") String str, @InterfaceC11743a @NotNull ExportUserRequest exportUserRequest, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);


    /* hiddenstore */
    @InterfaceC11757o("api/hiddenstore/v2/remove")
    Object m2756L0(@InterfaceC11743a @NotNull RemoveHiddenStoreRequest removeHiddenStoreRequest, @NotNull InterfaceC11458a<? super C10137m<RemoveHiddenStoreResponse>> interfaceC11458a);

    @InterfaceC11757o("api/hiddenstore/v2/unlock")
    Object m2693u(@InterfaceC11743a @NotNull UnlockHiddenStoreRequest unlockHiddenStoreRequest, @NotNull InterfaceC11458a<? super C10137m<UnlockHiddenStoreResponse>> interfaceC11458a);


    /* impact */
    @InterfaceC11757o("api/impact/v1/{USER_ID}/moneySaved")
    Object m2764H0(@InterfaceC11761s(encoded = true, value = "USER_ID") String str, @NotNull InterfaceC11458a<? super C10137m<MoneySavedResponse>> interfaceC11458a);

    @InterfaceC11757o("api/impact/v1/{userId}/co2eSaved")
    Object m2716i0(@InterfaceC11761s(encoded = true, value = "userId") String str, @NotNull InterfaceC11458a<? super C10137m<Co2eSavedResponse>> interfaceC11458a);


    /* invitation */
    @InterfaceC11757o("api/invitation/v1/{invitationId}/fulfill")
    Object m2777B(@InterfaceC11761s(encoded = true, value = "invitationId") @NotNull String str, @InterfaceC11743a @NotNull FulfillmentRequest fulfillmentRequest, @NotNull InterfaceC11458a<? super C10137m<Invitation>> interfaceC11458a);

    @InterfaceC11757o("api/invitation/v1/order/getOrder/{invitationId}")
    Object m2776B0(@InterfaceC11761s(encoded = true, value = "invitationId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<OrderResult>> interfaceC11458a);

    @InterfaceC11757o("api/invitation/v1/order/{orderId}")
    Object m2774C0(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<Invitation>> interfaceC11458a);

    @InterfaceC11757o("api/invitation/v1/order/{orderId}/createOrEnable")
    Object m2762I0(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<Invitation>> interfaceC11458a);

    @InterfaceC11757o("api/invitation/v1/order/fromLink/{invitationExternalId}")
    Object m2755M(@InterfaceC11761s(encoded = true, value = "invitationExternalId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<InvitationFromDeeplinkResponse>> interfaceC11458a);

    @InterfaceC11757o("api/invitation/v1/{invitationExternalId}/accept")
    Object m2731b(@InterfaceC11761s(encoded = true, value = "invitationExternalId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<Invitation>> interfaceC11458a);

    @InterfaceC11757o("api/invitation/v1/{invitationId}/regret")
    Object m2728c0(@InterfaceC11761s(encoded = true, value = "invitationId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<Invitation>> interfaceC11458a);

    @InterfaceC11757o("api/invitation/v1/{invitationId}/disable")
    Object m2708m0(@InterfaceC11761s(encoded = true, value = "invitationId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<Invitation>> interfaceC11458a);

    @InterfaceC11757o("api/invitation/v1/order/markNotCollected/{invitationId}")
    Object m2705o(@InterfaceC11761s(encoded = true, value = "invitationId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);


    /* item */
    @InterfaceC11757o("api/item/v8/recommendations")
    Object m2770E0(@InterfaceC11743a @NotNull RecommendationsListRequest recommendationsListRequest, @InterfaceC11751i("X-TimezoneOffset") String str, @InterfaceC11751i("X-24HourFormat") String str2, @NotNull InterfaceC11458a<? super C10137m<ListItemResponse>> interfaceC11458a);

    @InterfaceC11757o("api/item/v8/{itemId}")
    Object m2759K(@InterfaceC11761s(encoded = true, value = "itemId") String str, @InterfaceC11743a @NotNull ItemRequest itemRequest, @InterfaceC11751i("X-TimezoneOffset") String str2, @InterfaceC11751i("X-24HourFormat") String str3, @NotNull InterfaceC11458a<? super C10137m<? extends BasicItem>> interfaceC11458a);

    @InterfaceC11757o("api/item/v8/count/")
    Object m2733a(@InterfaceC11743a @NotNull ListItemRequest listItemRequest, @NotNull InterfaceC11458a<? super C10137m<Integer>> interfaceC11458a);

    @InterfaceC11757o("api/item/v8/")
    Object m2706n0(@InterfaceC11743a @NotNull ListItemRequest listItemRequest, @InterfaceC11751i("X-TimezoneOffset") String str, @InterfaceC11751i("X-24HourFormat") String str2, @NotNull InterfaceC11458a<? super C10137m<ListItemResponse>> interfaceC11458a);

    @InterfaceC11757o("api/item/v8/{itemId}/getPriceSpecifications")
    Object m2684y0(@InterfaceC11761s(encoded = true, value = "itemId") String str, @InterfaceC11743a @NotNull PriceSpecificationsRequest priceSpecificationsRequest, @NotNull InterfaceC11458a<? super C10137m<PriceSpecifications>> interfaceC11458a);


    /* location */
    @InterfaceC11757o("api/location/v1/lookup")
    Object m2771E(@InterfaceC11743a @NotNull GeoLocation geoLocation, @NotNull InterfaceC11458a<? super C10137m<ReverseLookupResponse>> interfaceC11458a);

    @InterfaceC11757o("api/location/v1/search")
    Object m2752N0(@InterfaceC11743a @NotNull LocationRequest locationRequest, @NotNull InterfaceC11458a<? super C10137m<SearchLocationResponse>> interfaceC11458a);


    /* manufactureritem */
    @InterfaceC11757o("api/manufactureritem/v1/")
    Object m2727d(@InterfaceC11743a @NotNull ManufacturerItemsRequest manufacturerItemsRequest, @NotNull InterfaceC11458a<? super C10137m<ManufacturerItemsResponse>> interfaceC11458a);

    @InterfaceC11757o("api/manufactureritem/v2/updateUserTooltipSeenTime")
    Object m2711l(@NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/manufactureritem/v2/")
    Object m2698r0(@InterfaceC11743a @NotNull ManufacturerItemsV2Request manufacturerItemsV2Request, @NotNull InterfaceC11458a<? super C10137m<ManufacturerItemsV2Response>> interfaceC11458a);


    /* map */
    @InterfaceC11757o("api/map/v1/listAllBusinessLocationPicker")
    Object m2766G0(@NotNull InterfaceC11458a<? super C10137m<StoreLocationListResult>> interfaceC11458a);


    /* order */
    @InterfaceC11757o("api/order/v7/{orderId}/charityPickupDocumentUrl")
    Object m2775C(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<CharityPickupDocumentResponse>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/{orderId}/markNotCollected")
    Object m2765H(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/")
    Object m2760J0(@InterfaceC11743a @NotNull ListOrdersRequest listOrdersRequest, @NotNull InterfaceC11458a<? super C10137m<OrderListMonthlyResult>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/{orderId}/abort")
    Object m2754M0(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @InterfaceC11743a @NotNull CancelOrderRequest cancelOrderRequest, @NotNull InterfaceC11458a<? super C10137m<AbortOrderResponse>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/{orderId}/rate")
    Object m2753N(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @InterfaceC11743a @NotNull OrderRatingItem orderRatingItem, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/{orderId}/cancel")
    Object m2748P0(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @InterfaceC11743a @NotNull CancelOrderRequest cancelOrderRequest, @NotNull InterfaceC11458a<? super C10137m<CancelOrderResponse>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/{orderId}/pay")
    Object m2743S(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @InterfaceC11743a @NotNull CreatePaymentRequest createPaymentRequest, @NotNull InterfaceC11458a<? super C10137m<PaymentResponse>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/active")
    Object m2736X(@InterfaceC11743a @NotNull ListActiveOrdersRequest listActiveOrdersRequest, @NotNull InterfaceC11458a<? super C10137m<OrderListResult>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/{orderId}/validateAndSetAddress")
    Object m2730b0(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @InterfaceC11743a @NotNull UserAddress userAddress, @NotNull InterfaceC11458a<? super C10137m<UserAddressValidationResponse>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/{orderId}/status")
    Object m2717i(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<OrderInfo>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/{orderId}")
    Object m2704o0(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<OrderResult>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/{orderId}/wouldBuyAgain")
    Object m2702p0(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @InterfaceC11743a @NotNull WouldBuyAgainRequest wouldBuyAgainRequest, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/{orderId}/redeem")
    Object m2696s0(@InterfaceC11761s(encoded = true, value = "orderId") @NotNull String str, @InterfaceC11743a @NotNull RedeemOrderRequest redeemOrderRequest, @NotNull InterfaceC11458a<? super C10137m<RedeemResponse>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/{receiptId}/sendOrderConfirmedEmail")
    Object m2692u0(@InterfaceC11761s(encoded = true, value = "receiptId") String str, @InterfaceC11743a @NotNull OrderConfirmedEmailRequest orderConfirmedEmailRequest, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/order/v7/create/{itemId}")
    Object m2715j(@InterfaceC11761s(encoded = true, value = "itemId") @NotNull String str, @InterfaceC11743a @NotNull CreateOrderRequest createOrderRequest, @NotNull InterfaceC11458a<? super C10137m<CreateOrderResponse>> interfaceC11458a);


    /* payment */
    @InterfaceC11757o("api/payment/v3/{paymentId}/additionalAuthorization")
    Object m2688w0(@InterfaceC11761s(encoded = true, value = "paymentId") @NotNull String str, @InterfaceC11743a @NotNull AdditionalAuthRequest additionalAuthRequest, @NotNull InterfaceC11458a<? super C10137m<PaymentResponse>> interfaceC11458a);

    @InterfaceC11757o("api/payment/v3/{paymentId}")
    Object m2687x(@InterfaceC11761s(encoded = true, value = "paymentId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<PaymentResponse>> interfaceC11458a);

    @InterfaceC11757o("api/payment/v3/{paymentId}/biometrics")
    Object m2740T0(@InterfaceC11761s(encoded = true, value = "paymentId") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<BiometricsResponse>> interfaceC11458a);


    /* paymentMethod */
    @InterfaceC11757o("api/paymentMethod/v1/item/{itemId}")
    Object m2768F0(@InterfaceC11761s(encoded = true, value = "itemId") String str, @InterfaceC11743a @NotNull PaymentMethodsRequest paymentMethodsRequest, @NotNull InterfaceC11458a<? super C10137m<PaymentMethodsResponse>> interfaceC11458a);

    @InterfaceC11757o("api/paymentMethod/v1/savedpaymentmethod/delete")
    Object m2689w(@InterfaceC11743a @NotNull DeleteCardRequest deleteCardRequest, @NotNull InterfaceC11458a<? super C10137m<DeleteCardResponse>> interfaceC11458a);

    @InterfaceC11757o("api/paymentMethod/v1/")
    Object m2718h0(@InterfaceC11743a @NotNull PaymentMethodsRequest paymentMethodsRequest, @NotNull InterfaceC11458a<? super C10137m<PaymentMethodsResponse>> interfaceC11458a);


    /* selfonboarding */
    @InterfaceC11757o("api/selfonboarding/v1/selfonboard")
    Object m2745R(@InterfaceC11743a @NotNull SelfOnboardRequest selfOnboardRequest, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);


    /* store */
    @InterfaceC11757o("api/store/v4/{storeId}")
    Object m2724e0(@InterfaceC11761s(encoded = true, value = "storeId") String str, @InterfaceC11743a @NotNull StoreRequest storeRequest, @NotNull InterfaceC11458a<? super C10137m<StoreInformation>> interfaceC11458a);


    /* support */
    @InterfaceC11757o("api/support/v2/consumer/")
    Object m2778A0(@InterfaceC11743a @NotNull ConsumerSupportRequest consumerSupportRequest, @NotNull InterfaceC11458a<? super C10137m<ConsumerSupportResponse>> interfaceC11458a);

    @InterfaceC11757o("api/support/v2/consumer/refund/choice")
    Object m2746Q0(@InterfaceC11743a @NotNull ConsumerRefundChoiceRequest consumerRefundChoiceRequest, @NotNull InterfaceC11458a<? super C10137m<RefundResponse>> interfaceC11458a);

    @InterfaceC11757o("api/support/v2/consumer/{supportRequestId}/confirm")
    Object m2732a0(@InterfaceC11761s(encoded = true, value = "supportRequestId") String str, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11754l
    @InterfaceC11757o("api/support/v2/uploading/files")
    Object m2703p(@InterfaceC11759q List<C4887z> list, @NotNull InterfaceC11458a<? super C10137m<SupportPictureUploadResponse>> interfaceC11458a);

    @InterfaceC11757o("api/support/v1/business/")
    Object m2686x0(@InterfaceC11743a @NotNull BusinessSupportRequest businessSupportRequest, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);


    /* tracking */
    @InterfaceC11753k({"withoutAuthorization: true"})
    @InterfaceC11757o("api/tracking/v1/anonymousEvents")
    Object m2699r(@InterfaceC11743a @NotNull ConsentScreenEventRequest consentScreenEventRequest, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/tracking/v1/events")
    Object m2694t0(@InterfaceC11743a @NotNull TrackingEventsRequest trackingEventsRequest, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);


    /* user */
    @InterfaceC11757o("api/user/v2/")
    Object m2773D(@NotNull InterfaceC11458a<? super C10137m<UserData>> interfaceC11458a);

    @InterfaceC11757o("api/user/v2/profileDetails")
    Object m2772D0(@NotNull InterfaceC11458a<? super C10137m<ProfilePageResponse>> interfaceC11458a);

    @InterfaceC11757o("api/user/v2/updatePushNotificationSettings")
    Object m2769F(@InterfaceC11743a @NotNull PushNotificationSettingsRequestResponse pushNotificationSettingsRequestResponse, @NotNull InterfaceC11458a<? super C10137m<PushNotificationSettingsRequestResponse>> interfaceC11458a);

    @InterfaceC11757o("api/user/demographics/update")
    Object m2761J(@InterfaceC11743a @NotNull UserDemographicsUpdate userDemographicsUpdate, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/user/v2/emailChangeRequest")
    Object m2757L(@InterfaceC11743a @NotNull EmailChangeRequest emailChangeRequest, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/user/v2/getEmailStatus")
    Object m2683z(@NotNull InterfaceC11458a<? super C10137m<EmailStatusResponse>> interfaceC11458a);

    @InterfaceC11757o("api/user/v2/getPushNotificationSettings")
    Object m2682z0(@NotNull InterfaceC11458a<? super C10137m<PushNotificationSettingsRequestResponse>> interfaceC11458a);

    @InterfaceC11757o("api/user/v2/updateUserReferralAcceptanceState")
    Object m2709m(@InterfaceC11743a @NotNull UserReferralUpdateAcceptanceStateRequest userReferralUpdateAcceptanceStateRequest, @NotNull InterfaceC11458a<? super C10137m<UserReferralResponse>> interfaceC11458a);

    @InterfaceC11757o("api/user/v2/confirmEmail/{token}")
    Object m2707n(@InterfaceC11761s(encoded = true, value = "token") @NotNull String str, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/user/v2/mePage")
    Object m2700q0(@NotNull InterfaceC11458a<? super C10137m<MePageResponse>> interfaceC11458a);

    @InterfaceC11757o("api/user/badge/getBadge")
    Object m2747Q(@InterfaceC11743a @NotNull UserBadgeDetailsRequest userBadgeDetailsRequest, @NotNull InterfaceC11458a<? super C10137m<UserBadgeDetailsResponse>> interfaceC11458a);

    @InterfaceC11757o("api/user/v2/resendWelcomeEmail")
    Object m2742S0(@InterfaceC11743a @NotNull ResendWelcomeEmailRequest resendWelcomeEmailRequest, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);

    @InterfaceC11757o("api/user/v2/update")
    Object m2737W(@InterfaceC11743a @NotNull UserData userData, @NotNull InterfaceC11458a<? super C10137m<UserData>> interfaceC11458a);

    @InterfaceC11757o("api/user/badge")
    Object m2725e(@NotNull InterfaceC11458a<? super C10137m<UserBadgesResponse>> interfaceC11458a);

    @InterfaceC11757o("api/user/favorite/v1/{itemId}/update")
    Object m2720g0(@InterfaceC11761s(encoded = true, value = "itemId") String str, @InterfaceC11743a @NotNull SetFavoriteRequest setFavoriteRequest, @NotNull InterfaceC11458a<? super C10137m<? extends AbstractC4869j0>> interfaceC11458a);


    /* voucher */
    @InterfaceC11757o("api/voucher/v4/used")
    Object m2763I(@NotNull InterfaceC11458a<? super C10137m<BasicVoucherList>> interfaceC11458a);

    @InterfaceC11757o("api/voucher/v3/")
    Object m2750O0(@InterfaceC11743a @NotNull VoucherListRequest voucherListRequest, @NotNull InterfaceC11458a<? super C10137m<VoucherList>> interfaceC11458a);

    @InterfaceC11757o("api/voucher/v3/add")
    Object m2744R0(@InterfaceC11743a @NotNull AddVoucherRequest addVoucherRequest, @NotNull InterfaceC11458a<? super C10137m<AddVoucherResponse>> interfaceC11458a);

    @InterfaceC11757o("api/voucher/v4/active")
    Object m2741T(@NotNull InterfaceC11458a<? super C10137m<BasicVoucherList>> interfaceC11458a);

    @InterfaceC11757o("api/voucher/v3/{voucherId}/storeFilterList")
    Object m2726d0(@InterfaceC11761s(encoded = true, value = "voucherId") String str, @InterfaceC11743a @NotNull VoucherFilterRequest voucherFilterRequest, @NotNull InterfaceC11458a<? super C10137m<VoucherFilterResponse>> interfaceC11458a);

    @InterfaceC11757o("api/voucher/v3/{voucherId}")
    Object m2722f0(@InterfaceC11761s(encoded = true, value = "voucherId") String str, @InterfaceC11743a @NotNull VoucherDetailRequest voucherDetailRequest, @NotNull InterfaceC11458a<? super C10137m<VoucherDetails>> interfaceC11458a);

    @InterfaceC11757o("api/voucher/v4/{voucherId}")
    Object m2719h(@InterfaceC11761s(encoded = true, value = "voucherId") String str, @NotNull InterfaceC11458a<? super C10137m<VoucherDetailsResponse>> interfaceC11458a);

    @InterfaceC11757o("api/voucher/v4/add")
    Object m2701q(@InterfaceC11743a @NotNull AddVoucherRequest addVoucherRequest, @NotNull InterfaceC11458a<? super C10137m<AddNewVoucherResponse>> interfaceC11458a);

    @InterfaceC11757o("api/voucher/v4/{voucherId}/storeFilterList")
    Object m2685y(@InterfaceC11761s(encoded = true, value = "voucherId") String str, @NotNull InterfaceC11458a<? super C10137m<VoucherFilterResponse>> interfaceC11458a);


    /* widget */
    @InterfaceC11757o("api/widget/v1/getfavorites")
    Object m2735Y(@InterfaceC11743a @NotNull FavouriteWidgetRequest favouriteWidgetRequest, @NotNull InterfaceC11458a<? super C10137m<FavouriteWidgetResponse>> interfaceC11458a);


    /* external */
    @InterfaceC11748f("https://meta.apptoogoodtogo.com/env/v1/list.json")
    Object m2729c(@NotNull InterfaceC11458a<? super C10137m<EnvironmentListResult>> interfaceC11458a);

}