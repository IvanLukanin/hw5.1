import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        // Пункт 1
        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        // Пункт 2
        double[] strong = {1.57d, 7.654d, 9.986d};
        // Пункт 3
        char[] weight = {62, 72, 15, 16, 96, 26};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        double[] strong = {1.57d, 7.654d, 9.986d};
        int[] weight = {62, 72, 15, 16, 96, 26};

        for (int i = 0; i < apple.length; i++) {
            System.out.print(apple[i]);
            if (i != apple.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < strong.length; i++) {
            System.out.print(strong[i]);
            if (i != strong.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        double[] strong = {1.57d, 7.654d, 9.986d};
        int[] weight = {62, 72, 15, 16, 96, 26};

        for (int i = apple.length - 1; i >= 0; i--) {
            System.out.print(apple[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = strong.length - 1; i >= 0; i--) {
            System.out.print(strong[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] apple = {1, 2, 3};

        for (int i = 0; i < apple.length; i++) {
            if (apple[i] % 2 != 0) {
                apple[i] += 1;
            }
        }
        System.out.println(Arrays.toString(apple));
    }
}
