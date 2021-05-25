/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */

import java.util.Scanner;
public class ShippingCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Write a program that prompts the user to enter the weight of 
        the package and display the shipping cost. If the weight is greater than 
        20, display a message “the package cannot be shipped.”*/
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter weight of your package in pounds : ");
        double pounds = input.nextDouble();
        
        if ( (0 < pounds) && (pounds<= 2)){
            System.out.println("Shipping cost : 2.5 $ ");
        }
        
        else if( (2<pounds) && (pounds <= 4)){
            System.out.println("Shipping cost : 4.5 $");
        }
        
        else if ( (4<pounds) && (pounds <=10)){
            System.out.println("Shipping cost : 7.5 $");
        }
        
        else if ((10< pounds ) && (pounds <= 20)){
            System.out.println("Shipping cost : 10.5 $");
        }
        
        else{
            System.out.println("the package cannot be shipped");
        }
        
        
        
    }
    
}
