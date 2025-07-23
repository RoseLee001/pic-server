package com.roselee.softwaretest.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author RoseLee
 * @date 2025/7/23 20:40
 */
public class StringUtilTest {
    @Test
    public void testIsEmpty() {
        assertTrue(StringUtil.isEmpty(null));
        assertTrue(StringUtil.isEmpty(""));
        assertTrue(StringUtil.isEmpty("   "));
        assertFalse(StringUtil.isEmpty("hello"));
    }

    @Test
    public void testReverse() {
        assertNull(StringUtil.reverse(null));
        assertEquals("", StringUtil.reverse(""));
        assertEquals("olleh", StringUtil.reverse("hello"));
        assertEquals("a b c", StringUtil.reverse("c b a"));
    }
}