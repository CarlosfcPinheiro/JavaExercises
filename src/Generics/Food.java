package Generics;

public class Food {
    private String name;

    public Food(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Food: " + name;
    }
}
