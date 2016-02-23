package com.ycz.remoteservice;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;

import com.ycz.yuechaomarket.service.BaseAIDLService;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.startRemoteService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent service = new Intent("com.ycz.yuechaomarket.service.BaseAIDLService");
                startService(service);
            }
        });

        findViewById(R.id.stopRemoteService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent service = new Intent("com.ycz.yuechaomarket.service.BaseAIDLService");
                stopService(service);
            }
        });

        findViewById(R.id.bindRemoteService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent service = new Intent("com.ycz.yuechaomarket.service.BaseAIDLService");
                bindService(service, remoteConnection, BIND_AUTO_CREATE);
            }
        });

        findViewById(R.id.unbindRemoteService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unbindService(remoteConnection);
            }
        });
    }

    private ServiceConnection remoteConnection = new ServiceConnection() {

        @Override
        public void onServiceDisconnected(ComponentName name) {
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            BaseAIDLService myAIDLService = BaseAIDLService.Stub.asInterface(service);
            try {
                myAIDLService.test();
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    };

}
