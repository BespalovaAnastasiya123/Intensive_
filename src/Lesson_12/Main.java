package Lesson_12;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1122", "2213", "5598", "899098"},
                {"1209", "4563", "425996", "23457"},
                {"83244", "45002", "716734", "567"},
                {"397", "52751", "36714", "6127"}
        };
        try {
            int sum = arrayInfo(array);
            System.out.println("Сумма элементов массива равна " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int arrayInfo(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неверный размер массива: количество строк не равно четырем");
        }
        for (String[] rows : array) {
            if (rows.length != 4) {
                throw new MyArraySizeException("Неверный размер массива: количество столбцов не равно четырем");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int g = 0; g < array[i][j].length(); g++) {
                    if (!Character.isDigit(array[i][j].charAt(g))) {
                        throw new MyArrayDataException("Некорректные данные в [" + i + "][" + j + "] ячейке массива " +
                                "(в ячейке имеется текст или символы)");
                    }
                }

                try {
                    int number = Integer.parseInt(array[i][j]);
                    sum += number;
                } catch (Exception e) {
                    throw new MyArrayDataException("Некорректные данные в [" + i + "][" + j + "] ячейке массива " +
                            "(невозможно преобразовать в int)");
                }
            }
        }
        return sum;
    }
}
    

    

