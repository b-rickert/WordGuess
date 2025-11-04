package com.github.zipcodewilmington;
import java.util.Scanner; 


/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bellows!");
        String secretWord = "determination";
        int userGuessesNum = 6;
        Scanner scanner = new Scanner(System.in);
        StringBuilder guessedWord = new StringBuilder("-------------");

        while (true) {
            System.out.println("Word: " + guessedWord);
            System.out.println("Guesses remaining: " + userGuessesNum);
            System.out.print("Enter a letter? (or quit) ");
            String userInput = scanner.nextLine();
            System.out.println("User typed: " + userInput);

            if (userInput.equals("quit")) {
                break;
        }

        if (!checkGuess(secretWord, userInput)) {
            userGuessesNum--;
        } else {
            updateGuessedWord(secretWord, guessedWord, userInput);
        }

        if (guessedWord.toString().equals(secretWord)) {
            System.out.println("You win! The word was: " + secretWord);
            break;
        }
        if (userGuessesNum <= 0) {
            System.out.println("You lose! The word was: " + secretWord);
            break;
        }
    }

    System.out.println("Bye!");
    scanner.close();
    }

    public static boolean checkGuess(String secretWord, String guess) {
        if (secretWord.contains(guess)) {
            System.out.println("Correct letter! " + guess);
            return true;
        } else {
            System.out.println("Wrong letter! " + guess);
            return false;
        }
    }

    public static void updateGuessedWord(String secretWord, StringBuilder guessedWord, String guess) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess.charAt(0)) {
                guessedWord.setCharAt(i, guess.charAt(0));
            }
        }
    }
}