package com.ycz.yuechaomarket.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ycz.yuechaomarket.R;
import com.ycz.yuechaomarket.base.service.BaseService;
import com.zhy.autolayout.AutoLayoutActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.yuechao_start)
public class ServiceSample extends AutoLayoutActivity {


    @ViewById
    Button startService;
    @ViewById
    Button stopService;
    @ViewById
    Button bindService;
    @ViewById
    Button unbindService;
    @ViewById
    Button startIntentService;
    @ViewById
    Button stopIntentService;


    @Click({R.id.startService,R.id.unbindService})
    void abc(View view){
        switch (view.getId()){
            case R.id.startService:
                Toast.makeText(this, "你好", Toast.LENGTH_SHORT).show();
                break;
            case R.id.unbindService:
                Toast.makeText(this, "你好2", Toast.LENGTH_SHORT).show();
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.yuechao_start);

//        findViewById(R.id.startService).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent service = new Intent(ServiceSample.this, BaseService.class);
//                startService(service);
//            }
//        });
//
//        findViewById(R.id.stopService).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent service = new Intent(ServiceSample.this, BaseService.class);
//                stopService(service);
//            }
//        });
//
//        findViewById(R.id.bindService).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent service = new Intent(ServiceSample.this, BaseService.class);
//                bindService(service, connection, BIND_AUTO_CREATE);
//            }
//        });
//
//        findViewById(R.id.unbindService).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                unbindService(connection);
//            }
//        });
//
//        findViewById(R.id.startIntentService).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent service = new Intent(ServiceSample.this, BaseIntentService.class);
//                startService(service);
//            }
//        });
//
//        findViewById(R.id.stopIntentService).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent service = new Intent(ServiceSample.this, BaseIntentService.class);
//                stopService(service);
//            }
//        });

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
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.d("ComponentName:",name.toString());
        }
    };


}
