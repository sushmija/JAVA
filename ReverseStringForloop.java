import java.util.Scanner;
class ReverseStringForloop{
public static void main(String args[]){
    String str;
    char ch;
    System.out.println("Enter a String as you wish: ");
Scanner scan=new Scanner(System.in);
    
   str =scan.nextLine();
   System.out.println("Reserve of given String "+str+" is : ");
   for(int j=str.length(); j>0; j--){
       System.out.print(str.charAt(j-1));
   }
}
}