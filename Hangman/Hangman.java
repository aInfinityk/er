import java.util.Scanner;

public class Hangman {

  // Lives: O O O
  // Input: x
  // Word: .ell.
  // Not Used: abcd.f..
  // --------------------------

  public static void main(String[] args) {
    System.out.println("Starting game");

    String notUsed = "abcdefghijklmnopqrstuvwxyz"; //words not used

    String[] words = new String[] {
      "computer",
      "mouse",
      "screen",
      "display",
      "language",
    }; //words to guess

    String randomWord = words[(int) (Math.random() * words.length)]; //randomize word

    System.out.println("The word has " + randomWord.length() + " letters.");

    char[] letters = new char[randomWord.length()];

    for (int i = 0; i < letters.length; i++) { //replaces used letters with a "."
      letters[i] = '.';
    }

    int lives = 3; //number of lifes

    Scanner scanner = new Scanner(System.in);

    while (lives > 0) { //game loop
      System.out.print("Lives: ");

      for (int i = 0; i < lives; i++) {
        System.out.print("O");
      }

      System.out.println();

      System.out.println("Input: ");

      String input = scanner.nextLine();

      char letter = input.charAt(0);

      boolean isGuessCorrect = false;

      for (int i = 0; i < randomWord.length(); i++) {
        char l = randomWord.charAt(i);

        if (l == letter) { //checks if the letter is correct
          letters[i] = l;
          isGuessCorrect = true;
        }
      }

      if (!isGuessCorrect) {    //depletes life if guess is wrong
        lives = lives - 1;
      }

      boolean isGameFinished = true;

      System.out.print("Word: ");

      for (int i = 0; i < letters.length; i++) {    //shows incomplete word
        if (letters[i] == '.') {
          isGameFinished = false;
        }

        System.out.print(letters[i]);
      }

      System.out.println();

      notUsed = notUsed.replace(letter, '.');

      System.out.println("Not used: " + notUsed);

      System.out.println("--------------------------");

      if (isGameFinished) {    //checks if won
        System.out.println("You won!");
        break;
      }
    }

    if (lives == 0) {    //checks if lost(lives is 0)
      System.out.println("You lost! The word was: " + randomWord);
    }

    System.out.println("Exiting game");
  }
}