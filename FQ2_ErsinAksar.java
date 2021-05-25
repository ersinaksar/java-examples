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
public class FQ2_ErsinAksar {

    /**
     * @param args the command line arguments
     */
    public static double sumRow(double[][] m, int rowIndex){
        double sum = 0.0;
        for(int j=0; j<4; j++){
            sum = sum + m[rowIndex][j];
        }
        
        return sum;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a 3-by-4 matrix row by row");
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4]; 
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        
        for(int i=0; i < 3; i++){
            System.out.println("Sum of the elements at row " + i + " is " + sumRow(matrix, i));
        }
        
        
    }
    
}
