package com.ycz.yuechaomarket.base.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by zhangzeyan on 15/10/9.
 */
public abstract class SimpleBaseAdapter extends BaseAdapter {

    protected Context mContext;
    protected List<?> mList;
    protected int mPosition;
    protected SimpleViewHolder viewHolder;

    public SimpleBaseAdapter(Context context, List<?> list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        mPosition = position;
        viewHolder = SimpleViewHolder.getViewHolder(mContext, getLayout(), parent, convertView);
        initEvent(mList.get(position));
        return viewHolder.getConvertView();
    }

    protected abstract int getLayout();

    protected abstract  void initEvent(Object object);

}
