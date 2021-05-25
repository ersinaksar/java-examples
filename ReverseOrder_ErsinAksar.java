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
public class ReverseOrder_ErsinAksar {

    /**
     * @param args the command line arguments
     */
    
    public static void reverse(int number){
        int num1 = (int)(number / 1000);
        int number2 = number%1000;
        int num2 = (int)(number2 / 100);
        int number3 = number2 % 100;
        int num3 = (int)(number3 / 10);
        int num4 = number%10;
        
        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);
        System.out.println("num4:" + num4);
        
        System.out.println("Your number : " + number);
        System.out.println("My number  : " + num4+num3+num2+num1);
        
        
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 4-stage number: ");
        int number = input.nextInt();
        reverse(number);
        
        
    }
    
}
