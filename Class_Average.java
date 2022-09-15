import java.util.Scanner;
public class Class_Average{
 public static void main(String[]args){
  System.out.println("Enter the marks obtained in Math : ");
  Scanner v = new Scanner(System.in);
  int Math = v.nextInt();
  System.out.println("Enter the marks obtained in English: ");
  Scanner a = new Scanner(System.in);
  int Eng = a.nextInt();
  System.out.println("Enter the marks obtained in Science: ");
  Scanner i  = new Scanner(System.in);
  int Sci = i.nextInt();
  System.out.println("Enter the marks obtained in SocSt :  ");
  Scanner s = new Scanner (System.in);
  int SocSt = s.nextInt();
  System.out.println("Enter the marks obtained in Hindi: ");
  Scanner h = new Scanner(System.in);
  int Hin= h.nextInt();
  int Total = Math+Eng+Sci+SocSt+Hin;
  double Avg = (Total/5);
  if (Avg >= 90){
    System.out.println("Grade S");
  }
  else if (Avg < 90 && Avg>= 80){
    System.out.println("Grade A");
  }
  else if( Avg < 80 && Avg >= 70){
    System.out.println("Grade B");
  }
  else if (Avg < 70 && Avg>= 60){
     System.out.println("Grade C");
  }
  else if ( Avg <60 && Avg >= 50){
     System.out.println("Grade D");
  }
  else{
     System.out.println("Grade F");
  }
  System.out.println("Total : "+Total);
  System.out.println("Average Marks obtained : "+Avg);
 }
}