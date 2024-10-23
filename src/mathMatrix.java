public class mathMatrix {
     int[][] bidMatrix = {
            {1, 2},
            {3, 4},
    };

    public static void main(String[] args){
        int[][] bidMatrix = new mathMatrix().bidMatrix;
        int factor1 = 0, factor2 = 0;

        for (int i=0; i<bidMatrix.length; i++){
            for (int j=0; j<bidMatrix.length; j++){
                factor1 *= bidMatrix[i][j+1];
            }
        }

    }
}
