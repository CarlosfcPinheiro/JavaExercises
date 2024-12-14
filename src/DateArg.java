public class DateArg {
    public static void main(String[] args){
        String day = args[0];
        String month = args[1];
        String year = args[2];

        displayDate(day, month, year);
    }

    public static void displayDate(String day, String month, String year){
        System.out.printf("Date: %s/%s/%s", day, month, year);
    }
}
