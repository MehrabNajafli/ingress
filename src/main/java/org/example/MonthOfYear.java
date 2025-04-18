package org.example;

import java.util.Scanner;

public class MonthOfYear {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter the nummber between 1 and 12: ");
        int months = console.nextInt();

        if ( months < 1 || months > 12){
            System.out.println("Out of range");

        } else if (months <=2 || months ==12) {
            System.out.println("Winter");

        }else if ( months <=5 && months >=3){
            System.out.println("Spring");

        }else if ( months <=8 && months >=6){
            System.out.println("Summer");

        }else if ( months <=11 && months >=9){
            System.out.println("Autumn");

        }

    }
}
