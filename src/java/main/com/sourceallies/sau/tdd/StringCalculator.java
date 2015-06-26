package com.sourceallies.sau.tdd;

public class StringCalculator {
    public String add(String input) {
        if ("".equals(input)) {
            return "0";
        }
        String[] stringsToAdd = input.split(",");
        int sum = 0;
        for (String oneNumber : stringsToAdd){
            if ("".equals(oneNumber)) {
                continue;
            }
            int num = Integer.valueOf(oneNumber);
            sum += num;
        }
        return String.valueOf(sum);

    }
}
