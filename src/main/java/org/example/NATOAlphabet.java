package org.example;

public class NATOAlphabet {
    public static void main(String[] args) {

        char variable = 'A';

        switch (variable) {
            case 'A':
                System.out.println("A letter was change to Able");
                break;
            case 'B':
                System.out.println("B letter was change to Baker");
                break;
            case 'C':
                System.out.println("C letter was change to Charlie");
                break;
            case 'D':
                System.out.println("D letter was change to Dog");
                break;
            case 'E':
                System.out.println("E letter was change to Easyr");
                break;
            default :
                System.out.println("Letter: " + variable +  " was not foind in the switch");
                break;


        }
    }
}
