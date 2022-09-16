import java.util.Scanner;
class Decimal_equivalent {
 public static void main(String[] args) {
 Scanner v = new Scanner(System.in);
 int decimal = v.nextInt();
 String binary = Integer.toBinaryString(decimal);
 System.out.println("BINARY IS " + binary);
 System.out.print("OCTAL IS ");
 System.out.println(Integer.toOctalString(decimal));
 }
}
