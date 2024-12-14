public class Banknotes {
    public static void main(String[] args){
        int value = Integer.parseInt(args[0]);
        int note1 = 0;
        int note5 = 0;
        int note10 = 0;
        int note50 = 0;

        if (value >= 50){
            note50 = value/50;
            value -= note50*50;
        } if (value >= 10){
          note10 = value/10;
          value -= note10*10;
        } if (value >= 5){
            note5 = value/5;
            value -= note5*5;
        } if (value >= 1){
            note1 = value;
            value -= value;
        }

        System.out.println("Banknotes necessary: ");
        System.out.printf("R$ 50.00 = %d\n", note50);
        System.out.printf("R$ 10.00 = %d\n", note10);
        System.out.printf("R$ 5.00 = %d\n", note5);
        System.out.printf("R$ 1.00 = %d", note1);
    }
}
