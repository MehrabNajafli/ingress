package org.example;


public class MethodOverloading {
    public static void main(String[] args) {

//       int newScore = calculateScore("Tim", 500);
//        System.out.println("new score is: " + newScore);
//
//        int overloadedScore = calculateScore(234);
//        System.out.println("Overloaded score: " + overloadedScore);
//
//        calculateScore();

        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        return calculateScore("Annonymous", score);
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score");
        return 0;
    }
    // changing data type does not mean overloading !!!!!
//    public static void calculateScore(){
//        System.out.println("No player name, no player score");
//    }

}
