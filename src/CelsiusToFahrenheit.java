import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer de temperatuur in Celsius in: ");
        double celsiusTemperature = scanner.nextDouble();

        System.out.println("De temperatuur in celsius is: " + celsiusTemperature);
        System.out.println("De temperatuur in Fahrenheit is: " + celsiusToFahrenheit(celsiusTemperature));

    }
     static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8 ) + 32;
    }
}
