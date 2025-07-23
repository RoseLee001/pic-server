package com.roselee.softwaretest.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author RoseLee
 * @date 2025/7/23 20:40
 */
public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(-2, 2));
        assertEquals(-5, calc.add(-2, -3));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2.5, calc.divide(5, 2), 0.001);
        assertEquals(0.5, calc.divide(1, 2), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        calc.divide(5, 0);
    }
    @Test
    public void testFib() {
        assertEquals(1, Calculator.fib(1));
        assertEquals(1, Calculator.fib(2));
        assertEquals(2, Calculator.fib(3));
        assertEquals(3, Calculator.fib(4));
        assertEquals(5, Calculator.fib(5));
        assertEquals(8, Calculator.fib(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFibWithNegative() {
        Calculator.fib(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFibWithZero() {
        Calculator.fib(0);
    }
}