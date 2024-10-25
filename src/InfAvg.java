import java.util.Scanner;

public class InfAvg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idade, count = 0;
        double media = 0;

        System.out.print("Insira uma idade: ");
        idade = sc.nextInt();

        if (idade < 0){
            System.out.print("IMPOSSÍVEL DE CALCULAR");
        } else {
            do{
                media += idade;
                count += 1;
                System.out.print("Insira uma idade: ");
                idade = sc.nextInt();

            } while (idade > 0);

            System.out.printf("MÉDIA = %,.2f", media/(count));
        }

    }
}
