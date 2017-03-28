/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cps491calculator;

/**
 *
 * @author Chewbecca
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public double multiply(double first, double second){
        return first * second;
    }
    
    public double addition(double add1, double add2) {
        return add1 + add2;
    }

    public static double divide(double numerator, double denominator){
        if(denominator == 0){
            System.out.println("Cannot divide by zero!");
            exit(-1);
        }
        else {
            return numerator / denominator;
        }
    }
}
