package org.example;

public class SwitchSample {
    public static void main(String[] args) {
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            SECOND_CHAR_LOOP:for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue ;
                System.out.print(" " + a + x);
            }
        }
    }
}
