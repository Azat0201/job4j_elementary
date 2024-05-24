package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean value = data[0];
        for (boolean v : data) {
            if (v != value) {
                result = false;
                break;
            }
        }
        return result;
    }
}