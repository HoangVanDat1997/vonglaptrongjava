package bai13;

import java.util.Arrays;

public class SelectionSort {
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void sort(int [] arr){
        for (int i = 0 ; i < arr.length;i++){
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) swap(arr, i, j);
        }
    }

    public static void main(String[] args) {
        int [] arr = {12,345,68,79,80,4,532,414,235,457,43,513,45,65,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
