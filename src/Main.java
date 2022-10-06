import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println(number + "is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i < Math.sqrt(number)){
                if (number % 1 == 0){
                    check=false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + " is a prime");
            }else{
                System.out.println(number + " is a not prime");
            }
        }
    }
}


