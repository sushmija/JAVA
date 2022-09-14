import java.util.Scanner;
public class SquareandcubeofDecimal
{
  public static void main(String[]args)
  {
    double s;
    int square,cube;
    System.out.print("Given Number: ");
    Scanner sc = new Scanner(System.in);
    s = sc.nextDouble();
   
    System.out.println("Square Number: "+s*s);
   
    System.out.println("Cube Number: "+s*s*s);
  }
}