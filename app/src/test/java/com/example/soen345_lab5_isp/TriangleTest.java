package com.example.soen345_lab5_isp;

import static org.junit.Assert.*;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testValidTriangle() {
        assertTrue("Expected to be a valid triangle", MainActivity.isTriangle(60, 60, 60));
    }

    @Test
    public void testNegativeAngle() {
        assertFalse("Expected to be invalid due to a negative angle", MainActivity.isTriangle(-10, 90, 100));
    }

    @Test
    public void testSumLessThan180() {
        assertFalse("Expected to be invalid due to sum < 180", MainActivity.isTriangle(50, 60, 60));
    }

    @Test
    public void testSumMoreThan180() {
        assertFalse("Expected to be invalid due to sum > 180", MainActivity.isTriangle(90, 90, 10));
    }
}
