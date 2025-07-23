package com.roselee.softwaretest.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author RoseLee
 * @date 2025/7/23 20:40
 */
public class ArrayUtilTest {
    @Test
    public void testFindMax() {
        int[] arr = {3, 7, 1, 9, 5};
        assertEquals(9, ArrayUtil.findMax(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithNull() {
        ArrayUtil.findMax(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmpty() {
        ArrayUtil.findMax(new int[0]);
    }

    @Test
    public void testSort() {
        int[] arr = {5, 3, 8, 1};
        int[] sorted = ArrayUtil.sort(arr);
        assertArrayEquals(new int[]{1, 3, 5, 8}, sorted);
        // 原数组不应被修改
        assertArrayEquals(new int[]{5, 3, 8, 1}, arr);
    }

    @Test
    public void testSortWithNull() {
        assertNull(ArrayUtil.sort(null));
    }
}