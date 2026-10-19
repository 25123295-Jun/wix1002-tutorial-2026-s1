package lab2;
import java.util.Scanner;
public class T2Q6 {
    static void main(String args[]){
        System.out.println("Enter Diameter to calculate the circumference of a circle:");
        Scanner diameter = new Scanner(System.in);
        double newDiameter = diameter.nextDouble();
        double circumference = newDiameter * Math.PI;
        System.out.println("The circumference of the circle is "+ circumference);
    }   
}
