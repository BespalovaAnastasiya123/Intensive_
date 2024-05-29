package Lesson_4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1:");
        printThreeWords();
        System.out.println("Задача 2:");
        checkSumSign(5, 10);
        System.out.println("Задача 3:");
        printColor(7);
        System.out.println("Задача 4:");
        compareNumber(8, -1);
        System.out.println("Задача 5:");
        System.out.println(checkSumNumber(-2, 9));
        System.out.println("Задача 6:");
        valueNumber(-1);
        System.out.println("Задача 7:");
        System.out.println(checkValueNumber(-1));
        System.out.println("Задача 8:");
        writeMethod("Improve yourself!", 5);
        System.out.println("Задача 9:");
        System.out.println(checkLeapYear(2024));
        System.out.println("Задача 10:");
        arrayChange();
        System.out.println("Задача 11:");
        fullArray();
        System.out.println("Задача 12:");
        checkArray();
        System.out.println("Задача 13:");
        fullDoubleArray(4);
        System.out.println("Задача 14:");
        System.out.println(Arrays.toString(oneArray(7, 3)));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumber(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumNumber(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void valueNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkValueNumber(int a) {
        return a < 0;
    }

    public static void writeMethod(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean checkLeapYear(int a) {
        return (a % 4 == 0 || a % 400 == 0) && a % 100 != 0;
    }

    public static void arrayChange() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fullArray() {
        int[] arr = new int[100];
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void checkArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fullDoubleArray(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                arr[i][n - 1 - i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] oneArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
