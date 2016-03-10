package com.ycz.yuechaomarket.base.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.RemoteViews;

import com.ycz.yuechaomarket.R;
import com.ycz.yuechaomarket.activity.ServiceSample;

/**
 * Created by zhangzeyan on 15/10/10.
 */
public class BaseService extends Service {

    public final static String TAG = "BaseService";
    private MyIBinder  iBinder = new MyIBinder();

    @Override
    public void onCreate() {
        super.onCreate();
        Notification notification = new Notification(R.mipmap.ic_launcher,
                "有通知到来", System.currentTimeMillis());
        Intent notificationIntent = new Intent(this, ServiceSample.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0,
                notificationIntent, 0);
        RemoteViews remoteView = new RemoteViews(getPackageName(),R.layout.notification_view);
        notification.contentView = remoteView;
        notification.contentIntent = pendingIntent;
        startForeground(1, notification);
        Log.d(TAG, Thread.currentThread().getId() + "");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: "+ this.toString());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG,"onStartCommand");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    Log.d(TAG,"BaseService is running at background.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG,"onUnbind");
        return super.onUnbind(intent);

    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG,"onBind");
        return iBinder;
    }

    public class MyIBinder extends Binder {
        public void download(){
            Log.d(TAG,"Service is starting to download now.");
        }
    };
}
