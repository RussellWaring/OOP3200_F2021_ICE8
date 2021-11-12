/**
 * @author  Russell Waring - 100528426
 * @file    OOP3200 - In-class exercise 8
 * @date    November 11th, 2021
 */
package ca.durhamcollege;

import java.util.InputMismatchException;
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

        boolean isValidInput = false; // Sentinel variable - used to check condition of while loop. Could also use a do...while loop
        do
        {
            System.out.print("Please enter your age: ");
            try
            {
                age = keyboard.nextFloat();
                isValidInput = true;

                if(age <= 0.0f || age > 120.0)
                {
                    System.out.println("Error: You must enter an age greater than 0.0 and less than 120.0");
                    keyboard.nextLine();
                    isValidInput = false;
                }
            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("Error: You must enter a valid floating-point number");
                keyboard.nextLine();
                isValidInput = false;
            }
        }
        while(!isValidInput);

        // Multi-dimensional array example
        System.out.println("Multi-dimensional Array example");
        int rows = 8;
        int cols = 8;
        float[][] board = new float[rows][cols];

        for (int x = 0; x < rows; x++)
        {
            for (int y = 0; y < cols; y++)
            {
                board[x][y] = (float)(Math.random() * 100.0f) + 1.0f; // casting to a float, "old C-style"

            }
        }

        System.out.println("Showing 10 Random Values:");
        for (int i = 0; i < 10; i++)
        {
            var randRows = (int) (Math.random() * rows);// Math.floor rounds down
            var randCols = (int) (Math.random() * cols);
            System.out.print("For row: " + randRows + " col: " + randCols + " ");
            System.out.printf("The Random number is: %.2f \n", board[randRows][randCols]);
        }


        System.out.println(); // space

        // Output
        System.out.printf("You Entered: %s\n", name);
        System.out.printf("You Entered: %.2f\n", age);
    }

}
