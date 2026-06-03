package Cognizant.Module_3;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Math.round(Math.random()*100);
        boolean found = false;
        int moves = 0;
        System.out.println("GUESSING GAME (0 - 100)");
        while(!found) {
            moves++;
            System.out.println("enter guess: ");
            int guess = sc.nextInt();
            if(guess == a) break;
            else if(guess>a) System.out.println("too high");
            else System.out.println("too low");
        }
        System.out.println("congrats");
        System.out.println("you won in "+moves+" moves");

    }
}
