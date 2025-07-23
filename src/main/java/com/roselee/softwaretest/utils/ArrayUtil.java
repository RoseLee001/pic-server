package com.roselee.softwaretest.utils;

import java.util.Arrays;

/**
 * @author RoseLee
 * @date 2025/7/23 20:38
 */
public class ArrayUtil {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("数组不能为空");
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 排序数组
    public static int[] sort(int[] arr) {
        if (arr == null) return null;
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return copy;
    }
}
