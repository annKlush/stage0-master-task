package com.epam.langSyntax;

public class NumberReverter {
    public void revert(int number) {
        int x = number / 100;
        int y = (number - x*100) / 10;
        int z = number % 10;

        System.out.println("" + z + y + x);
    }
}
