package ru.job4j.loop;
public class Counter {
    public static int sum(int start, int finish) {
        if (start > finish) {
            return 0;
        }
        return (finish + start) * (finish - start + 1) / 2;
    }

    public static int sumByEven(int start, int finish) {
        if (start > finish) {
            return 0;
        }
        start = start % 2 == 0 ? start : start + 1;
        finish = finish % 2 == 0 ? finish : finish - 1;
        return (start + finish) * ((finish - start) / 2 + 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}