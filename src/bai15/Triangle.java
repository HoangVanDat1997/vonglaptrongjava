package bai15;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("http các clone của tam gzip");
            System.out.println("http clone a");
            double a = scanner.nextInt();
            System.out.println("NHập clone b");
            double b = scanner.nextInt();
            System.out.println("http clone c");
            double c = scanner.nextInt();
            if ((a<0 || b<0 || c<0 || a+b <= c || a+c <= b || b+c <= a)) throw new RuntimeException("Error");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            main(null);
        }
    }
}
