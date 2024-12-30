package UseLambda;

public class Main {
    public static void main(String[] args){

        Printable lambdaPrint = (p, s) -> p + " Meow " + s;

        printThing(lambdaPrint);
    }

    static void printThing(Printable thing){
        thing.print("Hello", "!");
    }
}
