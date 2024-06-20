package Lesson_14;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static long factorial(int value) {
        long result = 1;
        if (value < 0) {
            System.out.println("Число дожно быть не отрицательным");
        } else if (value == 0) {
            return 1;
        } else {
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
        }
        return result;
    }
}
