package bai15;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập X");
        int x = scanner.nextInt();
        System.out.println("Nhập Y");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {

            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("TỔng x + y" + a);
            System.out.println("Tổng x - y" + b);
            System.out.println("Tích x * y" + c);
            System.out.println("Thương x / y" + d);
        }catch (Exception e){
            System.out.println("Ngoại lệ" + e.getMessage());
        }
    }
}
