package Generics;

public class Phone {
    private String brand;
    private String name;

    public Phone(String brand, String name){
        this.brand = brand;
        this.name = name;
    }

    public String getBrand(){
        return brand;
    }

    public String getName(){
        return name;
    }

    // Represents the class as a text
    // @Override is used to overwrite the class method which is already assigned
    @Override
    public String toString(){
        return "Phone: " + name + " with brand: " + brand;
    }
}
