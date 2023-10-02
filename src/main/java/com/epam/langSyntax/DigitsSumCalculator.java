package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int x = number / 1000;
        int y = (number - x*1000) / 100;
        int z = (number - x*1000 - y*100) / 10;
        int u = number % 10;

        System.out.println(x + y + z + u);
    }
}
