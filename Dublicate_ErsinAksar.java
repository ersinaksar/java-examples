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
public class Dublicate_ErsinAksar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers : ");
        
        int[] myList = new int[10];
        for(int i = 0; i < 10 ; i++){
            myList[i] = input.nextInt();
        }
        
        int[] newList = eliminateDublicates(myList);
        
    }
    
    
    public static int[] eliminateDublicates(int[] list){
        int[] list2 = new int[10];
        int[] list3 = new int[10];
        int a;
        int b ;
        for(int i=0; i<list.length;i++){
            list2[list[i] - 1]++;
            
            if (list2[list[i]-1] > 1)
		list[i]=0;
            
        }
        
        for (int i=0; i<list.length; i++)
        {
            if (list[i] != 0)
                System.out.print(list[i]+" ");
        }
        
        return list2;
    }
}
