package org.example;

public class DayOfWeekEnhanceSwitch {
    public static void main(String[] args) {

        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
        printDayOfWeek(8);

        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
        printWeekDay(8);

    }
    public static void printDayOfWeek (int day) {
       String dayOfTheWeek = switch (day) {
           case 1 -> {yield
               "SUNDAY";
           }
           case 2 -> "MONDAY";
           case 3 -> "TUESDAY";
           case 4 -> "WEDNESDAY";
           case 5 -> "THURSDAY";
           case 6 -> "FRIDAY";
           case 7 -> "SATURDAY";
           default -> {
               String badResponse = day + " Invalid  day";
               yield badResponse;
           }
       };
        System.out.println(dayOfTheWeek);
    }
    public static void printWeekDay(int day){
        String dayOfWeek = "Invalid day";
        if( day == 1) {
            dayOfWeek = "Sunday";
        } else if ( day == 2){
            dayOfWeek = "Monday";
        } else if ( day == 3){
            dayOfWeek = "Tuesday";
        } else if ( day == 4){
            dayOfWeek = "Wednesday";
        } else if ( day == 5){
            dayOfWeek = "Thursday";
        } else if ( day == 6) {
            dayOfWeek = "Friday";
        } else if ( day == 7){
            dayOfWeek = "Saturday";
        }
        System.out.println(dayOfWeek);

    }
}

