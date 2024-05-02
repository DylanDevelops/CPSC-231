/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: Exceptions
**/

// Imports required packages
import java.util.Scanner;
import java.util.InputMismatchException;

public class IntegerException {
   public static void main(String[] args) {
      // Creates a new scanner object
      Scanner scnr = new Scanner(System.in);

      // Creates a try catch block to handle exceptions
      try {
         // Stores values
         int firstNum = scnr.nextInt();
         int secondNum = scnr.nextInt();

         // Type casts to int
         int result = firstNum / secondNum;

         // Prints result
         System.out.println(result);
      } catch(ArithmeticException e) {
         // In case of arithmetic exception, print it here
         System.out.println("Arithmetic Exception: " + e.getMessage());
      } catch(InputMismatchException e) {
         // In case of input mismatch exception, print it here
         System.out.println("Input Mismatch Exception: " + e.toString());
      }
   }
}
