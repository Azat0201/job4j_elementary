package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        int abs_i;
        int half_size = size / 2;
        for (int i = -half_size; i <= half_size; i++) {
            abs_i = Math.abs(i);
            System.out.print(" ".repeat(half_size - abs_i) + "0");
            if (i != 0)
                System.out.print(" ".repeat(abs_i * 2 - 1) + "0");
            System.out.println(" ".repeat(half_size - abs_i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(4);
        System.out.println("Draw by 5");
        draw(5);
    }
}