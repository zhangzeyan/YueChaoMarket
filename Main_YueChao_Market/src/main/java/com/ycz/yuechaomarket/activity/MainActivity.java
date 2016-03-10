package com.ycz.yuechaomarket.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.ycz.yuechaomarket.R;
import com.zhy.autolayout.AutoLayoutActivity;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.yuechao_main)
public class MainActivity extends AutoLayoutActivity {

    @ViewById
    TextView viewTxt;
    @ViewById
    TextView dataTxt;
    @ViewById
    TextView networkTxt;
    @ViewById
    TextView modelTxt;

    @Click({R.id.viewTxt,R.id.dataTxt})
    public void myClick(View view){
        switch (view.getId()){
            case R.id.viewTxt:
                startActivity(new Intent(this,ViewActivity_.class));
                break;
            case R.id.dataTxt:
                startActivity(new Intent(this,ViewActivity_.class));
                break;
            case R.id.networkTxt:
                break;
            case R.id.modelTxt:
                break;
        }

    }
}
