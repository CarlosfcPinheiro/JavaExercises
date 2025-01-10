package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Cat myCat = new Cat("Stella", 2);
        Field[] catFields = myCat.getClass().getDeclaredFields();

        // Change value from a private attribute
        for (Field field : catFields){
            if (field.getName().equals("name")){
                field.setAccessible(true);
                field.set(myCat, "Jacob");
            }
        }

        Method[] catMethods = myCat.getClass().getMethods();
        for (Method method : catMethods){
            if (method.getName().equals("Meow")){
                method.invoke(myCat);
            }
        }

        System.out.println(myCat.getName());
    }
}
