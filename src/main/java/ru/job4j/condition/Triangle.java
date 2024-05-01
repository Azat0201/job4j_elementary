package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return Math.max(ab, Math.max(ac, bc)) < (ab + ac + bc) / 2;
    }
}