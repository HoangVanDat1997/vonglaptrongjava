package bai11;

import java.util.Arrays;
import java.util.Stack;

public class MyStack <E>{
    public static void main(String[] args) {
    Stack<Integer> myStack = new Stack<>();
    int[] num = new int[]{1,2,3,5,3,21};
    for (int i = 0 ; i < num.length ; i ++){
        myStack.push(num[i]);
    }
    for (int i = 0 ; i < num.length ; i ++){
        num[i] = myStack.pop();
    }
        System.out.println(Arrays.toString(num));
    }
}
