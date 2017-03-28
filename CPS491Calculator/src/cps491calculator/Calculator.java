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

        //menu
        System.out.println("Please select an option:\n"
                + "1. Addition\n"
                + "2. Subtraction\n"
                + "3. Multiplication\n"
                + "4. Division"
                + "5. Square");

        Scanner input = new Scanner(System.in);
        Scanner operand = new Scanner(System.in);

        int choice = 0;
        int operand1 = 0;
        int operand2 = 0;
        
        choice = input.nextInt();
        System.out.println("Please enter an interger Operand 1:");
        operand1 = operand.nextInt();
        System.out.println("Please enter an interger Operand 2:");
        operand2 = operand.nextInt();
        switch(choice) {
            case 1: a
                
                
        }
            

    }

    public static int add(int operand1, int operand2) {

        return 0;
    }

}
