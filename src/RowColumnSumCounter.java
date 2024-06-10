public class RowColumnSumCounter {
    public static void main(String[] args) {
        double[][] myArray = {
                {4.5, 8.5, 9.7, 0, 3.2},
                {6.7, 4.1, 0.9, 0, 6.1},
                {1, 3.2, 9.4, 2, 3.3},
                {4.2, 9, 5.5, 0.2, 3}
        };
        double firstRow = 0;
        for (int j = 0; j < myArray[0].length; j++) {
            firstRow += myArray[0][j];
        }

        System.out.println("De som van de getallen op rij 1 is: " + firstRow);


        double thirdColumn = 0;
        for (int i = 0; i < myArray.length; i++) {
            thirdColumn += myArray[i][2];
        }
        System.out.println("De som van de getallen in kolom 3 is: " + thirdColumn);
    }
}
