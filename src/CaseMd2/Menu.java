package CaseMd2;

import java.util.Scanner;

public class Menu {
    public void Menu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        int number =-1;
        do{
            System.out.println("Mời bạn chọn");
            System.out.println("Ấn 1 để nhập thông tin cán bộ giáo viên");
            System.out.println("Ấn 2 để hiện thông tin cán bộ giáo viên");
            System.out.println("Ấn 3 để xem thông tin giáo viên có lương nhỏ hơn 8 triệu");
            System.out.println("Ấn 4 để xem thông tin giáo viên có lương lớn hơn 15 triệu");
            System.out.println("Ấn 5 để sửa thông tin giáo viên");
            System.out.println("Ấn 6 để xoá giáo viên đó khỏi danh sách");
            System.out.println("Ấn 7 để sắp xếp lại");
            System.out.println("Ấn 0 để thoát chương trình");
            int numbers =Integer.parseInt(scanner.nextLine());
            switch (numbers){
                case 1:
                    manager.addCanbogiaovien(scanner);
                case 2:
                    manager.ShowAll();
                    break;
                case 3:
                    manager.LuongNhohon8tr();
                    break;
                case 4:
                    manager.LuongLonHon15000000tr();
                case 5:
                    manager.Update(scanner);
                    break;
                case 6:
                    manager.Delete(scanner);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
                    break;

            }
        }while (number!=0);
    }
}
