package td;

public interface InterfaceC10693a {

    /* app */
    @InterfaceC11753k({"withoutAuthorization: true"})
    @POST("api/app/v1/app_settings")
    Object m2721g(@NotNull Continuation<? super C10137m<AppSettings>> Continuation);

    @POST("api/app/v1/myStoreOnboardingSettings")
    Object m2691v(@NotNull Continuation<? super C10137m<MyStoreOnboardingSettingsResponse>> Continuation);

    @POST("api/app/v1/onStartup")
    Object m2714j0(@NotNull Continuation<? super C10137m<StartupResponse>> Continuation);

    @POST("api/app/v1/savePushToken")
    Object m2749P(@Body @NotNull PushToken pushToken, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/app/v1/user_settings")
    Object m2758K0(@NotNull Continuation<? super C10137m<UserSettings>> Continuation);


    /* auth */
    @POST("api/auth/v4/authByRequestPollingId")
    Object m2738V(@Body @NotNull AuthByRequestPollingIdRequest authByRequestPollingIdRequest, @NotNull Continuation<? super C10137m<LoginResponse>> Continuation);

    @POST("api/auth/v4/authByRequestToken")
    Object m2734Z(@Body @NotNull AuthByRequestTokenRequest authByRequestTokenRequest, @NotNull Continuation<? super C10137m<LoginResponse>> Continuation);

    @POST("api/auth/v4/loginByDirectWebToAppLoginToken")
    Object m2690v0(@Body @NotNull DirectWebToAppLoginRequest directWebToAppLoginRequest, @NotNull Continuation<? super C10137m<LoginResponse>> Continuation);

    @POST("api/auth/v4/authByRequestPin")
    Object m2697s(@Body @NotNull AuthByRequestPinRequest authByRequestPinRequest, @NotNull Continuation<? super C10137m<LoginResponse>> Continuation);

    @POST("api/auth/v4/signUpByEmail")
    Object m2695t(@Body @NotNull SignUpByEmailRequest signUpByEmailRequest, @NotNull Continuation<? super C10137m<EmailSignupResponse>> Continuation);

    @POST("api/auth/v4/authByEmail")
    Object m2710l0(@Body @NotNull EmailAuthenticateRequest emailAuthenticateRequest, @NotNull Continuation<? super C10137m<EmailAuthenticateResponse>> Continuation);

    @POST("api/auth/v4/signUpByThirdParty")
    Object m2713k(@Body @NotNull SignUpByThirdPartyRequest signUpByThirdPartyRequest, @NotNull Continuation<? super C10137m<LoginResponse>> Continuation);

    @POST("api/auth/v4/loginByThirdParty")
    Object m2712k0(@Body @NotNull LoginByThirdPartyRequest loginByThirdPartyRequest, @NotNull Continuation<? super C10137m<LoginResponse>> Continuation);

    @POST("api/auth/v4/logout")
    Object m2723f(@NotNull Continuation<? super Unit> Continuation);


    /* discover */
    @POST("api/discover/v1/")
    Object m2751O(@Body @NotNull DiscoverAllBucketsRequest discoverAllBucketsRequest, @InterfaceC11751i("X-TimezoneOffset") String str, @InterfaceC11751i("X-24HourFormat") String str2, @NotNull Continuation<? super C10137m<DiscoverAllBucketsResponse>> Continuation);

    @POST("api/discover/v1/bucket")
    Object m2739U(@Body @NotNull DiscoverSingleBucketRequest discoverSingleBucketRequest, @InterfaceC11751i("X-TimezoneOffset") String str, @InterfaceC11751i("X-24HourFormat") String str2, @NotNull Continuation<? super C10137m<DiscoverSingleBucketResponse>> Continuation);


    /* gdpr */
    @POST("api/gdpr/v1/{userId}/deleteUser")
    Object m2779A(@Path(encoded = true, value = "userId") String str, @Body @NotNull DeleteUserRequest deleteUserRequest, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/gdpr/v1/{userId}/exportUserData")
    Object m2767G(@Path(encoded = true, value = "userId") String str, @Body @NotNull ExportUserRequest exportUserRequest, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);


    /* hiddenstore */
    @POST("api/hiddenstore/v2/remove")
    Object m2756L0(@Body @NotNull RemoveHiddenStoreRequest removeHiddenStoreRequest, @NotNull Continuation<? super C10137m<RemoveHiddenStoreResponse>> Continuation);

    @POST("api/hiddenstore/v2/unlock")
    Object m2693u(@Body @NotNull UnlockHiddenStoreRequest unlockHiddenStoreRequest, @NotNull Continuation<? super C10137m<UnlockHiddenStoreResponse>> Continuation);


    /* impact */
    @POST("api/impact/v1/{USER_ID}/moneySaved")
    Object m2764H0(@Path(encoded = true, value = "USER_ID") String str, @NotNull Continuation<? super C10137m<MoneySavedResponse>> Continuation);

    @POST("api/impact/v1/{userId}/co2eSaved")
    Object m2716i0(@Path(encoded = true, value = "userId") String str, @NotNull Continuation<? super C10137m<Co2eSavedResponse>> Continuation);


    /* invitation */
    @POST("api/invitation/v1/{invitationId}/fulfill")
    Object m2777B(@Path(encoded = true, value = "invitationId") @NotNull String str, @Body @NotNull FulfillmentRequest fulfillmentRequest, @NotNull Continuation<? super C10137m<Invitation>> Continuation);

    @POST("api/invitation/v1/order/getOrder/{invitationId}")
    Object m2776B0(@Path(encoded = true, value = "invitationId") @NotNull String str, @NotNull Continuation<? super C10137m<OrderResult>> Continuation);

    @POST("api/invitation/v1/order/{orderId}")
    Object m2774C0(@Path(encoded = true, value = "orderId") @NotNull String str, @NotNull Continuation<? super C10137m<Invitation>> Continuation);

    @POST("api/invitation/v1/order/{orderId}/createOrEnable")
    Object m2762I0(@Path(encoded = true, value = "orderId") @NotNull String str, @NotNull Continuation<? super C10137m<Invitation>> Continuation);

    @POST("api/invitation/v1/order/fromLink/{invitationExternalId}")
    Object m2755M(@Path(encoded = true, value = "invitationExternalId") @NotNull String str, @NotNull Continuation<? super C10137m<InvitationFromDeeplinkResponse>> Continuation);

    @POST("api/invitation/v1/{invitationExternalId}/accept")
    Object m2731b(@Path(encoded = true, value = "invitationExternalId") @NotNull String str, @NotNull Continuation<? super C10137m<Invitation>> Continuation);

    @POST("api/invitation/v1/{invitationId}/regret")
    Object m2728c0(@Path(encoded = true, value = "invitationId") @NotNull String str, @NotNull Continuation<? super C10137m<Invitation>> Continuation);

    @POST("api/invitation/v1/{invitationId}/disable")
    Object m2708m0(@Path(encoded = true, value = "invitationId") @NotNull String str, @NotNull Continuation<? super C10137m<Invitation>> Continuation);

    @POST("api/invitation/v1/order/markNotCollected/{invitationId}")
    Object m2705o(@Path(encoded = true, value = "invitationId") @NotNull String str, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);


    /* item */
    @POST("api/item/v8/recommendations")
    Object m2770E0(@Body @NotNull RecommendationsListRequest recommendationsListRequest, @InterfaceC11751i("X-TimezoneOffset") String str, @InterfaceC11751i("X-24HourFormat") String str2, @NotNull Continuation<? super C10137m<ListItemResponse>> Continuation);

    @POST("api/item/v8/{itemId}")
    Object m2759K(@Path(encoded = true, value = "itemId") String str, @Body @NotNull ItemRequest itemRequest, @InterfaceC11751i("X-TimezoneOffset") String str2, @InterfaceC11751i("X-24HourFormat") String str3, @NotNull Continuation<? super C10137m<? extends BasicItem>> Continuation);

    @POST("api/item/v8/count/")
    Object m2733a(@Body @NotNull ListItemRequest listItemRequest, @NotNull Continuation<? super C10137m<Integer>> Continuation);

    @POST("api/item/v8/")
    Object m2706n0(@Body @NotNull ListItemRequest listItemRequest, @InterfaceC11751i("X-TimezoneOffset") String str, @InterfaceC11751i("X-24HourFormat") String str2, @NotNull Continuation<? super C10137m<ListItemResponse>> Continuation);

    @POST("api/item/v8/{itemId}/getPriceSpecifications")
    Object m2684y0(@Path(encoded = true, value = "itemId") String str, @Body @NotNull PriceSpecificationsRequest priceSpecificationsRequest, @NotNull Continuation<? super C10137m<PriceSpecifications>> Continuation);


    /* location */
    @POST("api/location/v1/lookup")
    Object m2771E(@Body @NotNull GeoLocation geoLocation, @NotNull Continuation<? super C10137m<ReverseLookupResponse>> Continuation);

    @POST("api/location/v1/search")
    Object m2752N0(@Body @NotNull LocationRequest locationRequest, @NotNull Continuation<? super C10137m<SearchLocationResponse>> Continuation);


    /* manufactureritem */
    @POST("api/manufactureritem/v1/")
    Object m2727d(@Body @NotNull ManufacturerItemsRequest manufacturerItemsRequest, @NotNull Continuation<? super C10137m<ManufacturerItemsResponse>> Continuation);

    @POST("api/manufactureritem/v2/updateUserTooltipSeenTime")
    Object m2711l(@NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/manufactureritem/v2/")
    Object m2698r0(@Body @NotNull ManufacturerItemsV2Request manufacturerItemsV2Request, @NotNull Continuation<? super C10137m<ManufacturerItemsV2Response>> Continuation);


    /* map */
    @POST("api/map/v1/listAllBusinessLocationPicker")
    Object m2766G0(@NotNull Continuation<? super C10137m<StoreLocationListResult>> Continuation);


    /* order */
    @POST("api/order/v7/{orderId}/charityPickupDocumentUrl")
    Object m2775C(@Path(encoded = true, value = "orderId") @NotNull String str, @NotNull Continuation<? super C10137m<CharityPickupDocumentResponse>> Continuation);

    @POST("api/order/v7/{orderId}/markNotCollected")
    Object m2765H(@Path(encoded = true, value = "orderId") @NotNull String str, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/order/v7/")
    Object m2760J0(@Body @NotNull ListOrdersRequest listOrdersRequest, @NotNull Continuation<? super C10137m<OrderListMonthlyResult>> Continuation);

    @POST("api/order/v7/{orderId}/abort")
    Object m2754M0(@Path(encoded = true, value = "orderId") @NotNull String str, @Body @NotNull CancelOrderRequest cancelOrderRequest, @NotNull Continuation<? super C10137m<AbortOrderResponse>> Continuation);

    @POST("api/order/v7/{orderId}/rate")
    Object m2753N(@Path(encoded = true, value = "orderId") @NotNull String str, @Body @NotNull OrderRatingItem orderRatingItem, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/order/v7/{orderId}/cancel")
    Object m2748P0(@Path(encoded = true, value = "orderId") @NotNull String str, @Body @NotNull CancelOrderRequest cancelOrderRequest, @NotNull Continuation<? super C10137m<CancelOrderResponse>> Continuation);

    @POST("api/order/v7/{orderId}/pay")
    Object m2743S(@Path(encoded = true, value = "orderId") @NotNull String str, @Body @NotNull CreatePaymentRequest createPaymentRequest, @NotNull Continuation<? super C10137m<PaymentResponse>> Continuation);

    @POST("api/order/v7/active")
    Object m2736X(@Body @NotNull ListActiveOrdersRequest listActiveOrdersRequest, @NotNull Continuation<? super C10137m<OrderListResult>> Continuation);

    @POST("api/order/v7/{orderId}/validateAndSetAddress")
    Object m2730b0(@Path(encoded = true, value = "orderId") @NotNull String str, @Body @NotNull UserAddress userAddress, @NotNull Continuation<? super C10137m<UserAddressValidationResponse>> Continuation);

    @POST("api/order/v7/{orderId}/status")
    Object m2717i(@Path(encoded = true, value = "orderId") @NotNull String str, @NotNull Continuation<? super C10137m<OrderInfo>> Continuation);

    @POST("api/order/v7/{orderId}")
    Object m2704o0(@Path(encoded = true, value = "orderId") @NotNull String str, @NotNull Continuation<? super C10137m<OrderResult>> Continuation);

    @POST("api/order/v7/{orderId}/wouldBuyAgain")
    Object m2702p0(@Path(encoded = true, value = "orderId") @NotNull String str, @Body @NotNull WouldBuyAgainRequest wouldBuyAgainRequest, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/order/v7/{orderId}/redeem")
    Object m2696s0(@Path(encoded = true, value = "orderId") @NotNull String str, @Body @NotNull RedeemOrderRequest redeemOrderRequest, @NotNull Continuation<? super C10137m<RedeemResponse>> Continuation);

    @POST("api/order/v7/{receiptId}/sendOrderConfirmedEmail")
    Object m2692u0(@Path(encoded = true, value = "receiptId") String str, @Body @NotNull OrderConfirmedEmailRequest orderConfirmedEmailRequest, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/order/v7/create/{itemId}")
    Object m2715j(@Path(encoded = true, value = "itemId") @NotNull String str, @Body @NotNull CreateOrderRequest createOrderRequest, @NotNull Continuation<? super C10137m<CreateOrderResponse>> Continuation);


    /* payment */
    @POST("api/payment/v3/{paymentId}/additionalAuthorization")
    Object m2688w0(@Path(encoded = true, value = "paymentId") @NotNull String str, @Body @NotNull AdditionalAuthRequest additionalAuthRequest, @NotNull Continuation<? super C10137m<PaymentResponse>> Continuation);

    @POST("api/payment/v3/{paymentId}")
    Object m2687x(@Path(encoded = true, value = "paymentId") @NotNull String str, @NotNull Continuation<? super C10137m<PaymentResponse>> Continuation);

    @POST("api/payment/v3/{paymentId}/biometrics")
    Object m2740T0(@Path(encoded = true, value = "paymentId") @NotNull String str, @NotNull Continuation<? super C10137m<BiometricsResponse>> Continuation);


    /* paymentMethod */
    @POST("api/paymentMethod/v1/item/{itemId}")
    Object m2768F0(@Path(encoded = true, value = "itemId") String str, @Body @NotNull PaymentMethodsRequest paymentMethodsRequest, @NotNull Continuation<? super C10137m<PaymentMethodsResponse>> Continuation);

    @POST("api/paymentMethod/v1/savedpaymentmethod/delete")
    Object m2689w(@Body @NotNull DeleteCardRequest deleteCardRequest, @NotNull Continuation<? super C10137m<DeleteCardResponse>> Continuation);

    @POST("api/paymentMethod/v1/")
    Object m2718h0(@Body @NotNull PaymentMethodsRequest paymentMethodsRequest, @NotNull Continuation<? super C10137m<PaymentMethodsResponse>> Continuation);


    /* selfonboarding */
    @POST("api/selfonboarding/v1/selfonboard")
    Object m2745R(@Body @NotNull SelfOnboardRequest selfOnboardRequest, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);


    /* store */
    @POST("api/store/v4/{storeId}")
    Object m2724e0(@Path(encoded = true, value = "storeId") String str, @Body @NotNull StoreRequest storeRequest, @NotNull Continuation<? super C10137m<StoreInformation>> Continuation);


    /* support */
    @POST("api/support/v2/consumer/")
    Object m2778A0(@Body @NotNull ConsumerSupportRequest consumerSupportRequest, @NotNull Continuation<? super C10137m<ConsumerSupportResponse>> Continuation);

    @POST("api/support/v2/consumer/refund/choice")
    Object m2746Q0(@Body @NotNull ConsumerRefundChoiceRequest consumerRefundChoiceRequest, @NotNull Continuation<? super C10137m<RefundResponse>> Continuation);

    @POST("api/support/v2/consumer/{supportRequestId}/confirm")
    Object m2732a0(@Path(encoded = true, value = "supportRequestId") String str, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @Multipart
    @POST("api/support/v2/uploading/files")
    Object m2703p(@Part List<C4887z> list, @NotNull Continuation<? super C10137m<SupportPictureUploadResponse>> Continuation);

    @POST("api/support/v1/business/")
    Object m2686x0(@Body @NotNull BusinessSupportRequest businessSupportRequest, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);


    /* tracking */
    @InterfaceC11753k({"withoutAuthorization: true"})
    @POST("api/tracking/v1/anonymousEvents")
    Object m2699r(@Body @NotNull ConsentScreenEventRequest consentScreenEventRequest, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/tracking/v1/events")
    Object m2694t0(@Body @NotNull TrackingEventsRequest trackingEventsRequest, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);


    /* user */
    @POST("api/user/v2/")
    Object m2773D(@NotNull Continuation<? super C10137m<UserData>> Continuation);

    @POST("api/user/v2/profileDetails")
    Object m2772D0(@NotNull Continuation<? super C10137m<ProfilePageResponse>> Continuation);

    @POST("api/user/v2/updatePushNotificationSettings")
    Object m2769F(@Body @NotNull PushNotificationSettingsRequestResponse pushNotificationSettingsRequestResponse, @NotNull Continuation<? super C10137m<PushNotificationSettingsRequestResponse>> Continuation);

    @POST("api/user/demographics/update")
    Object m2761J(@Body @NotNull UserDemographicsUpdate userDemographicsUpdate, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/user/v2/emailChangeRequest")
    Object m2757L(@Body @NotNull EmailChangeRequest emailChangeRequest, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/user/v2/getEmailStatus")
    Object m2683z(@NotNull Continuation<? super C10137m<EmailStatusResponse>> Continuation);

    @POST("api/user/v2/getPushNotificationSettings")
    Object m2682z0(@NotNull Continuation<? super C10137m<PushNotificationSettingsRequestResponse>> Continuation);

    @POST("api/user/v2/updateUserReferralAcceptanceState")
    Object m2709m(@Body @NotNull UserReferralUpdateAcceptanceStateRequest userReferralUpdateAcceptanceStateRequest, @NotNull Continuation<? super C10137m<UserReferralResponse>> Continuation);

    @POST("api/user/v2/confirmEmail/{token}")
    Object m2707n(@Path(encoded = true, value = "token") @NotNull String str, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/user/v2/mePage")
    Object m2700q0(@NotNull Continuation<? super C10137m<MePageResponse>> Continuation);

    @POST("api/user/badge/getBadge")
    Object m2747Q(@Body @NotNull UserBadgeDetailsRequest userBadgeDetailsRequest, @NotNull Continuation<? super C10137m<UserBadgeDetailsResponse>> Continuation);

    @POST("api/user/v2/resendWelcomeEmail")
    Object m2742S0(@Body @NotNull ResendWelcomeEmailRequest resendWelcomeEmailRequest, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);

    @POST("api/user/v2/update")
    Object m2737W(@Body @NotNull UserData userData, @NotNull Continuation<? super C10137m<UserData>> Continuation);

    @POST("api/user/badge")
    Object m2725e(@NotNull Continuation<? super C10137m<UserBadgesResponse>> Continuation);

    @POST("api/user/favorite/v1/{itemId}/update")
    Object m2720g0(@Path(encoded = true, value = "itemId") String str, @Body @NotNull SetFavoriteRequest setFavoriteRequest, @NotNull Continuation<? super C10137m<? extends AbstractC4869j0>> Continuation);


    /* voucher */
    @POST("api/voucher/v4/used")
    Object m2763I(@NotNull Continuation<? super C10137m<BasicVoucherList>> Continuation);

    @POST("api/voucher/v3/")
    Object m2750O0(@Body @NotNull VoucherListRequest voucherListRequest, @NotNull Continuation<? super C10137m<VoucherList>> Continuation);

    @POST("api/voucher/v3/add")
    Object m2744R0(@Body @NotNull AddVoucherRequest addVoucherRequest, @NotNull Continuation<? super C10137m<AddVoucherResponse>> Continuation);

    @POST("api/voucher/v4/active")
    Object m2741T(@NotNull Continuation<? super C10137m<BasicVoucherList>> Continuation);

    @POST("api/voucher/v3/{voucherId}/storeFilterList")
    Object m2726d0(@Path(encoded = true, value = "voucherId") String str, @Body @NotNull VoucherFilterRequest voucherFilterRequest, @NotNull Continuation<? super C10137m<VoucherFilterResponse>> Continuation);

    @POST("api/voucher/v3/{voucherId}")
    Object m2722f0(@Path(encoded = true, value = "voucherId") String str, @Body @NotNull VoucherDetailRequest voucherDetailRequest, @NotNull Continuation<? super C10137m<VoucherDetails>> Continuation);

    @POST("api/voucher/v4/{voucherId}")
    Object m2719h(@Path(encoded = true, value = "voucherId") String str, @NotNull Continuation<? super C10137m<VoucherDetailsResponse>> Continuation);

    @POST("api/voucher/v4/add")
    Object m2701q(@Body @NotNull AddVoucherRequest addVoucherRequest, @NotNull Continuation<? super C10137m<AddNewVoucherResponse>> Continuation);

    @POST("api/voucher/v4/{voucherId}/storeFilterList")
    Object m2685y(@Path(encoded = true, value = "voucherId") String str, @NotNull Continuation<? super C10137m<VoucherFilterResponse>> Continuation);


    /* widget */
    @POST("api/widget/v1/getfavorites")
    Object m2735Y(@Body @NotNull FavouriteWidgetRequest favouriteWidgetRequest, @NotNull Continuation<? super C10137m<FavouriteWidgetResponse>> Continuation);


    /* external */
    @GET("https://meta.apptoogoodtogo.com/env/v1/list.json")
    Object m2729c(@NotNull Continuation<? super C10137m<EnvironmentListResult>> Continuation);

}