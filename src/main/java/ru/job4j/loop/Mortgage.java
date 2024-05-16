package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        percent = 1 + percent / 100;
        if (amount == 0) {
            return 0;
        }
        if (amount * percent - amount >= salary) {
            return -1;
        }
        int year = 0;
        while (amount > 0) {
            amount = amount * percent - salary;
            year++;
        }
        return year;
    }
}