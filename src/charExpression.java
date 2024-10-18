public class charExpression {
    String expression1 = "By the way";
    String expression2 = "the";

    int position;

    public static void main(String[] args){
        charExpression Expressions = new charExpression();

        // String[] array => modern notation than "String array[]"
        String[] exp1 = Expressions.expression1.toLowerCase().split(" ");
        String exp2 = Expressions.expression2.toLowerCase().trim();

        // == compare two same objects on the same memory address (refer to the object)
        for (int i=0; i<exp1.length; i++){
            if (exp1[i].equals(exp2)){
                System.out.println(i);
                Expressions.position = i;
            }
        }

        System.out.println("The position of this word on the text is: " + Expressions.position);
    }
}
