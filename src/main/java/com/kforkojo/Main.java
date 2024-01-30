package com.kforkojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        try {
            int numberInput = scanner.nextInt();

            System.out.println(getFizzBuzz(numberInput));
        } catch (InputMismatchException ex) {
            System.out.println("The program is terminating because you did not enter a valid number.");
        }
    }

    /**
     * This function takes an integer `number` and returns the corresponding FizzBuzz output.
     * - "FizzBuzz" if the number is divisible by both 3 and 5.
     * - "Fizz" if the number is divisible by 5.
     * - "Buzz" if the number is divisible by 3.
     * - A string representation of the number if otherwise.
     *
     * @param number Integer.
     * @return The corresponding FizzBuzz output for the given number.
     */
    public static String getFizzBuzz(int number) {
        boolean isMultipleOfFive = number % 5 == 0;
        boolean isMultipleOfThree = number % 3 == 0;

        if (isMultipleOfFive && isMultipleOfThree) {
            return "FizzBuzz";
        }
        if (isMultipleOfFive) {
            return "Fizz";
        }
        if (isMultipleOfThree) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}