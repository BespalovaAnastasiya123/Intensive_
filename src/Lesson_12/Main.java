package Lesson_12;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1122", "2213", "5598", "899098"},
                {"1209", "4563", "4256", "23457"},
                {"83244", "45002", "716734", "567"},
                {"397", "52751", "3714", "6127"}
        };
        try {
            int sum = arrayInfo(array);
            System.out.println("Сумма элементов массива равна "+ sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int arrayInfo(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива: количество строк не равно четырем");
        }
        for (String[] gopa : array) {
            if (gopa.length != 4) {
                throw new MyArraySizeException("Неверный размер массива: количество столбцов не равно четырем");
            }
        }
        int sum = 0;
        for (String[] strings : array) {
            for (String string : strings) {
                try {
                    sum += Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный формат элемента массива");
                }
            }
        }
        return sum;
    }
}
    

    

