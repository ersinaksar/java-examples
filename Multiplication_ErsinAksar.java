import java.util.Scanner;


public class Multiplication_ErsinAksar {

    
    public static void main(String[] args) {
        final int questionNumber = 10;
        int corrects = 0;
        int question = 0;
        long timeStart = System.currentTimeMillis();
        String result = " "; //sonuçları bu stringde line line tutacağız
        Scanner input = new Scanner(System.in);
        
        while(question < questionNumber){
            int x = 1 + (int) (Math.random()*12); //1 den 12 ye kadar 12 dahil random sayılar üretiyor
            int y = 1 + (int) (Math.random()*12);
            int z = x*y;
            System.out.print("What is " + x + "x" + y + "= ?");
            int userAnswer = input.nextInt();
            if(userAnswer == z){
                System.out.println("Your answer is correct well done");
                corrects = corrects + 1;
            }
            else{
                System.out.println("Your answer is wrong");
            }
            
            result += "\n" + x + "x" + y + "=" + userAnswer + ( (userAnswer == z)? " correct" : " wrong");
            
            question++;
        }
        
        long timeStop = System.currentTimeMillis();
        long testTime = timeStop - timeStart;
        
        
        System.out.println("Correct answer number is " + corrects + "\nTest time is " +
                testTime/1000 + "seconds\n" + result );
        
        
        
        
        
        
        
        
    }
    
}
