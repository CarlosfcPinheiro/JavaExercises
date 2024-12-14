package people;

public class Main {
    public static void main(String[] args){
        Adult adult = new Adult("Carlos", 19, "Male", "2233223", "111.111.111-11");
        Employee employee = new Employee("Pedro", 16, "Male", "123123", "123.123.123-12", "Adm", 2000.00);

        Employee adultEmployee = new Employee("João", 18, "Male", "456456", "456.456.456-45", "Financial", 2500.00);

        Adult employeeAdult = adultEmployee;

        adult.readData();
        employee.readData();
        adultEmployee.readData();
    }
}
