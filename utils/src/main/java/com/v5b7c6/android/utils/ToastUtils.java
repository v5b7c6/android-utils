package com.v5b7c6.android.utils;

import android.text.TextUtils;
import android.widget.Toast;

public class ToastUtils {

    private static Toast toast = null;

    /**
     * 显示short message
     *
     * @param resId string string资源id
     */
    public static void showShort(int resId) {
        if (resId == 0) return;
        if (toast != null)
            toast.cancel();
        toast = Toast.makeText(Utils.getApp(), resId, Toast.LENGTH_SHORT);
        toast.setText(resId);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * 显示short message
     *
     * @param message 显示消息
     */
    public static void showShort(String message) {
        if (TextUtils.isEmpty(message)) return;
        if (toast != null)
            toast.cancel();
        toast = Toast.makeText(Utils.getApp(), message, Toast.LENGTH_SHORT);
        toast.setText(message);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * 显示long message
     *
     * @param resId string string资源id
     */
    public static void showLong(int resId) {
        if (resId == 0) return;
        if (toast != null)
            toast.cancel();
        toast = Toast.makeText(Utils.getApp(), resId, Toast.LENGTH_LONG);
        toast.setText(resId);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }

    /**
     * 显示long message
     *
     * @param message 显示消息
     */
    public static void showLong(String message) {
        if (TextUtils.isEmpty(message)) return;
        if (toast != null)
            toast.cancel();
        toast = Toast.makeText(Utils.getApp(), message, Toast.LENGTH_LONG);
        toast.setText(message);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }

}
