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
public class FQ1_ErsinAksar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        
        int counter = 0;
        //int control = 1;
        boolean flag = true;
        int index = 0;
        double number;
        System.out.println("Enter scores:");
        do{
            number = input.nextDouble();
            if(number >= 0 ){
                numbers[index] = number;
                index++;
                counter = counter + 1;
            }
            else{
                //control = 0;
                flag = false;
            }
        }while(flag);
        
        double sum = 0;
        for (int i = 0; i< counter; i++){
            sum = sum + numbers[i];
        }
        
        double average;
        average = sum/counter;
        
        int above = 0;
        int equal = 0;
        int below = 0;
        double score;
        for(int i = 0; i< counter; i++){
            score = numbers[i];
            if(score > average )
                above++;
            else if(score < average)
                below++;
            else if(score == average)
                equal++;
            else
                System.out.println("Hata var");
        }
        
        System.out.println(above + " Score is/are above then average");
        System.out.println(equal + " Score is/are equal then average");
        System.out.println(below + " Score is/are below then average");
        
        
        
        
    }
    
}
