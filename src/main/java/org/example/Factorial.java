package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the valid number: ");
        int number = console.nextInt();
        int result = 1;
        for(int i = 1; i <= number; i++){
            result = result * i;
        }
        System.out.println("Factorial: " + result);
    }
}
