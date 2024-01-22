public class ArrayAnalysis {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int zerocount = 0;
        int[] row = new int[100];
        for (int i = 0; i < row.length; i++) {
            row[i] = (int) (Math.random() * 100.0 - 50.0);
            if (row[i] > 0) {
                positive ++;
            }
            if (row[i] < 0) {
                negative ++;
            }
            if (row[i] == 0) {
                zerocount ++;
            }
        }
        System.out.println("Er zijn " + positive + " positieve getallen");
        System.out.println("Er zijn " + negative + " negatieve getallen");
        System.out.println("Er zijn " + zerocount + " nullen");
    }
}
