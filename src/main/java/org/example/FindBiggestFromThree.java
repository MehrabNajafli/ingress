package org.example;

import java.util.Scanner;

public class FindBiggestFromThree {
    public static void main(String[] args) {

        Scanner console = new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int numb = console.nextInt();

        System.out.println("Enter the second number: ");
        int numb1 = console.nextInt();

        System.out.println("Enter the third number: ");
        int numb2 = console.nextInt();

        //1 option
        if ( numb2 >= numb && numb2 >= numb1){
            System.out.println("Biggest number: " + numb2);

        }else if ( numb1 >= numb2 && numb1 >= numb){
            System.out.println("Biggest number: " + numb1);

        }else if ( numb >= numb2 && numb >= numb1){
            System.out.println("Biggest number: " + numb);
        }

        //2 option
        int max = numb;

        if (numb1 > max){
            max = numb1;
        }

        if (numb2 > max){
            max = numb2;
        }

        System.out.println("Biggest number: " + max);

    }
}
