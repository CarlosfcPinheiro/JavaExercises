package Annotate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Cat myCat = new Cat("Lupi", 3);

        if (myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This class is very important");
        } else {
            System.out.println("This class is not very important :(");
        }

        // for each class Method in the class methods on the methods array
        for (Method method : myCat.getClass().getDeclaredMethods()) {
            // If actual method exists
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                // get int variable time from annotation parameter
                for (int i=0; i<annotation.time(); i++){
                    method.invoke(myCat);
                }
            }
        }

        for (Field field : myCat.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)){
                Object objectValue = field.get(myCat);

                if (objectValue instanceof String stringValue){
                    System.out.println(stringValue.toUpperCase());
                }
            }
        }
    }
}
