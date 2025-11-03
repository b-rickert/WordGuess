package com.zipcodewilmington.hangman;
import java.util.Scanner;
public class MainApplication {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ulatorEngine engine = new CalculatorEngine();
        Console.println("=== Welcome to the Scientific Calculator ===");
        Console.println("Type 'help' for commands, 'quit' to exit."); 
    }
}