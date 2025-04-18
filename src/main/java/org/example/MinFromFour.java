package org.example;

import java.util.Scanner;

public class MinFromFour {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int numb = console.nextInt();

        System.out.println("Enter the second number: ");
        int numb1 = console.nextInt();

        System.out.println("Enter the third number: ");
        int numb2 = console.nextInt();

        System.out.println("Enter the fourth number: ");
        int numb3 = console.nextInt();

        int min = numb;

        if (numb1 < min){
            min = numb1;
        }
        if (numb2 < min){
            min = numb2;
        }
        if (numb3 < min){
            min = numb3;
        }

        System.out.println("Minimum number: " + min);



    }
}
