/**
 *
 * @author macbook
 */
import java.util.Scanner;
public class Lottery {

    public static void main(String[] args) {
        int lottery = (int) (Math.random()* 100); //tip olarak sabit bir değişke tanımla
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits ) : ");
        int guess = input.nextInt();
        int lotdig1 = lottery / 10; //onlar 
        int lotdig2 = lottery % 10; //birler
        int guesdig1 = guess / 10 ; //onlar
        int guesdig2 = guess % 10 ; //birler
        System.out.println("Lottery number is : " + lottery);
        if ( guess == lottery ){
            System.out.println("Exact match you win : $10.000");
        }
        else if ((lotdig1 == guesdig2) && (lotdig2 == guesdig1) ){
            System.out.println("Match all digits : you win $3.000");
        }
        
        else if ((lotdig1 == guesdig1) || (lotdig1 == guesdig2) || (lotdig2 == guesdig1) || (lotdig2 == guesdig2) ){
            System.out.println("Match one digit you win : $1.000");
        }
        
        else {
            System.out.println("Sorry, no match");
        }
        
        
    }
    
}
