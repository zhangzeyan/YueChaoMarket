package com.ycz.yuechaomarket.plugins;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;

import com.ycz.yuechaomarket.R;

/**
 * Created by zhangzeyan on 16/1/15.
 */
public class TestActivity extends Activity {

    Button startService;
    Button stopService;
    Button bindService;
    Button unbindService;
    Button startIntentService;
    Button stopIntentService;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.yuechao_start);
    }

    private void initView() {
        startService = (Button) findViewById(R.id.startService);
        stopService = (Button) findViewById(R.id.stopService);
        bindService = (Button) findViewById(R.id.bindService);
        unbindService = (Button) findViewById(R.id.unbindService);
        startIntentService = (Button) findViewById(R.id.startIntentService);
        stopIntentService = (Button) findViewById(R.id.stopIntentService);
    }
}
