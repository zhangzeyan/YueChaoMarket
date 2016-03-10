package com.ycz.yuechaomarket.base.handler;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/**
 * Created by zhangzeyan on 15/10/16.
 */
public class HandlerThreadActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HandlerThread handlerThread = new HandlerThread("handler_thread");

        Handler handler = new Handler(handlerThread.getLooper()){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
            }
        };
    }
}
