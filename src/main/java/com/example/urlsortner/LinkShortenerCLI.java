

//    This field is use to  show the application for CLI  


package com.example.urlsortner;

import java.util.Scanner;

public class LinkShortenerCLI {
    private static LinkShortener linkShortener = new LinkShortener();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Link Shortener CLI");
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Shorten a URL");
            System.out.println("2. Expand a URL");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    shortenURL();
                    break;
                case 2:
                    expandURL();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void shortenURL() {
        System.out.print("Enter the long URL: ");
        String longUrl = scanner.nextLine();
        String shortUrl = linkShortener.shortenURL(longUrl);
        System.out.println("Shortened URL: " + shortUrl);
    }

    private static void expandURL() {
        System.out.print("Enter the short URL: ");
        String shortUrl = scanner.nextLine();
        String longUrl = linkShortener.expandURL(shortUrl);
        System.out.println("Original URL: " + longUrl);
    }
}

