package com.epam.loops;

public class Pyramid {
    public void printPyramid(int cathetusLength) {

        String pyramid = "";
        for (int i = 1; i <= cathetusLength; i++) {
            String line = "";

            for (int x = 1; x <= cathetusLength-i; x++) {
                line += " ";
            }

            for (int j = i; j >= 1; j--) {
                line += j;
            }

            for (int k = 2; k <= i; k++) {
                line += k;
            }

            pyramid += line + "\n";
        }

        System.out.print(pyramid);
    }


    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
