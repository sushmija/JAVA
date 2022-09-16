import java.util.Scanner;
public class No_of_DaysinMonth {
  public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);
        int No_Of_DaysInMonth = 0; 
        String MonthName = "Unknown";
        System.out.print("Input a month number: ");
        int Month = input.nextInt();
        System.out.print("Input a year: ");
        int Year = input.nextInt();
        switch (Month) {
            case 1:
                MonthName = "January";
                No_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthName = "February";
                if ((Year % 400 == 0) || ((Year % 4 == 0) && (Year % 100 != 0))) {
                    No_Of_DaysInMonth = 29;
                } else {
                    No_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthName = "March";
                No_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthName = "April";
                No_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthName = "May";
                No_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthName = "June";
                No_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthName = "July";
                No_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthName = "August";
                No_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthName = "September";
                No_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthName = "October";
                No_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthName = "November";
                No_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthName = "December";
                No_Of_DaysInMonth = 31;
        }
        System.out.print(MonthName + " " + Year + " has " + No_Of_DaysInMonth + " days\n");
    }
}