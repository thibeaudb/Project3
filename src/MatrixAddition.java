import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wat is de lengte?");
        int length = scanner.nextInt();
        System.out.println("Wat is de breedte?");
        int width = scanner.nextInt();
        int[][] matrix1 = new int[length][width];
        int[][] matrix2 = new int[length][width];
        int[][] matrix3 = new int[length][width];
        for(int i = 0; i < matrix1.length; i++ ) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.println("Geef de elementen in van Matrix1:");
                    matrix1[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < matrix2.length; i++ ) {
            for (int j = 0; j < matrix2[0].length; j++) {
                System.out.println("Geef de elementen in van Matrix2:");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < matrix3.length; i++ ) {
            for (int j = 0; j < matrix3[0].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }
}
