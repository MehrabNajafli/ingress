package org.example;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter the the number of the range: ");
        int number = console.nextInt();

        for(int i = 2; i <= number; i++) {
            if(isPrime(i)){
                System.out.println("Prime number: " + i);
            }
        }


    }
    public static boolean isPrime(int num){

        if (num <= 1){
            return false;
        }

        for(int i =2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
