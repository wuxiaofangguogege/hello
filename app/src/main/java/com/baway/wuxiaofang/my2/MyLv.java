package com.baway.wuxiaofang.my2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * desc:
 * author:吴晓芳
 * date:
 */

public class MyLv extends ListView {
    public MyLv(Context context) {
        super(context);
    }

    public MyLv(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLv(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
