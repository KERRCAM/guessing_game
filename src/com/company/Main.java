package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Random randomNum = new Random();
        int numberToGuess = (randomNum.nextInt(100));
        boolean numberFound = false;
        while (numberFound == false) {
            Scanner numberGuess = new Scanner(System.in);
            System.out.println("guess a number 0-99: ");
            if (numberGuess == numberToGuess) {
                numberFound = true;
            }
            if (numberGuess > numberToGuess) {
                System.out.println("your guess was too high");
            }
            else{
                if (numberGuess < numberToGuess) {
                    System.out.println("your guess was too low");
                }
            }
            else{
                System.out.println("invalid input");
            }
        }




    }
}
