package Generics;

public class Main {
    public static void main(String[] args){
        Backpack<Object> backpack = new Backpack<>();

        Book book1 = new Book("Cosmos", "Carl Sagan");
        Book book2 = new Book("Dom Casmurro", "M. Assis");

        Food milk = new Food("Milk");

        Phone phone = new Phone("Samsung", "Galaxy A51 S");

        backpack.addItem(book1);
        backpack.addItem(book2);
        backpack.addItem(milk);
        backpack.addItem(phone);

        backpack.showItems();
    }
}
