package org.example;

public class SwitchStatementEx1 {
    public static void main(String[] args) {
        int value = 1;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("was not 1 or 2");
        }
        int switchValue = 1;

        switch (switchValue) {
            case 1 -> System.out.println("Value was equal 1");
            case 2 -> System.out.println("Value was equal 2");
            case 3, 4, 5 -> {
                System.out.println("was a 3, a 4, or a 5");
                System.out.println("actually it was a " + switchValue);
            }
            default -> System.out.println("value was not 1 or 2 , 3, 4, 5");
        }

        String month = "AL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3RD";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4TH";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
