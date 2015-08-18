package com.mango.coolweather.util;

/**
 * Created by Administrator on 2015/8/18 0018.
 */
public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);

}
