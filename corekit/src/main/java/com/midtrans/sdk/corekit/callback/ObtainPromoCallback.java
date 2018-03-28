package com.midtrans.sdk.corekit.callback;

import com.midtrans.sdk.corekit.models.promo.ObtainPromosResponse;

/**
 * Created by rakawm on 2/3/17.
 */

public interface ObtainPromoCallback extends HttpRequestCallback{
    void onSuccess(ObtainPromosResponse response);

    void onFailure(String statusCode, String message);
}
