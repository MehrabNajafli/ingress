package org.example;

import java.util.Scanner;

public class Polidrom {
    public static void main(String[] args) {
        //1 sum numbers until user will enter 0
        Scanner console = new Scanner (System.in);

        System.out.println("Enter the number to see sum, except zero: ");
        int number = console.nextInt();
        int sum = 0;
        while(number !=0 ){
            sum = sum + number;
            number = console.nextInt();
        }

        System.out.println(sum);


        //2 find sum of the number digits
        int i = 0;

        while(i < 1000){

            int sumDigits = 0;
            int num = i;

            while(num != 0) {
                sumDigits = sumDigits+ (num % 10);
                num = num / 10;
            }

            if(sumDigits == 10){
                System.out.println("Sum of digits until 1000: " + i);
            }
            i++;
        }

        //3 polidrom
//        System.out.println("Enter the polidrome: ");
//        int element = console.nextInt();


       int element = 101;
        while(100 < element && element < 999) {

            int original = element;
            int reversed = 0;
            int numb = element;

            while (numb != 0) {
                int digit = numb % 10;
                reversed = 10 * reversed + digit;
                numb = numb / 10;

            }
            if (original == reversed) {
                System.out.println("Polidrom: " + element);
            }
            element++;
        }


        //4 Ask user for correct password
        console.nextLine();
        String passwordCorrect = "java2025";
        String password = "";

        while(!passwordCorrect.equals(password)) {
            System.out.println("Enter the correct password: ");
            password = console.nextLine();
        }



   }
}
