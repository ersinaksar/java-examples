/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macbook
 */
public class Employee_ErsinAksar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] employee = {"Employee 0","Employee 1","Employee 2","Employee 3","Employee 4","Employee 5",
        "Employee 6","Employee 7"};
        String[] days = {"Su","M","T","W","Th","F","Sa"};
        int[][] hours = {
            {2,4,3,4,5,8,8},
            {7,3,4,3,3,4,4},
            {3,3,4,3,3,2,2},
            {9,3,4,7,3,4,1},
            {3,5,4,3,6,3,8},
            {3,4,4,6,3,4,4},
            {3,7,4,8,3,8,4},
            {6,3,5,9,2,7,9},
        };
        System.out.print("        \t");
        for(String day: days){
            System.out.print(day + "\t");
        }
        for(int i = 0; i<employee.length; i++){
            System.out.println();
            System.out.print(employee[i] + "       ");
            
            for(int j = 0; j < hours[i].length; j++ ){
                System.out.print(hours[i][j] + "\t");
            }
        }
        
        
    }
    
}
