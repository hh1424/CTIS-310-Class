package edu.guilford;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Sandbox 
{
    public static void main( String[] args )
    {
        // Ask the user for an integer
        System.out.println( "Please enter an integer: " );
        // Declare a scanner to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        // Read the integer from the user
        int number = keyboard.nextInt();
        
        // Call the sum method and print the result
        System.out.println("The sum of the integers from 1 to " + number + " is " + sum(number));

        // Call the sumWhile method and print the result
        System.out.println("The sum of the integers from 1 to " + number + " is " + sumWhile(number));

    }

    // write a method that adds the integers from 1 to n
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Write a method that uses a while loop to add the integers from 1 to n
    public static int sumWhile(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i = i + 1;
        }
        return sum;
    }
}
