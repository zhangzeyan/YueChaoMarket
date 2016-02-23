package com.ycz.yuechaomarket.base.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.ycz.yuechaomarket.service.BaseAIDLService;

/**
 * Created by zhangzeyan on 15/10/12.
 */
public class BaseRemoteService extends Service {

    public final static String TAG = "BaseRemoteService";

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d(TAG,"The method of onCreate is running...");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    BaseAIDLService.Stub iBinder = new BaseAIDLService.Stub() {
        @Override
        public void test() throws RemoteException {
            Log.d(TAG,"The method of test is running...");
        }
    };

}
