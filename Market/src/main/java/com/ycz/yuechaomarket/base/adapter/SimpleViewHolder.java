package com.ycz.yuechaomarket.base.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zhangzeyan on 15/10/9.
 */
public class SimpleViewHolder {

    private SparseArray<View> mViews;
    private View mConvertView;


    public static SimpleViewHolder getViewHolder(Context context, int layoutId, ViewGroup parent, View mConvertView) {
        return mConvertView == null ? new SimpleViewHolder(context, layoutId, parent) : (SimpleViewHolder) mConvertView.getTag();
    }

    private SimpleViewHolder(Context context, int layoutId, ViewGroup parent) {
        mViews = new SparseArray<>();
        mConvertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        mConvertView.setTag(this);
    }

    public View getConvertView() {
        return mConvertView;
    }

    public <T extends View> T getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }
}