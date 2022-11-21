import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Day[] days = Day.values();
        String dayName=new Scanner(System.in).nextLine();
        for (Day day : days) {
          if (day.equals(Day.valueOf(dayName.toUpperCase(Locale.ROOT)))){
              System.out.println(day.toString());
          }
        }
    }
}