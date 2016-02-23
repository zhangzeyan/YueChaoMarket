package com.ycz.yuechaomarket.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;

import com.ycz.yuechaomarket.R;
import com.ycz.yuechaomarket.base.service.BaseIntentService;
import com.ycz.yuechaomarket.base.service.BaseService;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        findViewById(R.id.startService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent service = new Intent(StartActivity.this, BaseService.class);
                startService(service);
            }
        });

        findViewById(R.id.stopService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent service = new Intent(StartActivity.this, BaseService.class);
                stopService(service);
            }
        });

        findViewById(R.id.bindService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent service = new Intent(StartActivity.this, BaseService.class);
                bindService(service, connection, BIND_AUTO_CREATE);
            }
        });

        findViewById(R.id.unbindService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unbindService(connection);
            }
        });

        findViewById(R.id.startIntentService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent service = new Intent(StartActivity.this, BaseIntentService.class);
                startService(service);
            }
        });

        findViewById(R.id.stopIntentService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent service = new Intent(StartActivity.this, BaseIntentService.class);
                stopService(service);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.d(BaseService.TAG," onServiceConnected...");
            ((BaseService.MyIBinder)service).download();
            //测试提交
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d("ComponentName:",name.toString());
        }
    };


}
