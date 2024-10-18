public class course {
    String courseName = "Computer Science";
    String[] subjects = {"Calculus 1", "Numeric Analysis", "Logical Programming"};

    int duration = 4;
    int totalPeriods = 9;
    int numSubjects = subjects.length;
    int actualPeriod = 1;

    public static void main(String[] args){
        course cc = new course();

        System.out.println("Your course: " + cc.courseName);
        int difference = cc.totalPeriods - cc.actualPeriod;

        if (difference > 5){
            System.out.println("Good luck on the course ;-;");
        }

    }
}
