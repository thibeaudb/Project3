import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer de straal van de cilinder in: ");
        double radius = scanner.nextDouble();


        System.out.print("Voer de hoogte van de cilinder in: ");
        double height = scanner.nextDouble();


        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Het volume van de cilinder is: " + volume);
        scanner.close();
    }
}
