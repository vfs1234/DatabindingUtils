package org.simpleworld.androidbindingutil.measure;

import android.databinding.BindingAdapter;
import android.view.View;

/**
 * Padding相关Adapter
 * Created by Yafei on 2017/5/10.
 */

public class MarginUtil {

    /**
     * 为了直接设置px准备
     * @param view
     * @param padding
     */
    @BindingAdapter("android:paddingLeft")
    public static void setPaddingLeft(View view, int padding) {
        view.setPadding(padding,
                view.getPaddingTop(),
                view.getPaddingRight(),
                view.getPaddingBottom());
    }

    /**
     * 为dimens准备
     * @param view
     * @param padding
     */
    @BindingAdapter("android:paddingLeft")
    public static void setPaddingLeft(View view, float padding) {
        view.setPadding((int) padding,
                view.getPaddingTop(),
                view.getPaddingRight(),
                view.getPaddingBottom());
    }


    /**
     * 为了直接设置px准备
     * @param view
     * @param padding
     */
    @BindingAdapter("android:paddingRight")
    public static void setPaddingRight(View view, int padding) {
        view.setPadding(view.getPaddingLeft(),
                view.getPaddingTop(),
                padding,
                view.getPaddingBottom());
    }

    /**
     * 为dimens准备
     * @param view
     * @param padding
     */
    @BindingAdapter("android:paddingRight")
    public static void setPaddingRight(View view, float padding) {
        view.setPadding(view.getPaddingLeft(),
                view.getPaddingTop(),
                (int) padding,
                view.getPaddingBottom());
    }


    /**
     * 为了直接设置px准备
     * @param view
     * @param padding
     */
    @BindingAdapter("android:paddingTop")
    public static void setPaddingTop(View view, int padding) {
        view.setPadding(view.getPaddingLeft(),
                padding,
                view.getPaddingRight(),
                view.getPaddingBottom());
    }

    /**
     * 为dimens准备
     * @param view
     * @param padding
     */
    @BindingAdapter("android:paddingTop")
    public static void setPaddingTop(View view, float padding) {
        view.setPadding(view.getPaddingLeft(),
                (int) padding,
                view.getPaddingRight(),
                view.getPaddingBottom());
    }

    /**
     * 为了直接设置px准备
     * @param view
     * @param padding
     */
    @BindingAdapter("android:paddingBottom")
    public static void setPaddingBottom(View view, int padding) {
        view.setPadding(view.getPaddingLeft(),
                view.getPaddingTop(),
                view.getPaddingRight(),
                padding);
    }

    /**
     * 为dimens准备
     * @param view
     * @param padding
     */
    @BindingAdapter("android:paddingBottom")
    public static void setPaddingBottom(View view, float padding) {
        view.setPadding(view.getPaddingLeft(),
                view.getPaddingTop(),
                view.getPaddingRight(),
                (int) padding);
    }
}
