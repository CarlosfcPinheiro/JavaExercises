import java.util.Scanner;
public class EvenSequence {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number;

        while(true){
            System.out.print("Digite um número inteiro: ");
            number = sc.nextInt();
            int sum = 0;

            if (number == 0){
                break;
            } else {
                int[] sumArr = new int[5];

                if (number % 2 == 0) {
                    sumArr[0] = number;
                } else{
                    sumArr[0] = number+1;
                }

                for (int i = 1; i < 5; i++){
                    sumArr[i] = sumArr[i-1]+2;
                }

                for (int i = 0; i < sumArr.length; i++){
                    sum += sumArr[i];
                }

                System.out.println("SOMA: " + sum);
            }

        }
    }
}
