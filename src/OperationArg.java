import java.text.DecimalFormat;

public class OperationArg {
    public static void main(String[] args){
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[2]);

        String operation = args[1];

        DecimalFormat df = new DecimalFormat("#.##");

        double result = switch (operation) {
            // Lambda expression
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "x" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> 0;
        };

        System.out.printf("Result: %s", df.format(result));

    }
}
