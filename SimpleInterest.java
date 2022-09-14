import java.util.Scanner; 
 public class SimpleInterest 
 { 
     public static void main(String args[])  
     { 
         float v, a, i, sinterest; 
         Scanner scan = new Scanner(System.in); 
         System.out.print("Enter the Principal : "); 
         v = scan.nextFloat(); 
         System.out.print("Enter the Rate of interest : "); 
         a = scan.nextFloat(); 
         System.out.print("Enter the Time period : "); 
         i = scan.nextFloat(); 
         scan.close(); 
         double interest = (v * a * i) / 100; 
         System.out.print("Simple Interest is: " +interest); 
     } 
 } 