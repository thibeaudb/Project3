import java.util.Scanner;
public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoeveel getallen wil je ingeven : ");
        int number = scanner.nextInt();
        int[] values = new int[number];
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < values.length; i++) {
            System.out.print("Geef getal " + (i + 1) + " " + "in: ");
            values[i] = scanner.nextInt();
            for (int value : values) {
                if (value / 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }
        System.out.println("Je hebt " + evenCount + " even nummers en " + oddCount + " oneven nummers.");
    }
}

