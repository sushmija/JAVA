import java.util.Scanner;
class Square_ofnumber
{
 public static void main(String[]args)
 {
   int M,N,a;
   System.out.print("Enter the number:");
   Scanner V=new Scanner(System.in);
   M=V.nextInt();
   N=M*M;
   System.out.println("The square of the entered number is"+N);
  }
}