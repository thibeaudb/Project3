import java.util.Random;
import java.util.Scanner;
public class GuessingGameWithArray {
    private int[] numbersToGuess = new int[4];
    public static void main(String[] args) {
        GuessingGameWithArray game = new GuessingGameWithArray();
        game.generateNumbersToGuess();
        game.startGame();
    }

    public void generateNumbersToGuess() {
        Random random = new Random();
        for (int i = 0; i < numbersToGuess.length; i++) {
            numbersToGuess[i] = random.nextInt(10) + 1;
        }
    }
    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;

        while (!correct) {
            System.out.println("Probeer jij een van de 4 getallen eens te raden? Voer een getal van 1 t.e.m. 10 in:");
            int guess = scanner.nextInt();

            for (int number : numbersToGuess) {
                if (guess == number) {
                    System.out.println("Je hebt een van de juiste getallen geraden.");
                    correct = true;
                    break;
                }
            }
            if (!correct) {
                System.out.println("Dat is niet correct. Probeer het nog eens.");
            }
        }

        scanner.close();
    }
}
