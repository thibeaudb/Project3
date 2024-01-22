import java.util.Scanner;
public class RowInReverse {
    public static void main(String[] args) {
        RowInReverse r = new RowInReverse();
        r.reverseNumbers();
    }
    public void reverseNumbers() {
        Scanner scanner = new Scanner(System.in);
        int numberOfNumbers = 10;
        int[] numbers = new int[numberOfNumbers];
        System.out.println("Geef de getallen op volgorde in, telkens gevolgd door enter: ");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}



