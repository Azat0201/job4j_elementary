package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        if (start > finish) {
            return 0;
        }
        return (finish + start) * (finish - start + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(-2, 5));
        System.out.println(sum(0, 100));
    }
}