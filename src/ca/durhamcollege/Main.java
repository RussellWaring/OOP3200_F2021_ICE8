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
        String name = null;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.printf("You Entered: %s", name);
    }
}
