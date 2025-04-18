package org.example;

public class ConvertToCentimetersByOverloading {
    public static void main(String[] args) {

        System.out.println("5ft, 8 in = " + convertToCentimeters(5,8)+ " cm " );
        System.out.println("68in = " + convertToCentimeters(68) + " cm ");
      //  double InchToCentimeter = convertToCentimeters(tota
        //System.out.println();
    }
    public static double convertToCentimeters( int heightInInches){
        return  2.54 * heightInInches;
    }

    public static double convertToCentimeters(int feet, int inches){
       //double totalInches = convertToCentimeters((feet * 12) + inches);
       int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);
       return  result;
    }
}
