package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else {
            boolean is_leap_year = false;

            if (year % 4 == 0) {
                is_leap_year = true;
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        is_leap_year = true;
                    else
                        is_leap_year = false;
                }
            }

            if (month == 2) {
                if (is_leap_year) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
            } else if (month % 2 == 1) {
                System.out.println("31");
            } else {
                System.out.println("30");
            }
        }
    }
}
