package org.example;

import java.util.Scanner;

public class BiggestFromTwoNumbers {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int numb = console.nextInt();
        System.out.println("Enter the second number: ");
        int numb1 = console.nextInt();
        int sum = numb + numb1;
        System.out.println("Sum: " + sum);
        int difference = numb-numb1;
        System.out.println("Difference: " + difference);

        if ( numb < numb1){
            System.out.println("Biggest number: " + numb1);
        }
        else{
            System.out.println("Biggest number: " + numb);
        }

    }
}
