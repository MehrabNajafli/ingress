package org.example;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int numb = console.nextInt();

        System.out.println("Enter the second number: ");
        int numb1 = console.nextInt();

        console.nextLine();

        System.out.println("Enter the operator: ");
        String operator = console.nextLine();

        if( operator.equals("+")){
            System.out.println("Sum: " + (numb + numb1));
        }else if ( operator.equals("-")){
            System.out.println("Difference: " + (numb - numb1));
        }else if ( operator.equals("*")){
            System.out.println("Multiplication: " + (numb * numb1));
        }else if ( operator.equals("/")){
            System.out.println("Division: " + (numb / numb1));
        }

    }
}
