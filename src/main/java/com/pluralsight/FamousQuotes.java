package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    static void main() {
        Scanner myScanner = new Scanner(System.in);

        // Store 10 quotes at indexes 0 through 9.
        String[] quotes = {
                "How do you like them apples? — Good Will Hunting",
                "Say hello to my little friend! — Scarface",
                "Believe it! — Naruto",
                "With great power comes great responsibility. — Spider-Man",
                "May the Force be with you. — Star Wars",
                "I'll be back. — The Terminator",
                "To infinity and beyond! — Toy Story",
                "Why so serious? — The Dark Knight",
                "I am Groot. — Guardians of the Galaxy",
                "Roads? Where we're going, we don't need roads. — Back to the Future"
        };

        try {
            System.out.println("Select a quote number from 1 to 10: ");
            int input = myScanner.nextInt();

            // Array indexes start at 0, so subtract 1.
            System.out.println(quotes[input - 1]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please select a number between 1 and 10.");
        }

        myScanner.close();
    }
}
