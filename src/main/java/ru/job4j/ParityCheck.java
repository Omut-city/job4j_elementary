package ru.job4j;

/**
 * Проверка четности числа
 *
 * git commit --amend
 */
public class ParityCheck {
    public static void main(String[] args) {
        System.out.println("Parity Check");

        for (int i = 0; i < 10; i++) {
            printParityCheck(i);
        }

        try {
            System.out.println("Parity Check for three number " + args[0] + " is: " + parityCheck(Integer.parseInt(args[0])));
            throw new RuntimeException("Exception");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

    private static boolean parityCheck(int n) {
        return n % 2 == 0;
    }

    private static void printParityCheck(int a) {
        System.out.println("Parity Check for two number " + a + " is: " + parityCheck(a));
    }
}
