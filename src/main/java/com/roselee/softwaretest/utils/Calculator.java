package com.roselee.softwaretest.utils;

/**
 * @author RoseLee
 * @date 2025/7/23 20:37
 */
public class Calculator {
    // 加法
    public int add(int a, int b) {
        return a + b;
    }

    // 除法
    public double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("除数不能为零");
        }
        return (double) dividend / divisor;
    }
    // 递归计算斐波那契数列
    public static int fib(int n) {
        if (n <= 0) throw new IllegalArgumentException("n 必须 >= 1");
        if (n == 1 || n == 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
