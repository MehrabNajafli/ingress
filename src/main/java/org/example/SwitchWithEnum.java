package org.example;

import java.time.Month;

public class SwitchWithEnum {
    public static void main(String[] args) {
        printMonth(Month.APRIL);
        printMonth(Month.DECEMBER);
        printMonth(Month.APRIL);
    }

    public static void printMonth(Month month){

        switch (month){
            case APRIL:
                System.out.println("april");
                break;
            case DECEMBER:
                System.out.println("December" );
                break;
            default:
                System.out.println("didnt choose month");
                break;

        }


    }
}
