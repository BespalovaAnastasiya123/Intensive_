public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1122", "2213", "5598", "8998"},
                {"1209", "456ik3", "425996", "2457"},
                {"83244", "45002", "716734", "567"},
                {"397", "52752", "36714", "6127"}
        };
        try {
            int sum = SumArray.sumOfArray(array);
            System.out.println("Сумма элементов массива равна " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
    

    

