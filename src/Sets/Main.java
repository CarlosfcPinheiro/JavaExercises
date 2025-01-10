package Sets;

import java.util.*;

public class Main {
    public static void main(String[] args){
         Set<String> names = new HashSet<String>();

         names.add("John");
         names.add("Saul");
         names.add("Paul");

         names.add("Saul");


         Iterator<String> namesIterator = names.iterator();
         while (namesIterator.hasNext()){
             System.out.println(namesIterator.next());
        }

         List<Integer> numbers = new ArrayList<Integer>();

         numbers.add(1);
         numbers.add(3);
         numbers.add(11);
         numbers.add(5);
         numbers.add(3);
         numbers.add(1);

         Set<Integer> numberSet = new HashSet<>(numbers);
         System.out.println(numberSet);
    }
}
