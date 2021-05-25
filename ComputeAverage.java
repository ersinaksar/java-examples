

/**
 *
 * @author macbook
 */

import java.util.Scanner;


public class ComputeAverage {

    /**
     * @param args the command line arguments
     */
    //This program calculate 3 three numbers which are taken from user.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three numbers : ");
        
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        double average = (number1 + number2 + number3)/3;
        System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
    }
    
}
