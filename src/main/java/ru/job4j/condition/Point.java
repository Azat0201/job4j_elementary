package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(5, 3, 6, 3);
        System.out.println("result (5, 3) to (6, 3) " + result);
        result = Point.distance(-5, 10, -5, -15);
        System.out.println("result (-5, 10) to (-5, -15) " + result);
    }
}