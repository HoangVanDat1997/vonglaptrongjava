package minitesst;

import java.util.Objects;
import java.util.Scanner;

public class ProductManager {
   public ProductManager() {
   }

   static Product[] products = new Product[50];
   static int abcproduc = 0;
   public void addProduct(String name, int price, String description){
      products[abcproduc++] = new Product(name,price,description);

   }
   public void updateProduct(int index){
      Scanner scanner = new Scanner(System.in);
      System.out.println("name :");
      String name = scanner.nextLine();
      System.out.println("price:");
      int price = scanner.nextInt();
      scanner.nextLine();
      System.out.println("description");
      String description = scanner.nextLine();
      if (!Objects.equals(name , "")){
         products[index].setName(name);
      }
   }
   public void deleteProduct(){

   }
   public void displayProduct(){

   }
   public void displayMaxPriceProduct(){

   }
}
