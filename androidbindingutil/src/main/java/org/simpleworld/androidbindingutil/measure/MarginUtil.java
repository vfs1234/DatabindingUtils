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
    public static void setMarginLeft(View view, int margin) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        lp.setMargins(margin
                , lp.topMargin
                , lp.rightMargin
                , lp.bottomMargin);
        view.setLayoutParams(lp);
    }

    /**
     * 为了直接设置px准备
     * @param view
     * @param margin
     */
    @BindingAdapter("android:layout_marginLeft")
    public static void setMarginLeft(View view, float margin) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        lp.setMargins((int) margin
                , lp.topMargin
                , lp.rightMargin
                , lp.bottomMargin);
        view.setLayoutParams(lp);
    }


    /**
     * 为了直接设置px准备
     * @param view
     * @param margin
     */
    @BindingAdapter("android:layout_marginRight")
    public static void setMarginRight(View view, int margin) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        lp.setMargins(lp.leftMargin
                , lp.topMargin
                , margin
                , lp.bottomMargin);
        view.setLayoutParams(lp);
    }

    /**
     * 为了直接设置px准备
     * @param view
     * @param margin
     */
    @BindingAdapter("android:layout_marginRight")
    public static void setMarginRight(View view, float margin) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        lp.setMargins(lp.leftMargin
                , lp.topMargin
                , (int) margin
                , lp.bottomMargin);
        view.setLayoutParams(lp);
    }

    /**
     * 为了直接设置px准备
     * @param view
     * @param margin
     */
    @BindingAdapter("android:layout_marginTop")
    public static void setMarginTop(View view, int margin) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        lp.setMargins(lp.leftMargin
                , margin
                , lp.rightMargin
                , lp.bottomMargin);
        view.setLayoutParams(lp);
    }

    /**
     * 为了直接设置px准备
     * @param view
     * @param margin
     */
    @BindingAdapter("android:layout_marginTop")
    public static void setMarginTop(View view, float margin) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        lp.setMargins(lp.leftMargin
                , (int) margin
                , lp.rightMargin
                , lp.bottomMargin);
        view.setLayoutParams(lp);
    }


    /**
     * 为了直接设置px准备
     * @param view
     * @param margin
     */
    @BindingAdapter("android:layout_marginBottom")
    public static void setMarginBottom(View view, int margin) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        lp.setMargins(lp.leftMargin
                , lp.topMargin
                , lp.rightMargin
                , margin);
        view.setLayoutParams(lp);
    }

    /**
     * 为了直接设置px准备
     * @param view
     * @param margin
     */
    @BindingAdapter("android:layout_marginBottom")
    public static void setMarginBottom(View view, float margin) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        lp.setMargins(lp.leftMargin
                , lp.topMargin
                , lp.rightMargin
                , (int) margin);
        view.setLayoutParams(lp);
    }

    /**
     * 为了直接设置px准备
     * @param view
     * @param margin
     */
    @BindingAdapter("android:layout_margin")
    public static void setMargin(View view, int margin) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        lp.setMargins(margin
                , margin
                , margin
                , margin);
        view.setLayoutParams(lp);
    }

    /**
     * 为了直接设置px准备
     * @param view
     * @param margin
     */
    @BindingAdapter("android:layout_margin")
    public static void setMargin(View view, float margin) {
        ViewGroup.MarginLayoutParams lp = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        lp.setMargins((int) margin
                , (int) margin
                , (int) margin
                , (int) margin);
        view.setLayoutParams(lp);
    }

}
