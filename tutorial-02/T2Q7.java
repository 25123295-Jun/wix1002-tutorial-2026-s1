package lab2;
import java.util.Scanner;
public class T2Q7 {
    static void main(String args[]){
        System.out.println("Enter the value in inch and converts to meter");
        Scanner inch = new Scanner(System.in);
        double newInch = inch.nextDouble();
        double meter = newInch * 2.54/100;
        System.out.println("The value in meter is "+ meter);
    }
}
