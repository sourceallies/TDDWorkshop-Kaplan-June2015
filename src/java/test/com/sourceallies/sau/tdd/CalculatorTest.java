package com.sourceallies.sau.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Mock
    private StringCalculator stringCalculator;

    @InjectMocks
    private Calculator calculator;

    @Test
    public void testCalculatorCallsStringCalculator(){
        String input = "1,3";
        String sum = "4";

        when(stringCalculator.add(input)).thenReturn(sum);

        assertEquals(sum, calculator.add(input));

        verify(stringCalculator).add(input);
    }
}
