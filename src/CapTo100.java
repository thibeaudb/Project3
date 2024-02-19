import java.util.Scanner;
public class CapTo100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hoe groot moet de rij zijn?");
        int length = scanner.nextInt();
        System.out.println("Hoe breed moet de rij zijn?");
        int width = scanner.nextInt();
        int[][] matthias = new int[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                matthias[i][j] = (int) (Math.random() * 1000.0 - 500.0);
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (matthias[i][j] > 100) {
                    matthias[i][j] = 100;
                } else if (matthias[i][j] > -100);
            }
        }
    }
}
