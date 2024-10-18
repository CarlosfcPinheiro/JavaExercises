class Occur{
    static void occur_A(String word){
        int count_A = 0;
        String[] sub_strings = word.trim().split("");

        for (int i=0; i<sub_strings.length; i++) {
            if (sub_strings[i] == "A"){
                count_A++;
            }
        }
        System.out.println("Letter A appear: "+count_A);
    }

    static void occur_a(String word){
        int count_a = 0;
        String[] sub_strings = word.split("");

        for (int i=0; i<sub_strings.length; i++) {
            if (sub_strings[i] == "a"){
                count_a++;
            }
        }
        System.out.println("Letter a appear: "+count_a);
    }
}

// Main method
public class letterA {
    public static void main(String[] args){
        String word = "coisado";
        Occur occur = new Occur();

        occur.occur_A(word);
        occur.occur_a(word);
    }
}
