package com.ycz.yuechaomarket.view;

/**
 * Created by zhangzeyan on 16/3/9.
 */


import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.utils.AutoLayoutHelper;

/**
 * Created by zhy on 15/12/8.
 */
public class AutoScrollView extends ScrollView
{
    private final AutoLayoutHelper mHelper = new AutoLayoutHelper(this);

    public AutoScrollView(Context context)
    {
        super(context);
    }

    public AutoScrollView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public AutoScrollView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public AutoFrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs)
    {
        return new AutoFrameLayout.LayoutParams(getContext(), attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        if (!isInEditMode())
        {
            mHelper.adjustChildren();
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


}
