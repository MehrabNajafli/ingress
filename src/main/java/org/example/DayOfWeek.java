package org.example;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number between 1 and 7: ");
        int numb = console.nextInt();

        if (numb == 1){
            System.out.println("Monday");
        }else if (numb == 2){
            System.out.println("Tuesday");
        }else if (numb == 3){
            System.out.println("Wednesday");
        }else if (numb == 4){
            System.out.println("Thursday");
        }else if (numb == 5){
            System.out.println("Friday");
        }else if (numb == 6){
            System.out.println("Saturday");
        }else if (numb == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("Number enter is out of range");
        }


    }
}
