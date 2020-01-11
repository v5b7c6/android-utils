package com.v5b7c6.android.utils;

public class DisplayUtils {

    /**
     * 将px值转换为dip或dp值，保证尺寸大小不变
     */
    public static float px2dip(float pxValue) {
        final float scale = Utils.getApp().getResources().getDisplayMetrics().density;
        return (pxValue / scale);
    }

    /**
     * 将dip或dp值转换为px值，保证尺寸大小不变，类似Context.getDimension方法
     */
    public static float dip2px(float dipValue) {
        final float scale = Utils.getApp().getResources().getDisplayMetrics().density;
        return (dipValue * scale);
    }

    /**
     * 将px值转换为sp值，保证文字大小不变
     */
    public static int px2sp(float pxValue) {
        final float fontScale = Utils.getApp().getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale);
    }

    /**
     * 将sp值转换为px值，保证文字大小不变
     */
    public static int sp2px(float spValue) {
        final float fontScale = Utils.getApp().getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale);
    }

}
