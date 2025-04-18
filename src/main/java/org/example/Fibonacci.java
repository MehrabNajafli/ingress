package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //F(n) = F(n - 1) + F(n - 2)
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number please: ");
        int number = console.nextInt();

        int a = 0;//F(0)
        int b = 1;//F(1)
        int result = 0;

        for(int i = 2; i <= number; i++){
            result = a + b;
            a = b;
            b = result;
            System.out.println("Fibonacci(" + i + ")" + " will be: " + result);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
