
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
public class BodyMass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is a sample run:
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds : ");
        double pounds = input.nextDouble();
        System.out.print("Enter height in inches : ");
        double inches = input.nextDouble();
        
        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        
        double BMI = kilograms / (meters*meters);
        System.out.println("BMI is " + BMI);
    }
    
}
