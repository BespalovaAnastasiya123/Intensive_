package Lesson_14.entities;
import java.lang.IllegalArgumentException;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static long factorial(int value) {
        long result = 1;
        if (value < 0) {
            throw new IllegalArgumentException("Число дожно быть не отрицательным");
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
