import java.util.Scanner;

public class avg {
    double reciveData(){
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[2];

        System.out.print("Primeira nota: ");
        notas[0] = sc.nextDouble();

        System.out.print("Segunda nota: ");
        notas[1] = sc.nextDouble();

        return (notas[0] + notas[1])/2;
    }

    public static void main(String[] args){
        avg Avg = new avg();

        try{
            double media = Avg.reciveData();

            if (media >= 60){
                System.out.println("Você foi aprovado!");
            } else {
                System.out.println("Você foi reprovado...");

            }
        } catch(Exception err) {
            System.out.println("Erro ao ler as notas..." + err);
        }

    }
}
