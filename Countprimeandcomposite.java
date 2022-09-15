import java.util.*;
class Countprimeandcomposite{
 public static void main(String[] args){
 Scanner v=new Scanner(System.in);
 int n=v.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<n;i++){
 arr[i]=v.nextInt();
 }
 int c1=0,prime=0,com=0;
 for(int i=0;i<n;i++){
 c1=0;
 for(int j=1;j<=arr[i];j++){
 
 if(arr[i]%j==0){
 
 c1++;
 }
 }
 
 if(c1==2){
 prime++;
 }
 else if(c1>2){
 com++;
 }
 }
 System.out.println("prime="+prime+"composite="+com);
 }
}