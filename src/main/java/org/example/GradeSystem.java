package org.example;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter the grade: ");
        int grade = console.nextInt();

        if (grade >= 91 && grade <=100 ){
            System.out.println("Grade will be A");
        }else if (grade >= 81 && grade <= 90){
            System.out.println("Grade will be B");
        }else if (grade >= 71 && grade <= 80){
            System.out.println("Grade will be C");
        }else if (grade >= 61 && grade <= 70){
            System.out.println("Grade will be D");
        }else if (grade >= 51 && grade <= 60){
            System.out.println("Grade will be E");
        }else if (grade >= 0 && grade <= 50){
            System.out.println("Grade will be F");
        }
    }
}
