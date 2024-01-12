import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer de temperatuur in fahrenheit in: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5 / 9) *(fahrenheit - 32);
        
    }
}

