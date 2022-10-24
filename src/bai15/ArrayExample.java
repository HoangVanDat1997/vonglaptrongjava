package bai15;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer [] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng");
        for ( int i = 0 ; i < arr.length ; i ++){
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + "");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bất kỳ");
        int a = scanner.nextInt();
        try {
            System.out.println("Giá trị phần tử chỉ có số 5" + a + " là " + arr[a]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }
}
