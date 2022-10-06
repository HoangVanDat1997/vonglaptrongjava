import java.util.Scanner;

public class ungdungtienlaichovay {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Số Tiền Gửi");
        money = input.nextDouble();
        System.out.println("Nhập Số Tháng Gửi");
        month= input.nextInt();
        System.out.println("Nhập Lãi Xuất");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0 ; i < month ; i ++);
        totalInterest += money * (interestRate/100) / 12 * month;
        System.out.println("Lãi Xuất" + interestRate);
    }
}
