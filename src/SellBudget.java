import java.util.Scanner;

public class SellBudget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een bedrag in: ");
        int amount = scanner.nextInt();
        System.out.print("Geef je winstpercentage in: ");
        int profit = scanner.nextInt();
        double result = amount + (amount * profit / 100);
        System.out.println("het eindbedrag is: " + result);
    }
}
