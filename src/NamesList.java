import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class NamesList {
    public static void main(String[] args){
        // Using interface List to instance ArrayList
        List<String> listNames = new ArrayList<>(5);

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Enter a name: ");
            String name = sc.nextLine();
            listNames.add(name);
        }

        System.out.println("Names list: " + listNames);
    }
}
