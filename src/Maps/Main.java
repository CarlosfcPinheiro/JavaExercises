package Maps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John Doe", 1);
        empIds.put("Carl", 2);
        empIds.put("Joel", 3);

        System.out.println(empIds);
        System.out.println(empIds.get("Carl"));

        empIds.replace("Carl", 5);
        System.out.println(empIds);
    }
}
