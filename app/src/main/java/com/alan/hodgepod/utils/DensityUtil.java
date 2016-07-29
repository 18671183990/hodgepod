package com.alan.hodgepod.utils;

import android.content.Context;
import android.util.Log;

/**
 * Created by Administrator on 16-6-8.
 */
public class DensityUtil {

    private static final String TAG = "DensityUtil";

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;

        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;

        Log.d(TAG, "dip2px: " + scale);
        return (int) (pxValue / scale + 0.5f);
    }
}
