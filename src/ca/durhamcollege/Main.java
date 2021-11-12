/**
 * @author  Russell Waring - 100528426
 * @file    OOP3200 - In-class exercise 8
 * @date    November 11th, 2021
 */
package ca.durhamcollege;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // Define the Scanner
        Scanner keyboard = new Scanner(System.in);

        // Input
        String name = null;
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        float age = 0.0f;
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();

        System.out.println(); // space

        // Output
        System.out.printf("You Entered: %s\n", name);
        System.out.printf("You Entered: %.2f\n", age);
    }
}
