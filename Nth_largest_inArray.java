import java.util.Scanner;
public class Nth_largest_inArray{
 public static void main(String[] args)
 {
try{
 int i,x;
 Scanner v=new Scanner(System.in);
 System.out.println("Enter no of elements in array:");
 int n =v.nextInt();
 int arr[]=new int[n];
 for(i=0;i<n;i++)
 {
 System.out.print("Enter element "+(i+1)+" =");
 arr[i]=v.nextInt();
 }
 x=arr[0];
 for(i=1;i<n;i++)
 {
 if(x<arr[i])
 {
 x=arr[i];
 }
 }
 System.out.println("The largest number is="+x);
 }
 catch(Exception e)
 {
 System.out.println("invalid");
 }
 }
}