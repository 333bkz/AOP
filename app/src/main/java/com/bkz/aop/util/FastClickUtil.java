package com.bkz.aop.util;

public class FastClickUtil {
    private static long lastClickTime = 0;
    private final static int SPACE_TIME = 500;

    public synchronized static boolean isFastClick() {
        long currentTime = System.currentTimeMillis();
        boolean isClick2;
        isClick2 = currentTime - lastClickTime <= SPACE_TIME;
        lastClickTime = currentTime;
        return isClick2;
    }
}
