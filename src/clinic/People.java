package clinic;

public class People {
    private String name;
    private String phone;
    private String gender;
    private int age;

    public People(String name, String phone, String gender, int age){
        this.name = name;
        this.phone = phone;
        this.gender = gender;
        this.age = age;
    }

    public void entryData(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showData(){
        System.out.println("\nName: " + this.name);
        System.out.println("Phone: " + this.phone);
        System.out.println("Gender: " + this.gender);
        System.out.println("Age: " + this.age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
