import java.util.Scanner;
class Factorial
{
  public static void main(String args[])
  {
    System.out.println("N=");
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int i=1,fact=1;
    while(i<=num)
    {
      fact=fact*i;
      i++;

    }
  System.out.println(num+"factorial ="+fact);
  }
}