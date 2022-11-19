public class Main {
    public static void main(String[] args) {

        Day[] days = Day.values();
        for (Day day : days) {
            System.out.println(day.name());
            System.out.println(day);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}