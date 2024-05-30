package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int[] arr : array) {
            for (int val : arr) {
                result += val;
            }
        }
        return result;
    }
}