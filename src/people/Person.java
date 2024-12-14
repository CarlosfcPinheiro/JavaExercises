package people;

public abstract class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void readData(){
        System.out.printf("\nName: %s", this.name);
        System.out.printf("\nAge: %d", this.age);
    }
}
