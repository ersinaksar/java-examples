/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class DecreasingOrder_ErsinAksar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        
        
        int[] corrects = new int[answers.length];
        for(int i = 0;i < answers.length;i++){
            int correctCount = 0;
            
            for(int j = 0; j<answers[i].length; j++){
                if(answers[i][j] == keys[j])
                    correctCount++;
            }
            corrects[i] = correctCount;
            
            //System.out.println("Student " + i + "'s correct count is " + correctCount);  
        }
        
        for(int k = 1; k <corrects.length; k++){
            int gecici;
            for(int l=0;l<corrects.length-1;l++){
                if(corrects[l] < corrects[l+1]){
                    gecici = corrects[l];
                    corrects[l]= corrects[l+1];
                    corrects[l+1] = gecici;
                }
            }
        }
        
        for(int m = 0; m<corrects.length;m++){
            System.out.println("Student " + m + "'s correct count is " + corrects[m]);
        
        }
    
    
    
    
    }
    
}
