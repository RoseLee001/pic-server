package com.roselee.softwaretest.utils;

/**
 * @author RoseLee
 * @date 2025/7/23 20:37
 */
public class StringUtil {
    // 判断字符串是否为空
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    // 反转字符串
    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
}
