package org.simpleworld.androidbindingutil.measure;

import android.databinding.BindingAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Yafei on 2017/5/10.
 */

public class MarginUtil {
    /**
     * 为了直接设置px准备
     * @param view
     * @param margin
     */
    @BindingAdapter("android:layout_marginLeft")
    public static void setPaddingLeft(View view, int margin) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        lp.setMargins(margin
                , lp.topMargin
                , lp.rightMargin
                , lp.bottomMargin);
        view.setLayoutParams(lp);
    }

}
