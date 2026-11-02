//1. Write statements for each of the following.
//a. Find the largest integer n so that n3 is less than 2000.
int n = 0;
double ans = 0;
while (ans <2000){
  n++;
  ans = n*n*n;
  IO.print(ans)
}
//b. Display the square number of the first twelve integers starting from 1.
for(int i=1,i<=12,i++){
  IO.println(i*i)
}
//c. Display a 4-by-5 matrix using random number within 0 to 100.
Random rand = new Random();
int num = rand.nextInt(101);
int row = 0;
int col = 0;
for (row = 0,row<=4,row++){
  for(col=0,col<=5,col++)
      IO.println(num)
}
//d. Compute the sum of numbers from 1 to a given number.
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int sum = 0;
for (int i = 0,i<=num,i++){
  sum+=i;
}
IO.println("The sum is" + sum);
//e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
double sum = 0;
for(int i =1,i<=25,i++){
  sum+=i;
  sum=sum/(26-i);
}
IO.printf("The sum is %.2f%n",sum);
//2. Correct the error for the following statements.
a.
for (x = 10; x > 0; x++)
sum += x;
//correct
for (x = 10; x < 0; x--)
sum += x;
b.
  int x = 0;
  int y = 0;
do{
 x += 2;
 y += x;
 System.out.println(x + " and " + y);
}while (x < 100);
  //correct
do
 x += 2;
 y += x;
 System.out.println(x + " and " + y);
while (x < 100)
c.
for ( x==1, y==20; x < y, x++, y-=2);
 System.out.println(x & " " & y);
//correct
for ( x=1, y=20; x < y, x++, y-=2);
 System.out.println(x & " " & y);
d.
i =1;
while(i<10) {
 if (i==10)
 System.out.println("Program End");
}
//correct
int i =1;
while(i<10) {
  i++
  if (i==10);
}
System.out.println("Program End");
//3. Write the statements that display the first ten values of the Fibonacci sequence. Given the formula f1 = 1, f2 =1, fn = fn-1 + fn-2.
int f1 = 1;
int f2 = 2;
int count = 2;
while(count<10){
  int f = f1 + f2
  IO.printf(f+" ")
  f1 = f2;
  f2 = f;
  count++;
}
//4. Write the statements that display the string in reverse order. (use String.length() to get the length of the string)
Scanner sc = new Scanner(System.in);
String bla = sc.nextString();
int sLength = bla.length();
int i = sLength;
while(i<sLength){
  i--;
  IO.print(bla.charAt(i));
}
