package com.ycz.yuechaomarket.base.service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by zhangzeyan on 15/10/12.
 */
public class BaseIntentService extends IntentService {

    public final static String TAG = "BaseService";

    public BaseIntentService() {
        super("");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            Thread.sleep(10000);
            Log.d(TAG,"This is IntentService class.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
