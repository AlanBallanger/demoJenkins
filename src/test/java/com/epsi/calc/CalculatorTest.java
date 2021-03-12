package com.epsi.calc;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {
        int a01 = 2;
        int b01 = 3;

        Calculator calc = new Calculator();
        int actual = calc.add(a01, b01);

        assertEquals(5, actual);
    }

    @Test
    public void testSub() {
        int a01 = 3;
        int b01 = 2;

        Calculator calc = new Calculator();
        int actual = calc.sub(a01, b01);

        assertEquals(1, actual);
    }
}