public class BinarySearch {
    static int Search(int[] OrderedArray, int num){
        int start = 0;
        int end = OrderedArray.length-1;
        int middle;

        while(start <= end){
            middle = (start+end)/2;

            if (OrderedArray[middle] == num){
                return middle;
            } else if(OrderedArray[middle] < num){
                start++;
            } else if (OrderedArray[middle] > num){
                end--;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] array = {1, 5, 7, 8, 9, 11, 13};
        System.out.print(Search(array, 13));
    }
}
