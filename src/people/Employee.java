package people;

public class Employee extends Adult{
    private double salary;
    private String function;

    public Employee(
            String name,
            int age,
            String gender,
            String rg,
            String cpf,
            String function,
            double salary){

        super(name, age, gender, rg, cpf);
        this.salary = salary;
        this.function = function;
    }

    public void readData(){
        System.out.printf("\nFunction: %s", this.function);
        System.out.printf("\nSalary: %.2f\n", this.salary);
    }
}
