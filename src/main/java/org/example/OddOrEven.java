package org.example;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int oddOrEven = scanner.nextInt();

        if (oddOrEven % 2 == 0) {
            if (oddOrEven < 50) {
                System.out.println("less than 50");
            }
            else if (oddOrEven > 50) {
                System.out.println("more than 50");
            }
            else {
                System.out.println("equal to 50");
            }
            System.out.println("Odd");
        }
        else if (oddOrEven % 2 == 1) {
            if (oddOrEven < 50) {
                System.out.println("less than 50");
            }
            else if (oddOrEven > 50) {
                System.out.println("more than 50");
            }
            else {
                System.out.println("equal to 50");
            }
            System.out.println("Even");
        }
        else {
            System.out.println("zero");
        }

        if ( oddOrEven % 5 ==0 && oddOrEven % 3 ==0) {
            System.out.println("Divided by 5 and 3");
        } else {
            System.out.println("not divided by 5 and 3");

        }

        if( oddOrEven % 5 == 0 &  oddOrEven % 3 == 0) {
            System.out.println("divide by 5 and 3");

        } else {
            System.out.println("not divided");
        }
    }

}
