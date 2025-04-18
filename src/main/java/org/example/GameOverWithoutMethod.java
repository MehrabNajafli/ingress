package org.example;

public class GameOverWithoutMethod {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//       if(score <= 5000){
//           System.out.println("You got a score less than or equal 5000");
//       } else {
//           System.out.println("You got a score greater than 5000");
//       }

        if(score < 5000 && score > 1000) {
            System.out.println("You got a score less than 5000 but got a score greater than 1000");
        } else if(score < 1000){
            System.out.println("You got a score less than 1000");
        } else {
            System.out.println("Got here");
        }


    }
}
