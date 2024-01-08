import java.util.Scanner;
public class CarConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("geef het aantal kilometers in: ");
        double kilometers = scanner.nextDouble();
        System.out.print("geef de hoeveelheid liter in: ");
        double liters = scanner.nextDouble();

        double consumption = (liters / kilometers) * 100;
        System.out.print("de consumptie van u voertuig is:" + consumption + ".");
    }
}
