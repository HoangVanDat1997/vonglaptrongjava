package baitap2;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ProductManager implements ABC {
    private final ArrayList<Product> arrayList;

    public ProductManager() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void add(int choice, Scanner scanner) {
        System.out.println("Nhập id");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập gìdđó");
        Integer quantity = Integer.valueOf(scanner.nextLine());
        if (choice < 1 || choice > 3) {
            System.out.println("sai");
        } else if (choice == 1) {
            arrayList.add(new Product(id,  name, price, quantity, new Category()));
        }
    }

    @Override
    public void update(Scanner scanner) {
        System.out.println("Nhập vị trí sửa");
        Long idUpdate = Long.parseLong(scanner.nextLine());
        int indexUpdate = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (Objects.equals(arrayList.get(i).getId(), idUpdate)) {
               idUpdate = Long.valueOf(i);
            }
        }
       if (indexUpdate != -1){
           System.out.println("Nhập id mới");
           Long id = Long.parseLong(scanner.nextLine());
           System.out.println("Nhập tên mới");
           String name = scanner.nextLine();
           System.out.println("Nhập giá mới");
           Double price = Double.parseDouble(scanner.nextLine());
           System.out.println("Nhập gìdđó mới");
           Integer quantity = Integer.valueOf(scanner.nextLine());
    }

}

        @Override
        public void delete () {

        }

    @Override
    public String toString() {
        return "ProductManager{" +
                "arrayList=" + arrayList +
                '}';
    }

    @Override
        public void display () {


        }
}
