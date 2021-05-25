
/**
 *
 * @author macbook
 */
import java.util.Scanner;

public class FormatDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tablo şeklinde sütun başlıklarını string formatında yazdırıyor
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
        int degrees = 30;
        double radians = Math.toRadians(degrees);//dereceden radyana  
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
    }

}
