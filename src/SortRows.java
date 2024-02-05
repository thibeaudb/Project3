import java.util.Arrays;
import java.util.Scanner;
public class SortRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] r = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Geef het Getal " + (i + 1) + " in : ");
            r[i] = scanner.nextInt();
        }
        Arrays.sort(r);
        System.out.println(Arrays.toString(r));
    }
}
