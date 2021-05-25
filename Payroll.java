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
public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter employee's name : " );
        String name = input.next();
        System.out.print("Enter numbers of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate:");
        double hourlyPay = input.nextDouble();
        
        System.out.print("Enter federal tax withholding rate: ");
        double federalWitholding = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateWitholding = input.nextDouble();
        
        System.out.println("");
        
        federalWitholding = federalWitholding * 100 ;
        stateWitholding = stateWitholding * 100;
        double grossPay = hours * hourlyPay;
        double federalTax = (federalWitholding * grossPay) /100;
        double stateTax = (stateWitholding * grossPay) / 100;
        double deduction = federalTax+ stateTax;
        double netPay = grossPay - deduction;
        System.out.println("Employee name: " + name);
        System.out.println("Hours Worked : " + hours);
        System.out.println("Pay Rate : $" + hourlyPay);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions : ");
        System.out.println("    Federal Witholding (" + federalWitholding + "%): $" + federalTax);
        System.out.println("    State Witholding (" + stateWitholding + "%): $" + stateTax);
        System.out.println("    Total Deduction: $" + deduction);
        System.out.println("Net Pay: $" + netPay);
        
        
    }
    
}
