import java.util.*;
class Reverse_loop{
 public static void main(String []args){
 Scanner m=new Scanner(System.in);
 try{
 int num=m.nextInt();
 System.out.println(numrev(num));
 }
 catch (Exception e){
 System.out.println("enter the integer number only");
 }
 }
 public static int numrev(int num){
 int rev=0;
 while(num!=0){
 int rem=num%10;
 rev=rev*10+rem;
 num=num/10;
 }
 return rev;
 }
 }