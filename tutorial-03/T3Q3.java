package lab3;

public class T3Q3 {
    static void main(String args[]) {
    //a
    if (x < 10)
if (y > 10)
System.out.println("*****");
else
System.out.println("#####");
System.out.println("$$$$$");
/*Output is 
#####
$$$$$
*/  
 //b
   if (x < 10) {
if (y < 10)
System.out.println("*****");
else{
System.out.println("#####");
/*Output is 
#####
*/  
//c.
if (x < 10) {
if (y < 10)
System.out.println("*****");
System.out.println("#####");
}
else {
System.out.println("$$$$$");
}
/*
The output is
$$$$$
*/
//d.
if (x > 10) {
if (y > 10) {
System.out.println("*****");
System.out.println("#####"); }
else
System.out.println("$$$$$");
}
$$$$$
}
