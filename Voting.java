import java.util.Scanner;
 
public class Voting {
 public static void main(String[] args) 
 {
    int age, dif;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter your age: ");
    age = scan.nextInt();
    
    if(age>=18)
    {
        System.out.println("You are eligible for voting.");
    }
    else
    {
    dif = (18 - age);
    System.out.println("You can vote after: "+ dif + " years");
    }
 }
}