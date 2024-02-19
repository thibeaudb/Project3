import java.util.Scanner;
public class SearchNrInArray {
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
        System.out.println("Geef een getal in: ");
        int number = scanner.nextInt();
        boolean present = false;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (matthias[i][j] == number) {
                    present = true;
                }
            }
        }
        if(present) {
            System.out.println("Het getal is aanwezig. " );
        }
        else if(!present) {
            System.out.println("Het getal is niet aanwezig. ");
        }
    }
}

