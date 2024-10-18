public class greaterLen {
    String[] names = {"Carlos", "Adalberto", "Fabrizio"};

    // Shows the greater length
    public static void main(String[] args){
        greaterLen greater = new greaterLen();
        String[] names = greater.names;

        int[] lens = new int[3];
        String greaterName = "";

        for (int i=0; i<names.length; i++){
            lens[i] = names[i].length();
        }

        for (int c=0; c<lens.length; c++){
            if (lens[c] > lens[c+1] || lens[c] > lens[c+2]){
                greaterName = names[c];
                break;
            }
        }

        System.out.println("The greater name is: " + greaterName);

    }
}
