import java.util.Scanner;
public class WordSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] words = {
                {"Thibeau", "autisme", "Maxim"},
                {"davino", "Kjento", "Kamiel"}
        };
        System.out.println("Geef een zoekwoord in:");
        String search = scanner.next();
        boolean found = false;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                if (words[i][j].equalsIgnoreCase(search)) {
                    found = true;
                }
            }
        }
        if (found) {
            System.out.println("Gevonden!");
        } else {
            System.out.println("Niet gevonden.");
        }
    }
}
