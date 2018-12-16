/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task02_5_basic;

import java.util.Scanner;

/**
 *
 * @author Valeriia_Amialchenia
 */
public class Task02_5_basic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = UserInput.input("Enter any integer 6-digits number: ");
       
       double result = Calculations.calculateArithmeticAverage(a);
        
       System.out.println("Arithmetic Average of input number's digits is equal to " + result);
       
      double result2 = Calculations.calculateGeometricAverage(a);
      System.out.println("Geometric Average of input number's digits is equal to " + result2);
        }
    
    }
    

