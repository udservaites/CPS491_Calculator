/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cps491calculator;

import java.util.Scanner;

/**
 *
 * @author Chewbecca
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = 0;
        int operand1 = 0;
        int operand2 = 0;
        boolean go = true;
        //menu
        
        while(go) {
        System.out.println("Please select an option:\n"
                + "1. Addition\n"
                + "2. Subtraction\n"
                + "3. Multiplication\n"
                + "4. Division\n"
                + "5. Square\n"
                + "6. Quit");

        Scanner input = new Scanner(System.in);
        Scanner operand = new Scanner(System.in);

        
        
        
        choice = input.nextInt();
     
        switch (choice) {
            case 1:
                System.out.println("Please enter an interger Operand 1:");
                operand1 = operand.nextInt();
                System.out.println("Please enter an interger Operand 2:");
                operand2 = operand.nextInt();
                System.out.println(addition(operand1, operand2));
                 break;
            case 2:
                System.out.println("Please enter an interger Operand 1:");
                operand1 = operand.nextInt();
                System.out.println("Please enter an interger Operand 2:");
                operand2 = operand.nextInt();
                System.out.println(subtraction(operand1, operand2));
                break;
            case 3:
                System.out.println("Please enter an interger Operand 1:");
                operand1 = operand.nextInt();
                System.out.println("Please enter an interger Operand 2:");
                operand2 = operand.nextInt();
                System.out.println(multiply(operand1, operand2));
                break;
            case 4:
                System.out.println("Please enter an interger Operand 1:");
                operand1 = operand.nextInt();
                System.out.println("Please enter an interger Operand 2:");
                operand2 = operand.nextInt();
                System.out.println(divide(operand1, operand2));
                break;
            case 5:
                System.out.println("Please enter an interger to square:");
                operand1 = operand.nextInt();
                System.out.println(square(operand1));
                break;
            case 6:
                go = false;

            }
        }


    }

    public static int add(int operand1, int operand2) {

        return operand1 + operand2;
    }

    public static double square(double num) {
        return num * num;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double addition(double add1, double add2) {
        return add1 + add2;

    }
     
    public static double subtraction(double sub1, double sub2) {
        return sub1 - sub2;
    }

    public static double divide(double numerator, double denominator) {
        if (denominator == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        } else {
            return numerator / denominator;
        }
    }
}
