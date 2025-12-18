import java.util.Scanner;
public class weekday {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter day number of the month: ");
      int day = sc.nextInt();
      int weekday = day % 7;
      if (weekday == 1) {
          System.out.println("Monday");
      }
      if (weekday == 2) {
          System.out.println("Tuesday");
      }
      if (weekday == 3) {
          System.out.println("Wednesday");
      }
      if (weekday == 4) {
          System.out.println("Thrusday");
      }
      if (weekday == 5) {
          System.out.println("Friday");
      }
      if (weekday == 6) {
          System.out.println("Saturday");
      }
      if (weekday == 7) {
          System.out.println("Sunday");
      }
       sc.close();
  }
}