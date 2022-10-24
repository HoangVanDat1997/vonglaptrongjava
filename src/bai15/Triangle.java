package bai15;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập các cạnh của tam giác");
            System.out.println("nhập cạnh a");
            double a = scanner.nextInt();
            System.out.println("NHập cạnh b");
            double b = scanner.nextInt();
            System.out.println("Nhập cạnh c");
            double c = scanner.nextInt();
            if ((a<0 || b<0 || c<0 || a+b <= c || a+c <= b || b+c <= a)) throw new RuntimeException("Erro");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            main(null);

        }
    }
}
