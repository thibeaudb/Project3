import java.util.Scanner;
public class Sums {
    public static void main(String[] ars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoe groot moet de rij zijn?");
        int length = scanner.nextInt();
        System.out.println("Hoe breed moet de rij zijn?");
        int width = scanner.nextInt();
        int[][] matthias = new int[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Geef volgend element in:");
                matthias[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        System.out.println(sum);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                sum += matthias[i][j];
            }
        }
        System.out.println(sum);
    }
}

