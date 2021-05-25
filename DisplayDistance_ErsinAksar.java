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
public class DisplayDistance_ErsinAksar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates distance of two point(ex. x1,y1 and x2,y2 )");
        System.out.print("Enter 1. point x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter 1. point y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter 2. point x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter 2. point y2: ");
        double y2 = input.nextDouble();
        
        double z = ((x2-x1) * (x2-x1)) + ((y2-y1)*(y2-y1));
        double distance = Math.pow(z,0.5);
        System.out.println("Your points are (" + x1 +"," +y1 + ") and (" + x2 + "," + y2 + ")" );
        System.out.println("Distance of two point is: " + distance);
    }
    
}
