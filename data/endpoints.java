package p144e.p145a.p146a.p230h.p232f;


public interface a {

    /* app */
    @POST("api/app/v1/app_settings")
    Object m8080w(Continuation<? super AppSettings> dVar);

    @POST("api/app/v1/savePushToken")
    Object m8109Y(@Body PushToken pushToken, Continuation<? super C7735b0<AbstractC7625i0>> dVar);

    @POST("api/app/v1/user_settings")
    Object m8105b(Continuation<? super UserSettings> dVar);

    @POST("api/app/v1/user_settings")
    Object m8104b0(Continuation<? super UserSettings> dVar);


    /* auth */
    @POST("api/auth/v2/loginByEmail")
    Object m8092k(@Body LoginByEmailRequest loginByEmailRequest, Continuation<? super LoginResponse> dVar);

    @POST("api/auth/v2/loginByThirdParty")
    Object m8123K(@Body LoginByThirdPartyRequest loginByThirdPartyRequest, Continuation<? super LoginResponse> dVar);
    
    @POST("api/auth/v2/logout")
    Object m8110X(Continuation<? super Unit> dVar)
    
    @POST("api/auth/v2/signUpByEmail")
    Object m8091l(@Body SignUpByEmailRequest signUpByEmailRequest, Continuation<? super LoginResponse> dVar);

    @POST("api/auth/v2/signUpByThirdParty")
    Object m8101d(@Body SignUpByThirdPartyRequest signUpByThirdPartyRequest, Continuation<? super LoginResponse> dVar);

    @POST("api/auth/v2/token/refresh")
    Object m8108Z(@Body RefreshToken refreshToken, Continuation<? super C7735b0<RefreshTokenResult>> dVar);

    @POST("api/auth/v2/token/refresh")
    Maybe<C7735b0<RefreshTokenResult>> m8082u(@Body RefreshToken refreshToken);


    /* basket */
    @POST("api/basket/v2/{basketId}/cancelOrComplete")
    Maybe<C7735b0<BasketCompleteResponse>> m8129E(@Path(encoded = true, value = "basketId") String str);

    @POST("api/basket/v2/{basketId}/complete")
    Maybe<BasketCompleteResponse> m8126H(@Path(encoded = true, value = "basketId") String str, @Body BasketComplete basketComplete);

    @POST("api/basket/v2/{basketId}/checkout")
    Maybe<CheckoutResult> m8116R(@Path(encoded = true, value = "basketId") String str, @Body BasketCheckout basketCheckout);

    @POST("api/basket/v2/{basketId}/cancel")
    Object m8096g(@Path(encoded = true, value = "basketId") String str, Continuation<? super AbstractC7625i0> dVar);


    /* gdpr */
    @POST("api/gdpr/v1/{userId}/exportUserData")
    Object m8112V(@Path(encoded = true, value = "userId") String str, @Body ExportUserRequest exportUserRequest, Continuation<? super AbstractC7625i0> dVar);

    @POST("api/gdpr/v1/{userId}/deleteUser")
    Object m8081v(@Path(encoded = true, value = "userId") String str, @Body DeleteUserRequest deleteUserRequest, Continuation<? super AbstractC7625i0> dVar);


    /* hiddenstore */
    @POST("api/hiddenstore/v2/remove")
    Object m8115S(@Body RemoveHiddenStoreRequest removeHiddenStoreRequest, Continuation<? super RemoveHiddenStoreResponse> dVar);

    @POST("api/hiddenstore/v2/unlock")
    Maybe<UnlockHiddenStoreResponse> m8111W(@Body UnlockHiddenStoreRequest unlockHiddenStoreRequest);


    /* item */
    @POST("api/item/v7/discover")
    Object m8122L(@Body DiscoverItemsRequest discoverItemsRequest, Continuation<? super DiscoverItemsResponse> dVar);

    @POST("api/item/v7/{itemId}/setFavorite")
    Object m8102c0(@Path(encoded = true, value = "itemId") String str, @Body SetFavoriteRequest setFavoriteRequest, Continuation<? super AbstractC7625i0> dVar);

    @POST("api/item/v7/{itemId}/getPriceCalculations")
    Object m8100d0(@Path(encoded = true, value = "itemId") String str, @Body GetPriceCalculationsRequest getPriceCalculationsRequest, Continuation<? super C7735b0<List<PriceCalculation>>> dVar);

    @POST("api/item/v7/{itemId}")
    Object m8093j(@Path(encoded = true, value = "itemId") String str, @Body ItemRequest itemRequest, Continuation<? super Item> dVar);

    @POST("api/item/v7/")
    Object m8090m(@Body ListItemRequest listItemRequest, Continuation<? super ListItemResponse> dVar);
    
    @POST("api/item/v7/{itemId}/basket")
    Object m8085r(@Path(encoded = true, value = "itemId") String str, @Body ItemBasketRequest itemBasketRequest, Continuation<? super Basket> dVar);


    /* location */
    @POST("api/location/v1/search")
    Maybe<SearchLocationResponse> m8133A(@Body LocationRequest locationRequest);

    @POST("api/location/v1/lookup")
    Maybe<ReverseLookupResponse> m8084s(@Body GeoLocation geoLocation);


    /* map */
    @POST("api/map/v1/listAllBusinessLocationPicker")
    Object m8118P(Continuation<? super StoreLocationListResult> dVar);


    /* order */
    @POST("api/order/v3/{orderId}/redeem")
    Object m8103c(@Path(encoded = true, value = "orderId") String str, Continuation<? super AbstractC7625i0> dVar);

    @POST("api/order/v3/{orderId}/cancel")
    Object m8114T(@Path(encoded = true, value = "orderId") String str, @Body CancelOrderRequest cancelOrderRequest, Continuation<? super AbstractC7625i0> dVar);

    @POST("api/order/v3/{orderId}/rate")
    Object m8130D(@Path(encoded = true, value = "orderId") String str, @Body OrderRatingItem orderRatingItem, Continuation<? super C7735b0<AbstractC7625i0>> dVar);

    @POST("api/order/v3/inactive")
    Object m8127G(@Body ListOrdersRequest listOrdersRequest, Continuation<? super OrderListResult> dVar);

    @POST("api/order/v3/{orderId}/wouldBuyAgain")
    Object m8117Q(@Path(encoded = true, value = "orderId") String str, @Body WouldBuyAgainRequest wouldBuyAgainRequest, Continuation<? super AbstractC7625i0> dVar);

    @POST("api/order/v2/{receiptId}/sendOrderConfirmedEmail")
    Object m8119O(@Path(encoded = true, value = "receiptId") String str, @Body OrderConfirmedEmailRequest orderConfirmedEmailRequest, Continuation<? super AbstractC7625i0> dVar);

    @POST("api/order/v3/active")
    Object m8098e0(@Body ListActiveOrdersRequest listActiveOrdersRequest, Continuation<? super OrderListResult> dVar);

    @POST("api/order/v3/{orderId}/markNotCollected")
    Object m8097f(@Path(encoded = true, value = "orderId") String str, Continuation<? super AbstractC7625i0> dVar);
    
    @POST("api/order/v3/{orderId}")
    Object m8094i(@Path(encoded = true, value = "orderId") String str, Continuation<? super OrderResult> dVar);


    /* payment */
    @POST("api/payment/v1/option/list")
    Maybe<ListPaymentOptionsResponse> m8106a0(@Body ItemBasketRequest itemBasketRequest);

    @POST("api/payment/v1/recurring/delete")
    Maybe<AbstractC7625i0> m8088o(@Body DeleteRecurringPaymentOption deleteRecurringPaymentOption);


    /* selfonboarding */
    @POST("api/selfonboarding/v1/selfonboard")
    Object m8121M(@Body SelfOnboardRequest selfOnboardRequest, Continuation<? super AbstractC7625i0> dVar);


    /* store */
    @POST("api/store/v4/{storeId}")
    Object m8099e(@Path(encoded = true, value = "storeId") String str, @Body StoreRequest storeRequest, Continuation<? super StoreInformation> dVar);


    /* support */
    @POST("api/support/v1/consumer/")
    Object m8132B(@Body ConsumerSupportRequest consumerSupportRequest, Continuation<? super ConsumerSupportResponse> dVar);
    
    @POST("api/support/v1/uploading/files")
    @Multipart
    Object m8078y(@Part List<MultipartBody.C7610c> list, Continuation<? super SupportPictureUploadResponse> dVar);

    @POST("api/support/v1/business/")
    Object m8083t(@Body BusinessSupportRequest businessSupportRequest, Continuation<? super AbstractC7625i0> dVar);

    @POST("api/support/v1/consumer/refund/choice")
    Object m8095h(@Body ConsumerRefundChoiceRequest consumerRefundChoiceRequest, Continuation<? super AbstractC7625i0> dVar);


    /* tracking */
    @POST("api/tracking/v1/events")
    Object m8131C(@Body TrackingEventsRequest trackingEventsRequest, Continuation<? super AbstractC7625i0> dVar);


    /* user */
    @POST("api/user/v1/")
    Object m8079x(Continuation<? super UserData> dVar);

    @POST("api/user/v1/update")
    Object m8086q(@Body UserData userData, Continuation<? super UserData> dVar);

    @POST("api/user/v1/changePassword")
    Object m8125I(@Body ChangePasswordRequest changePasswordRequest, Continuation<? super AbstractC7625i0> dVar);
    
    @POST("api/user/v1/resetPassword")
    Object m8077z(@Body ResetPasswordRequest resetPasswordRequest, Continuation<? super AbstractC7625i0> dVar);

    @POST("api/user/v1/resendWelcomeEmail")
    Object m8087p(@Body ResendWelcomeEmailRequest resendWelcomeEmailRequest, Continuation<? super AbstractC7625i0> dVar);

    @POST("api/user/v1/confirmEmail/{token}")
    Object m8107a(@Path(encoded = true, value = "token") String str, Continuation<? super C7735b0<AbstractC7625i0>> dVar);


    /* voucher */
    @POST("api/voucher/v3/")
    Object m8124J(@Body VoucherListRequest voucherListRequest, Continuation<? super VoucherList> dVar);
    
    @POST("api/voucher/v3/add")
    Maybe<AddVoucherResponse> m8089n(@Body AddVoucherRequest addVoucherRequest);

    @POST("api/voucher/v3/{voucherId}")
    Object m8128F(@Path(encoded = true, value = "voucherId") String str, @Body VoucherDetailRequest voucherDetailRequest, Continuation<? super VoucherDetails> dVar);

    @POST("api/voucher/v3/{voucherId}/storeFilterList")
    Object m8120N(@Path(encoded = true, value = "voucherId") String str, @Body VoucherFilterRequest voucherFilterRequest, Continuation<? super VoucherFilterResponse> dVar);


    /* external */
    @GET("https://meta.apptoogoodtogo.com/env/v1/list.json")
    Object m8113U(Continuation<? super EnvironmentListResult> dVar);
}