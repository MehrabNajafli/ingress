package org.example;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        //1 Armstrong number
        int armstrongNumber = 153;
        int original = armstrongNumber;
        int numb = armstrongNumber;
        int sum = 0;

        do {
            int digit = numb % 10;
            sum = sum + (digit * digit * digit);
            numb = numb / 10;
            System.out.println(sum);

        }while (numb != 0 );

        if(original == sum) {
            System.out.println("Armstrong number will be: " + sum);
        } else {
            System.out.println("Invalid armstrong");
        }

        //2 Calculator
        double numb1 = 0;
        double numb2 = 0;
        String operation = "";
        do{
            System.out.println("Enter the first number: ");

            if(console.hasNextDouble()){
                numb1 = console.nextDouble();
                System.out.println("You entered: " + numb1);
            } else {
                System.out.println("Invalid character");
            }

            System.out.println("Enter the second number: ");
            if(console.hasNextDouble()){
                numb2 = console.nextDouble();
                System.out.println("You entered: " + numb2);
            } else {
                System.out.println("Invalid character");
            }


            console.nextLine();

            System.out.println("Chooose operation: + , - , / , *  or write exit to exit");
            if(console.hasNextLine()){
                operation = console.nextLine();
            }
            else {
                System.out.println("Invalid character");
            }


            switch (operation){
                case "+" -> {double sums = (numb1 + numb2);
                    System.out.println("Result: " + sums);}
                    case "-"-> {
                       double substraction = numb1 - numb2;
                        System.out.println("Result:" + substraction);
                    }
                        case "/"-> {
                            if (numb2 != 0){
                              double division = numb1 / numb2;
                                System.out.println("Result: " + division);
                            } else {
                                System.out.println("Cannot divide by zero");
                            }

                        }
                            case "*"->{
                              double multiplication =  numb1 * numb2;
                                System.out.println("Result: " + multiplication);

                            }
                            case "exit" -> System.out.println("Exit the calculator");
                default -> System.out.println("Invalid operations");
            }


        }while(!operation.equals("exit"));

        //average
        System.out.println("Enter the number of students: ");
        double students = console.nextDouble();

        int total = 0;
        int i = 1;

        do{
            System.out.println("Enter the points of students: ");
            int score = console.nextInt();
            total = (total + score);
            i++;

        }while(i <= students);

        double average = total/students;
        System.out.println("Average will be: " + average);



        //4 find number of digits:
        int num = 1024;
        int count = 0;

        do{
            num = num / 10;
            count++;


        }while(num != 0);
        System.out.println("Number of digit: " +count);



        //5 game 1-10;
        int numbOfSecret = 5;
        int guessNumb;

        do{
            System.out.println("Guess the number: ");
            guessNumb = console.nextInt();


        }while(numbOfSecret != guessNumb);
        System.out.println("You find the number: " + numbOfSecret);



        //6 multiplication of digits:
        int number = 123;
        double productOfDigits = 1;
        int nums = number;
        int digits;

        do{
           digits = nums % 10;
           productOfDigits = productOfDigits * digits;
           nums = nums /10;
            System.out.println(nums);





        }while(nums!= 0);
        System.out.println(productOfDigits);
    }
}
