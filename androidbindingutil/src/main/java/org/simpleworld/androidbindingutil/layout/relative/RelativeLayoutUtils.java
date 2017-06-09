package org.simpleworld.androidbindingutil.layout.relative;

import android.databinding.BindingAdapter;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Relative-layout\attributes support
 * Created by Yafei on 2017/6/9.
 */

public class RelativeLayoutUtils {

    /**
     * layout_centerVertical with a boolean
     * @param view
     * @param center
     */
    @BindingAdapter("android:layout_centerInParent")
    public static void setCenterInParent(View view, boolean center) {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (center){
            //add rule default value=0
            params.addRule(RelativeLayout.CENTER_IN_PARENT);
        } else {
            params.addRule(RelativeLayout.CENTER_IN_PARENT, 0);
        }
    }


    /**
     * layout_centerVertical with a boolean
     * @param view
     * @param center
     */
    @BindingAdapter("android:layout_centerVertical")
    public static void setCenterVertical(View view, boolean center) {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (center){
            params.addRule(RelativeLayout.CENTER_VERTICAL);
        } else {
            params.addRule(RelativeLayout.CENTER_VERTICAL, 0);
        }
    }

    /**
     * layout_centerVertical with a boolean
     * @param view
     * @param center
     */
    @BindingAdapter("android:layout_centerHorizontal")
    public static void setCenterHorizontal(View view, boolean center) {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view.getLayoutParams();
        if (center){
            params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        } else {
            params.addRule(RelativeLayout.CENTER_HORIZONTAL, 0);
        }
    }


    /**
     * layout_toLeftOf with layout view id
     * @param view
     * @param id
     */
    @BindingAdapter("android:layout_toLeftOf")
    public static void setLeftOf(View view, int id) {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view.getLayoutParams();
        params.addRule(RelativeLayout.LEFT_OF, id);
    }



    /**
     * layout_toRightOf with layout view id
     * @param view
     * @param id
     */
    @BindingAdapter("android:layout_toRightOf")
    public static void setRightOf(View view, int id) {
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) view.getLayoutParams();
        params.addRule(RelativeLayout.RIGHT_OF, id);
    }
}
