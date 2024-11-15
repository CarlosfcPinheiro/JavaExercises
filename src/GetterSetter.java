import java.util.Scanner;
// Attributes types
// private -> The member can only be accessed inside the class
// none -> The member can be accessed on the same package classes
// protected -> That can be accessed on the same package classes and different subclasses in different packages
// public -> The member can be accessed for all the classes

public class GetterSetter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Instanciating class Product
        Product product1 = new Product("Milk", 9.30, 3);
        // Call class method getter name
        System.out.println("Product name: " + product1.getName());
        // Call class method to setter new name
        System.out.print("Enter a new name of the product: ");
        String newName = sc.nextLine();
        product1.setName(newName);

        // New name
        System.out.println("Product name: " + product1.getName());
    }
}
