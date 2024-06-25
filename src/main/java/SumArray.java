public class SumArray {
    public static int sumOfArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
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
