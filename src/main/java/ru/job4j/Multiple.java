package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int factor = 1;
            int result = factor * i;
            System.out.printf("1 * %d = %d%n", result, result);
        }
    }
}
