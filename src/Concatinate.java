public class Concatinate {
    public static void main(String[] args) {
        String[] array1 = {"Maxim", "Seppe", "Kamiel"};
        String[] array2 = {"Thibeau", "Kjento", "Davino"};
        String[] combinedArray = combineArrays(array1, array2);
        printArray(combinedArray);
    }
    private static String[] combineArrays(String[] arr1, String[] arr2) {
        int length = arr1.length + arr2.length;
        String[] result = new String[length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
    private static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
