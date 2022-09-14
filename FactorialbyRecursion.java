import java.util.Scanner;
public class FactorialbyRecursion{
  public static void main(String[]args){
     int s;
     System.out.print("Enter the value of n : ");
     Scanner sc = new Scanner(System.in);
     s=sc.nextInt();
     long Factorial = multiplyNumbers(s);
     System.out.println("Factorial of " + s + " = " + Factorial);
    }
    public static long multiplyNumbers(int s)
    {
        if (s >= 1)
            return s * multiplyNumbers(s - 1);
        else
            return 1;
    }
}