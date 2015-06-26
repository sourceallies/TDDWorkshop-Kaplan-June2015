package com.sourceallies.sau.tdd;

import javax.inject.Inject;

public class Calculator {

    @Inject
    private StringCalculator stringCalculator;

    public String add(String input) {

        return stringCalculator.add(input);
    }
}
