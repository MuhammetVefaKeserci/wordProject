package com.example.wordproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class WordProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(WordProjectApplication.class, args);
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a word: ");
        String word = scanner.nextLine();

        StringBuilder firstLetter = new StringBuilder();

        String[] words = word.split("\\s+");

        for (String s : words) {
            if (!s.isEmpty()) {
                firstLetter.append(Character.toUpperCase(s.charAt(0)));
            }
        }

        System.out.println("Baş harfler: " + firstLetter.toString());

        scanner.close();
    }

}
