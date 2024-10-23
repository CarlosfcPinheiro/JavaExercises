public class matrixSum {
    int[][] matrix = new int[5][5];

    public static void main(String[] args){
        int[][] matrix = new matrixSum().matrix;
        int[] sumArr = new int[matrix.length];

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix.length; j++){
                matrix[i][j] = (int)(Math.random()*9);
                sumArr[i] += matrix[i][j];
            }
        }
        System.out.print("|");
        for (int i=0; i<matrix.length; i++){
            System.out.print(sumArr[i] + "|");
        }

    }
}
