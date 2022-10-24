package bai13;

public class LineSearch {
    public static int lineSearch(int[] array , int value) {
        int index = -1;
        for (int i = 0 ; i < array.length ; i ++){
            if (value == array[i]){
                index = i;
                break;
            }
        }return index;
    }
}
