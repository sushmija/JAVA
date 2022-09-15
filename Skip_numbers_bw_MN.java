import java.util.Scanner;
public class Skip_numbers_bw_MN 
{
 public static void main(String[] args)
 {
 Scanner v=new Scanner(System.in);
 System.out.println(" print the numbers from M to N by skipping K numbers ");
 System.out.println("Enter the values of M,N,and K");
 int M,N,K,i,j,b=-5,m,n,t;
 m=v.nextInt();
 n=v.nextInt();
 K=v.nextInt();
 System.out.println("The result is");
 if(m!=n)
 {
 if(n<m)
 {
 M=n;
 N=m;
 }
 else
 {
 M=m;
 N=n;
 }
 for(i=M;i<=N;i++)
 {
 System.out.println(i+" ");
 i=i+K;
 }
 
 }
 else
 {
 System.out.println("zero");
 }
}
}