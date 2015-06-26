package com.sourceallies.sau.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class StringCalculatorTest {
    @Test
    public void testOnePlusTwo(){
        StringCalculator stringCalculator = new StringCalculator();
        String result = stringCalculator.add("1,2");

        assertEquals("3", result);
    }
    @Test
    public void testNullString(){
        StringCalculator stringCalculator = new StringCalculator();
        try {
            String result = stringCalculator.add(null);
            fail("should not get here");
        } catch (NullPointerException e) {
//            assertTrue(true);
        } catch (Exception e) {
            fail("Expected NullPointerException; Some other exception was thrown");
        }

    }
    @Test
    public void testZeroPlusZero(){
        StringCalculator stringCalculator = new StringCalculator();
        String result = stringCalculator.add("0,0");

        assertEquals("0",result);
    }
    @Test
    public void testFive(){
        String result = callAddMethod("5");

        assertEquals("5",result);
    }
    @Test
    public void testFiveSixSeven(){
        String result = callAddMethod("5,6,7");

        assertEquals("18",result);
    }

    private String callAddMethod(String input) {
        StringCalculator stringCalculator = new StringCalculator();
        return stringCalculator.add(input);
    }

    @Test
    public void testEmptyString(){
        StringCalculator stringCalculator = new StringCalculator();
        String result = stringCalculator.add("");

        assertEquals("0", result);
    }
    @Test
    public void testBlankThenNumber(){
        StringCalculator stringCalculator = new StringCalculator();
        String result = stringCalculator.add(",4");

        assertEquals("4", result);
    }
}
