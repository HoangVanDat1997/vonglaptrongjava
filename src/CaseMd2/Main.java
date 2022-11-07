package CaseMd2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        int number =1;
        while(number!=0){
            System.out.println("Mời bạn chọn");
            System.out.println("Ấn 1 để nhập thông tin cán bộ giáo viên");
            System.out.println("Ấn 2 để hiện thông tin cán bộ giáo viên");
            System.out.println("Ấn 3 để xem thông tin giáo viên có lương lớn hơn 8 triệu");
            System.out.println("Ấn 0 để thoát chương trình");
            int numbers = sc.nextInt();
            switch (numbers){
                case 1:
                    sc.nextLine();
                    System.out.println("nhập tên giáo viên");
                    String Name = sc.nextLine();
                    System.out.println("Nhập ngày sinh giáo viên");
                    try {
                        LocalDate localDate = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
                        sc.nextLine();
                        System.out.println("Nhập quê quán giáo viên");
                        String Quequan = sc.nextLine();
                        System.out.println("Nhập lương thưởng");
                        double Luongthuong = Double.parseDouble(sc.nextLine());
                        System.out.println("Nhập lương phạt");
                        double Luongphat = Double.parseDouble(sc.nextLine());
                        System.out.println("Nhập lương cứng");
                        double Luongcung = Double.parseDouble(sc.nextLine());
                        manager.addCanbogiaovien(new Canbogiaovien(Name, localDate, Quequan, Luongthuong, Luongphat, Luongcung));
                        break;
                    }catch (DateTimeException | InputMismatchException | NumberFormatException e){
                        System.out.println("Phát sinh lỗi , mời nhập lại");
                    }
                case 2:
                    manager.ShowAll();
                    break;
                case 3:
                    manager.LuongNhohon8tr();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    break;

            }
        }
    }
}
