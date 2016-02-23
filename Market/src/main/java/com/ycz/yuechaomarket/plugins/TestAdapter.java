package com.ycz.yuechaomarket.plugins;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.ycz.yuechaomarket.R;

/**
 * Created by zhangzeyan on 16/1/15.
 */
public class TestAdapter extends BaseAdapter {

    private Context context;

    public TestAdapter(Context context){
        this.context = context;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.activity_start,null);
    }

    public class ViewHolder {
        public final Button startService;
        public final Button stopService;
        public final Button bindService;
        public final Button unbindService;
        public final Button startIntentService;
        public final Button stopIntentService;
        public final View root;

        public ViewHolder(View root) {
            startService = (Button) root.findViewById(R.id.startService);
            stopService = (Button) root.findViewById(R.id.stopService);
            bindService = (Button) root.findViewById(R.id.bindService);
            unbindService = (Button) root.findViewById(R.id.unbindService);
            startIntentService = (Button) root.findViewById(R.id.startIntentService);
            stopIntentService = (Button) root.findViewById(R.id.stopIntentService);
            this.root = root;
        }
    }
}
