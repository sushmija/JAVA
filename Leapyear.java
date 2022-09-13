import java.util.Scanner;
class Leapyear
{
   public static void main(String args[])
 {
   int date,month,year;
   Scanner s=new Scanner(System.in);
   date=s.nextInt();
   Scanner t=new Scanner(System.in);
   month=t.nextInt();
   Scanner u=new Scanner(System.in); 
   year=u.nextInt();
   System.out.println(date+"/"+month+"/"+year);
   if (month==0){
    System.out.println("Enter correct month");
   }
   else if(month>12){
    System.out.println("Enter correct month");
   }
   else if(date>31){
    System.out.println("Enter correct date");
   }
   else if(date==0){
    System.out.println("Enter correct date");
   }
   else if(year%4==0&& year%100!=0){
    System.out.println("It is a leap year");
   }
   else if(year%400==0){
      System.out.println("It is a leap year");
   }
   else{
     System.out.println("It is not a leap year");
   }
 }
}