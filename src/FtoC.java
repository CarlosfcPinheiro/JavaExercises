import java.util.Scanner;
public class FtoC {
    // C = 5*(F-32)/9
    // F = (C*9/5)+32
    String choice;
    double temp;
    double result;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        FtoC conversor = new FtoC();

        System.out.print("Você vai digitar em qual escala: ");
        conversor.choice = sc.nextLine();
        String choice = conversor.choice.trim().toUpperCase();

        System.out.print("Digite a temperatura: ");
        conversor.temp = sc.nextDouble();
        double temp = conversor.temp;
        switch (choice){
            case "F":
                conversor.result = (temp-32)*5/9;
            case "C":
                conversor.result = (temp*9/5)+32;
        }

        double result = conversor.result;
        System.out.print("Essa é a sua temperatura converdita" + choice+": " + result);

    }
}
