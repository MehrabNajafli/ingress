package org.example;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Choose the film from list");
        System.out.println("1: Qorxular Imperiyasi (12+)-10AZN");
        System.out.println("2: Sevgi hekayesi (no age limit)-8AZN");
        System.out.println("3: Kosmik Mecare (16+)-12AZN");

        System.out.println("Your choice: ");
        int choice = console.nextInt();

        System.out.println("Your age: ");
        int age = console.nextInt();

        System.out.println("How many tickets: ");
        int ticket = console.nextInt();


        switch (choice) {
            case 1:
                if (age < 12) {
                    System.out.println("You cannot choose this film");

                } else if (age >= 13 && age <= 18) {
                    System.out.println("Your choice Qorxular Imperiyasi");
                    System.out.println("Ticket amount: " + ticket);
                    System.out.println("Discount 30%");
                    double price = ((10 * ticket) - (10 * 0.3 * ticket));
                    System.out.println("Price: " + price);
                    System.out.println("Welcome to the film");

                } else if (age >= 65) {
                    System.out.println("Your choice Qorxular Imperiyasi");
                    System.out.println("Ticket amount: " + ticket);
                    System.out.println("Discount 50%");
                    double price = ((10 * ticket) - (10 * 0.5 * ticket));
                    System.out.println("Price: " + price);
                    System.out.println("Welcome to the film");

                } else {
                    System.out.println("Your choice Qorxular Imperiyasi");
                    System.out.println("Ticket amount: " + ticket);
                    System.out.println("No discount");
                    double price = (10 * ticket);
                    System.out.println("Price: " + price);
                    System.out.println("Welcome to the film");
                }
                break;

            case 2:
                System.out.println("Your Choice Sevgi Hekayesi");

                if (age <= 6) {
                    System.out.println("Ticket amount: " + ticket);
                    System.out.println("100% discount");
                    double price = (8 * ticket) * 0;
                    System.out.println("Price: " + price);
                    System.out.println("Welcome to the film");

                } else if (age >= 7 && age <= 18) {
                    System.out.println("Ticket amount: " + ticket);
                    System.out.println("Discount 30%");
                    double price = ((8 * ticket) - (0.3 * ticket * 8));
                    System.out.println("Price: " + price);
                    System.out.println("Enjoy the film");

                } else if (age >= 65) {
                    System.out.println("Ticket amount: " + ticket);
                    System.out.println("Discount 50%");
                    double price = ((8 * ticket) - (8 * 0.5 * ticket));
                    System.out.println("Price: " + price);
                    System.out.println("Welcome to the film");

                } else {
                    System.out.println("Ticket amount: " + ticket);
                    System.out.println("No discount");
                    double price = (8 * ticket);
                    System.out.println("Price: " + price);
                    System.out.println("Welcome to the film");

                }
                break;

            case 3:
                if (age < 16) {
                    System.out.println("You cannot choose this film");

                } else if (age >= 16 && age <= 18) {
                    System.out.println("Your choice Kosmik Mecara");
                    System.out.println("Ticket amount: " + ticket);
                    System.out.println("Discount 30%");
                    double price = ((12 * ticket) - (12 * 0.3 * ticket));
                    System.out.println("Price: " + price);
                    System.out.println("Welcome to the film");

                } else if (age >= 65) {
                    System.out.println("Your choice Kosmik Mecara");
                    System.out.println("Ticket amount: " + ticket);
                    System.out.println("Discount 50%");
                    double price = ((12 * ticket) - (12 * 0.5 * ticket));
                    System.out.println("Price: " + price);
                    System.out.println("Welcome to the film");

                } else {
                    System.out.println("Your choice Kosmik Mecara");
                    System.out.println("Ticket amount: " + ticket);
                    System.out.println("No discount");
                    double price = (12 * ticket);
                    System.out.println("Price: " + price);
                    System.out.println("Welcome to the film");
                }
                break;

            default:
                System.out.println("You didnt make choice");
                break;
        }
    }
}
