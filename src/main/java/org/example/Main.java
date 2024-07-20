//author: Mike O'Carroll
//Created: 7/20/24

//Write an application that asks a user to type an even number or the sentinel value 999 to stop
//When the user types an even number, display the message 'Good Job!' and then ask for another input.
// When the user types an odd number, display an error message and then ask for another input.
// When the user types the sentinel value 999, end the program.

package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        final int SENTINEL = 999;

        int userInput = getUserInput();

        while(userInput != SENTINEL){
            if(isInputEven(userInput)){
                System.out.println("Good Job!");
                userInput = getUserInput();
            }else{
                System.out.println("ERROR: NOT EVEN NUMBER");
                userInput = getUserInput();
            }
        }
        System.exit(0);

    }

    //Method to prompt and retrieve value from user
    public static int getUserInput(){
        System.out.println("Please enter an even number or 999 to quit");
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    //Method to check if even number
    public static boolean isInputEven(int input){
        return input % 2 == 0;
    }
}