public class orderLen {
    public static void main(String args[]){
        String S1, S2, S3;
        byte
                text1[] = new byte[20],
                text2[] = new byte[20],
                text3[] = new byte[20];

        System.out.println("Type 3 words: ");
        try{
            System.in.read(text1);
            System.in.read(text2);
            System.in.read(text3);
        } catch(Exception ex){
            System.out.println("Read text error...");
        }
        S1 = new String(text1).trim();
        S2 = new String(text2).trim();
        S3 = new String(text3).trim();

        int wordsLen[] = {S1.length(), S2.length(), S3.length()};
        int orderedLen[] = new int[3];
        int count;
        // Sorting algorithm
        for (int i=0; i<wordsLen.length; i++){
            count = 0;
            for (int c=0; c<wordsLen.length; c++){
                if (wordsLen[i] > wordsLen[c]){
                    count++;
                }
            }
            orderedLen[Math.abs(count-(wordsLen.length-1))] = wordsLen[i];
        }

        System.out.println("Ordered Array: " + orderedLen[0]+", "+orderedLen[1]+", "+orderedLen[2]);
    }
}
