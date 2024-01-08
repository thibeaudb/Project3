import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef het eerste nummer in: ");
        int number1 = scanner.nextInt();
        System.out.print("Geef het tweede nummer in: ");
        int number2 = scanner.nextInt();
        System.out.print("Geef het derde nummer in: ");
        int number3 = scanner.nextInt();
        double average = (number1 + number2 + number3) / 3;
        System.out.print(average);
    }
}
