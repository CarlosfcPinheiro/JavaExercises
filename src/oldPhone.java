import java.util.Scanner;

public class oldPhone {
    int reciveMin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Minutos que você ficou em ligação: ");

        return sc.nextInt();
    }

    int calcValue(int minutes){
        return (minutes-100)*2;
    }

    public static void main(String[] args){
        oldPhone phone = new oldPhone();
        int min, value;

        try{
            min = phone.reciveMin();
            if (min > 100){
                value = phone.calcValue(min)+50;
            } else {
                value = 50;
            }
            System.out.print("Você utilizou " + min + " e pagará: R$ " + value);

        } catch(Exception ex){
            System.out.print("Erro ao receber e calcular valor de custo..." + ex);
        }
    }
}