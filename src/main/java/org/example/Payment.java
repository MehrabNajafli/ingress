package org.example;


import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter the salary: ");
        double salary = console.nextDouble();

        System.out.println("Enter the working period: ");
        int period = console.nextInt();

        if (period < 1){
            System.out.println("Out of range");
        }else if (period >= 1 && period <= 3){
            double totalSalary = (salary * 0.05) + salary;
            System.out.println("with 5% " + totalSalary);
        }else if (period >= 4 && period <= 7){
            double totalSalary = (salary * 0.1) + salary;
            System.out.println("with 10% " + totalSalary);
        }else if (period >= 8 && period <= 15){
            double totalSalary = (salary * 0.15) + salary;
            System.out.println("with 15% " + totalSalary);
        }else {
            double totalSalary = (salary * 0.2) + salary;
            System.out.println("with 20% " + totalSalary);
        }

    }
}
