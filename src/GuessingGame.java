import java.util.Scanner;
public class GuessingGame {
    private int numberToGuess = 3;
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.startGame();
    }
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        while (guess != numberToGuess) {
            System.out.println("Probeer jij het getal eens te raden? Voer een getal van 1 t.e.m. 10 in:");
            guess = scanner.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Je hebt het juiste getal geraden.");
            } else {
                System.out.println("Dat is niet correct. Probeer het nog eens.");
            }
        }
        scanner.close();
    }
}
