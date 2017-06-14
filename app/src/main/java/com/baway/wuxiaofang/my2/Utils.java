package com.baway.wuxiaofang.my2;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * desc:
 * author:吴晓芳
 * date:
 */

public class Utils {
    public void getHeight(ListView listView){
        int total=0;
        ListAdapter adapter = listView.getAdapter();
    if (adapter!=null){
        for (int i = 0; i <adapter.getCount() ; i++) {
            View view = adapter.getView(i, null, listView);
            int height = view.getHeight();
            total+=height;
        }
    }

        ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
    layoutParams.height=total+(listView.getDividerHeight()*adapter.getCount()-1);
    listView.setLayoutParams(layoutParams);
    }
}
