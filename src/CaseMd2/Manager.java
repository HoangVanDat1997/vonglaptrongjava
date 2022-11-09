package CaseMd2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

public class Manager {
    List<Canbogiaovien> ListCanbo;

    public Manager() {
        ListCanbo = new ArrayList<>();
    }

    public void Delete(Scanner scanner) {
        System.out.println("Nhập vị trí giáo viên cần xoá theo index:");
        ListCanbo.remove(Integer.parseInt(scanner.nextLine()));
    }

    public void Update(Scanner scanner) {
        System.out.println("Nhập vị trí giáo viên cần sửa theo index:");
        int indexUpdate = Integer.parseInt(scanner.nextLine());
        if (indexUpdate >= 0) {
            try {
                System.out.println("nhập tên giáo viên");
                String Name = scanner.nextLine();
                ListCanbo.get(indexUpdate).setName(Name);
                System.out.println("Nhập ngày sinh giáo viên");
                LocalDate localDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                scanner.nextLine();
                System.out.println("Nhập quê quán giáo viên");
                String Quequan = scanner.nextLine();
                ListCanbo.get(indexUpdate).setQuequan(Quequan);
                System.out.println("Nhập lương thưởng");
                double Luongthuong = Double.parseDouble(scanner.nextLine());
                ListCanbo.get(indexUpdate).setLuongthuong(Luongthuong);
                System.out.println("Nhập lương phạt");
                double Luongphat = Double.parseDouble(scanner.nextLine());
                ListCanbo.get(indexUpdate).setLuongthuong(Luongphat);
                System.out.println("Nhập lương cứng");
                double Luongcung = Double.parseDouble(scanner.nextLine());
                ListCanbo.get(indexUpdate).setLuongthuong(Luongcung);
            } catch (Exception e) {
                System.out.println("Phát sinh lỗi , mời nhập lại");
            }
        }
    }


    public void addCanbogiaovien(Scanner scanner) throws Exception {
        System.out.println("nhập tên giáo viên");
        String Name = scanner.nextLine();
        System.out.println("Nhập ngày sinh giáo viên");
        try {
            LocalDate localDate = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            scanner.nextLine();
            System.out.println("Nhập quê quán giáo viên");
            String Quequan = scanner.nextLine();
            System.out.println("Nhập lương thưởng");
            double Luongthuong = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập lương phạt");
            double Luongphat = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập lương cứng");
            double Luongcung = Double.parseDouble(scanner.nextLine());
            Canbogiaovien canbogiaovien = new Canbogiaovien(Name, localDate, Quequan, Luongthuong, Luongphat, Luongcung);
            ListCanbo.add(canbogiaovien);
        } catch (DateTimeException | InputMismatchException | NumberFormatException e) {
            System.out.println("Phát sinh lỗi , mời nhập lại");
        }
    }

    public void ShowAll() {
        for (Canbogiaovien canbogiaovien : ListCanbo) {
            System.out.println(canbogiaovien);
        }
    }

    public void LuongNhohon8tr() {
        for (Canbogiaovien canbogiaovien : ListCanbo) {
            if (canbogiaovien.Luongthuclinh() <= 8000000) {
                System.out.println(canbogiaovien);
            }
        }

    }

    public void LuongLonHon15000000tr() {
        for (Canbogiaovien canbogiaovien : ListCanbo) {
            if (canbogiaovien.Luongthuclinh() >= 15000000) {
                System.out.println(canbogiaovien);
            }
        }
    }
}
