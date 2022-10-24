package bai15;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Điền a");
        int a = scanner.nextInt();
        System.out.println("Điền b");
        int b = scanner.nextInt();
        if (a != 0 ){
            double solution = -b / a;
            System.out.println("The solution is :" +  solution);
        }else {
            if (b ==0 ) {
                System.out.println("The solution all X");
            } else {
                System.out.println("No solution");
            }
        }
    }
}
