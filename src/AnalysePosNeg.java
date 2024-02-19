public class AnalysePosNeg {
public static void main(String[] ars) {
    int[][] numbers = new int[30][60];
    for (int i = 0; i < numbers.length; i++) {
        for (int j = 0; j < numbers.length; j++) {
            numbers[i][j] = (int) (Math.random() * 100.0 - 50.0);
        }
    }
    int positive = 0;
    int negative = 0;
    int zeros = 0;
    for (int i = 0; i < numbers.length; i++) {
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[i][j] == 0) {
                zeros++;
            }
            if (numbers[i][j] > 0) {
                positive++;
            }
            if (numbers[i][j] < 0) {
                negative++;
            }
        }
    }
    System.out.println("Het aantal nullen is: " + zeros);
    System.out.println("Het aantal positieve getallen zijn: " + positive);
    System.out.println("Het aantal negatieve getallen zijn: " + negative);
    }
}

