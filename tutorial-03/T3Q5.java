package lab3;

public class T3Q5 {
    static void main(strings args[]){
        int lYear = 2024;
        if(year>=1000 && year<=9999)
            if (year%4 == 0 && year%100 !=0 || year%400==0){
                IO.print("leapyear");
            }else{
                IO.print("Not a leapyear");
            }else{
                IO.print("Not valid");
        }
    }
}
