import java.util.Scanner;  
public class SumOfgivenDigits
{  
  public static void main(String arg[])  
  {  
  long num, Sum;
  int digit;
  System.out.println("Enter N value : ");
  Scanner v = new Scanner(System.in);
  digit = v.nextInt();  
  Scanner a=new Scanner(System.in);  
  System.out.print("Enter a " +digit+" digit number: ");    
  num=a.nextLong();    
  for(Sum=0; num!=0; num=num/10)  
  {      
    Sum = Sum + num % 10;  
  }  
  System.out.println("Sum of"+digit+ " number: "+Sum);  
}  
}