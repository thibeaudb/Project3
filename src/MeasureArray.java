import java.util.Scanner;
public class MeasureArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[20];
        System.out.println("Geef 20 positieve getallen in");
        for (int i = 0; i < values.length; i++) {
            System.out.print("Geef getal " + (i + 1) + " " + "in: ");
            values[i] = scanner.nextInt();
        }
        boolean uniqueValues = true;
        for (int j = 0; j < values.length; j++) {
            for (int i = j + 1; i < values.length; i++) {
                if (values[i] == values[j]) {
                    uniqueValues = false;

                }
            }
        }
        if (uniqueValues)
            System.out.println("De getallen zijn uniek. ");

        else System.out.println("Er zijn geen dubbele getallen.");

    }
}
