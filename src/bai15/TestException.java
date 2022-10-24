package bai15;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numerator;");
        int numerator = scanner.nextInt();
        System.out.println("Denominator");
        int denominator = scanner.nextInt();
        int result = numerator/denominator;
        System.out.println(result);
    }
}
