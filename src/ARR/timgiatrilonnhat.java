package ARR;

import java.util.Scanner;

public class timgiatrilonnhat {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("ĐỘ dài mảng lớn hơn 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0 ;
        while (i < arr.length);
        System.out.println("Enter Element" + (i + 1) + ":");
        arr[i] = scanner.nextInt();
        i++;
        System.out.println("Property list:");
        for (int j = 0 ; j < arr.length ; j++) {
            System.out.println(args[j] + "\t");

        }
        int max = arr[0];
        int index = 1;
        for (int j = 0 ; j < arr.length ; j ++) {
            if (arr[j] > max){
                max = arr[j];
                index += j;
            }
        } System.out.println("The largest property value in the list is" + max + " ở vị trí" + index);
    }
}
