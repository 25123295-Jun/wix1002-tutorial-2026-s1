package lab2;
import java.util.Scanner; 
public class T2Q5 {
    static void main(String[] args) {
        // a
        double AMOUNT = 32.5;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);
        //b
        String chapter = "Summary";
        System.out.println("chapter");
        //c
        int num = 0;
        num++;
        int num1 = num;
        System.out.println("The number is "+num1);
        //d
        double numD = 3000;
        System.out.printf("%.2f\n",numD);
        //e
        String contact;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your contact");
        contact = keyboard.nextLine();
        System.out.println("The contact is "+contact);
    }
}
