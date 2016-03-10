package com.ycz.yuechaomarket.base.adapter;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zhangzeyan on 15/10/9.
 */
public abstract class SimpleViewAdapter extends SimpleBaseAdapter {

    public SimpleViewAdapter(Context context, List<?> list) {
        super(context, list);
    }

    /**
     * 根据id获取View对象
     * @param viewId
     * @return
     */
    protected View getView(int viewId) {
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取TextView对象
     * @param viewId
     * @return
     */
    protected TextView getTextView(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取Button对象
     * @param viewId
     * @return
     */
    protected Button getButton(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取EditText对象
     * @param viewId
     * @return
     */
    protected EditText getEditText(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取ImageView对象
     * @param viewId
     * @return
     */
    protected ImageView getImageView(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取ProgressBar对象
     * @param viewId
     * @return
     */
    protected ProgressBar getProgressBar(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取RatingBar对象
     * @param viewId
     * @return
     */
    protected RatingBar getRatingBar(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取RadioGroup对象
     * @param viewId
     * @return
     */
    protected RadioGroup getRadioGroup(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取RadioButton对象
     * @param viewId
     * @return
     */
    protected RadioButton getRadioButton(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取CheckBox对象
     * @param viewId
     * @return
     */
    protected CheckBox getCheckBox(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取LinearLayout对象
     * @param viewId
     * @return
     */
    protected LinearLayout getLinearLayout(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取RelativeLayout对象
     * @param viewId
     * @return
     */
    protected RelativeLayout getRelativeLayout(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取FrameLayout对象
     * @param viewId
     * @return
     */
    protected FrameLayout getFrameLayout(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取GridView对象
     * @param viewId
     * @return
     */
    protected GridView getGridView(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取ListView对象
     * @param viewId
     * @return
     */
    protected ListView getListView(int viewId){
        return viewHolder.getView(viewId);
    }

    /**
     * 根据id获取ScrollView对象
     * @param viewId
     * @return
     */
    protected ScrollView getScrollView(int viewId){
        return viewHolder.getView(viewId);
    }
}
