import java.util.Scanner;
public class No_of_year_weeks_days{
 public static void main(String args[]) {
 int s, year, week, day;
 Scanner v = new Scanner(System.in);
 System.out.print("Enter the number of days:");
 s = v.nextInt();
 year = s / 365;
 s = s % 365;
 System.out.println("No. of years:"+year);
 week = s / 7;
 s = s % 7;
 System.out.println("No. of weeks:"+week);
 day = s;
 System.out.println("No. of days:"+day);
 }
}
