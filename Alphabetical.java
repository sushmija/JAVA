import java.util.*;
class Alphabetical{
 public static void main(String[] args){
 Scanner v=new Scanner (System.in);
 List<String>li=new ArrayList<>();
 System.out.println("enter the number of inputs");
 int n=v.nextInt();
 for(int i=0;i<n;i++){
 li.add(v.next());
 }
 Collections.sort(li);
 System.out.println("enter a-ascending d-descending order");
 String input=v.next();
 if(input.charAt(0)=='v'){
 for (String s : li){
 System.out.println(s);
 }
 }
 else if(input.charAt(0)=='d'){
 Collections.reverse(li);
 for(String s:li){
 System.out.println(s);
 }
 }
 else{
 System.out.println("enter either a or d ");
 }
 }
}