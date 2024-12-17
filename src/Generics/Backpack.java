package Generics;

import java.util.ArrayList;
import java.util.List;

public class Backpack<T> {
    // Initialize array
    private List<T> items;

    public Backpack(){
        items = new ArrayList<>();
    }

    // Insert data
    public void addItem(T item){
        items.add(item);
    }

    public void showItems(){
        for (T item : items){
            System.out.println(item);
        }
    }
}
