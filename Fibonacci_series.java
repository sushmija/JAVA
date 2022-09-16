import java.util.Scanner;
public class Fibonacci_series{
 public static void main(String[] args)
 {
try{
 Scanner v=new Scanner(System.in);
 System.out.println("Enter an number");
 int n=v.nextInt();
 int a=0,b=1,c=0,z=n-2;
 System.out.print(a+" ");
 System.out.print(b+" ");
 while(z>0)
 {
 c=a+b;
 System.out.print(c+" ");
 a=b;
 b=c;
 z=z-1;
 }
 }
 catch(Exception e)
 {
 System.out.println("Invalid"); 
 }
 
 }
}
