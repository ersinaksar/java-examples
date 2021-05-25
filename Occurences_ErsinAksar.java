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
public class Occurences_ErsinAksar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 50: ");
        int[] numbers = new int[1000];
        int number;
        int counter = 0;
        
        do{
            number = input.nextInt();
            numbers[counter] = number;
            counter++;
        }while((0<number) && (number<51));
        counter--;//koşulumuza uymayan ama listeye eklenmiş elemanın indexi hesabı yaparken bunu dahil etmeyeceğiz bir eksiğine kadar geleceğiz
        //Counter burada bizim kullanacağımız elemanlar yani eleman sayısı diyebiliriz
        //System.out.print("Numbers: ");
        /*for(int i = 0; i<counter; i++){
            System.out.print(numbers[i] + " ");
        }*/
        
        numberOcc(numbers, counter);
    }
    
    public static void numberOcc(int[] numbers, int counter){
        int[][] numbersOcc = new int[counter][counter];
        for(int i=0; i<counter; i++){
            numbersOcc[i][0] = numbers[i]; 
            
        }
        //System.out.println("1");
        for(int i = 0; i<counter; i++){
            int occ = 1;
            for(int j = 1; j< counter--; j++){
                if(numbers[i] == numbers[j]){
                    occ++;
                }
            }
            numbersOcc[i][1] = occ;
        }
        //System.out.println("2");
        for(int i = 0; i<counter; i++){
            System.out.println(numbersOcc[i][0] + " occurs " + numbersOcc[i][1] + " times");
            System.out.println(" ");
        }
        //System.out.println("3");
        
        
    }
    
}
