public class SortRows {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 10, 1, 9, 7, 4, 2, 8, 6};
        System.out.println("Normale volgorde: ");
        System.out.print(numbers);

        sortrows(numbers);

        System.out.println("Gesorteerde volgorde: ");
        System.out.println(numbers);
    }
    static void sortrows(int[] array) {
        int rowLength = array.length;
        int lowestNumber = 200;
        int lowestNumberIndex = 0;
        for (int i = 0; i < rowLength; i++) {
            if (lowestNumber > array[i]) {
                lowestNumber = array[i];
                lowestNumberIndex = i;

            }
        }
        array[lowestNumberIndex] = array[0];
        array[0] = lowestNumber;
    }
}
