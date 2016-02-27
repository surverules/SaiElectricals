package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by surverules on 2/18/2016.
 */

/**
 *  The try catch has to include the whole code to handle exception at every where.
 *  Usually the exceptions are handled at code which is included in Try Catch Block
 */


public class DivideByZero {


    public static int divide (int a, int b) {
        return a / b;
    }

    public static void main(String[] Args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter 1st Number: ");
            int a = scanner.nextInt();

            System.out.println("Enter 2nd Number: ");
            int b = scanner.nextInt();

            System.out.println("Quatient : " + DivideByZero.divide(a, b));
        }  catch (InputMismatchException e ) {
            System.out.println("Correct the input !!");
        } catch ( ArithmeticException e ){
            System.out.println("Error !!");

        }
    }
}
