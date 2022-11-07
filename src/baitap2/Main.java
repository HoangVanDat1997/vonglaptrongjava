package baitap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        do {
        System.out.println("Manu");
        System.out.println("1.thêm");
        System.out.println("2.Sửa");
        System.out.println("3.Xoá");
        System.out.println("4.Hiện");
        Integer choice = Integer.parseInt(scanner.nextLine());



        switch (choice) {
            case 1:productManager.add(1,new Scanner(System.in));
            break;
            case 2:productManager.update(new Scanner(System.in));
            break;
            case 3:productManager.delete();
            break;
            case 4:
                productManager.display();
            case 0:
                System.exit(0);
            default:
        }
    }while (true);
    }
}
