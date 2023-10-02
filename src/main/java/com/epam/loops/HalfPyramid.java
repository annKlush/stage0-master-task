package com.epam.loops;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        String halfPyramid = "";
        for (int i = 1; i <= cathetusLength; i++) {
            String line = "";

            for (int x = 1; x <= cathetusLength-i; x++) {
                line += " ";
            }

            for (int j = i; j >= 1; j--) {
                line += "*";
            }

            halfPyramid += line + "\n";
        }

        System.out.print(halfPyramid);
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
