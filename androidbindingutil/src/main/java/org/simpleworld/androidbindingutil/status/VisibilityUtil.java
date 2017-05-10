package org.simpleworld.androidbindingutil.status;

import android.databinding.BindingAdapter;
import android.view.View;

/**
 * Created by Yafei on 2017/5/10.
 */

public class VisibilityUtil {
    /**
     * 根据boolean判断是否显示，简化部分xml操作
     * @param view
     * @param visible
     */
    @BindingAdapter("android:visibility")
    public static void setPaddingLeft(View view, boolean visible) {
        if (visible){
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.GONE);
        }
    }
}
