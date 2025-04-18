package org.example;

public class Practise {
    public static void main(String[] args) {

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println(myVariable
                + " " + myVariable
                + " " + myVariable);


        int anotherVariable = 50;
        myVariable--;
        System.out.println(anotherVariable);

        if(myVariable == 0) {
            System.out.println("myVariable is 0");
        }


    }
}