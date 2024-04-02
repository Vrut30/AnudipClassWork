package com.demo;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is an alphabet (a-z or A-Z)
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            // Convert the character to lowercase for case-insensitive matching
            ch = Character.toLowerCase(ch);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not an alphabet.");
        }

        // Close the scanner
        scanner.close();
    }
}