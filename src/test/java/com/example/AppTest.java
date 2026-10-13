package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testFactorialOfFive() {
        App obj = new App();
        assertEquals(120L, obj.factorial(5));
    }

    @Test
    public void testFactorialOfZero() {
        App obj = new App();
        assertEquals(1L, obj.factorial(0));
    }

    @Test
    public void testFactorialOfOne() {
        App obj = new App();
        assertEquals(1L, obj.factorial(1));
    }
}