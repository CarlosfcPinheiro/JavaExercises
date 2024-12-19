package Annotate;

@VeryImportant
public class Cat {

    @ImportantString
    String name;

    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    @RunImmediately(time=3)
    public void meow(){
        System.out.println("meow!");
    }

    @RunImmediately
    public void eat(){
        System.out.println("Munch");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
