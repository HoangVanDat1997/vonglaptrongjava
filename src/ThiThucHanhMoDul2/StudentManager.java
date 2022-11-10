package ThiThucHanhMoDul2;

import java.io.*;
import java.util.*;

public class StudentManager implements Serializable {
    List<CollegeStudent> ListStudent;

    public StudentManager() {
        ListStudent = new ArrayList<>();
    }
    public void addStudent(Scanner scanner) throws Exception {
        try {
            System.out.println("Enter Student Code");
            Integer studentCode = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter FullName");
            String fullName = scanner.nextLine();
            if (!ValidateClass.validate(ValidateClass.name_REGEX, fullName)){
                System.out.println("Nhập sai ký tự , nhập lại");
                addStudent(scanner);
            }
            System.out.println("Enter Age");
            Integer age = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Sex");
            String sex = scanner.nextLine();
            if (!ValidateClass.validate(ValidateClass.name_REGEX,sex)){
                addStudent(scanner);
            }
            System.out.println("Enter address");
            String address = scanner.nextLine();
            if (!ValidateClass.validate(ValidateClass.name_REGEX,address)) {
                System.out.println("Nhập sai ký tự , vui lòng chỉ nhập chữ");
                addStudent(scanner);
            }
            System.out.println("Enter mediumScore");
            Double mediumScore = Double.parseDouble(scanner.nextLine());
            CollegeStudent collegeStudent = new CollegeStudent(studentCode, fullName, age, sex, address, mediumScore);
            ListStudent.add(collegeStudent);
        } catch (NumberFormatException InputMismatchException ) {
            System.out.println("Phát sinh lỗi , mời nhập lại");
        }
    }

    public void uppDate(Scanner scanner) {
        System.out.println("Nhập mã sinh viên cần sửa");
        int Code = Integer.parseInt(scanner.nextLine());
        if (Code >= 0) {
            try {
                System.out.println("Enter Student Code");
                Integer studentCode = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter FullName");
                String fullName = scanner.nextLine();
                System.out.println("Enter Age");
                Integer age = scanner.nextInt();
                System.out.println("Enter Sex");
                String sex = scanner.nextLine();
                System.out.println("Enter address");
                String address = scanner.nextLine();
                System.out.println("Enter mediumScore");
                Double mediumScore = scanner.nextDouble();
                CollegeStudent collegeStudent = new CollegeStudent(studentCode, fullName, age, sex, address, mediumScore);
            } catch (Exception e) {
                System.out.println("Sai , mời nhập lại");
            }
        }
    }

    public void showAll() {
        for (CollegeStudent collegeStudent : ListStudent) {
            System.out.println(collegeStudent);
        }
    }

    public boolean Delete(Scanner scanner) {
        System.out.println("Nhập vào mã sinh viên muốn xoá");
        return this.ListStudent.remove(scanner.nextLine());
    }

    public void sort() {
        ArrayList<CollegeStudent> collegeStudents = new ArrayList<>();
        collegeStudents.sort(Comparator.comparing(CollegeStudent::getStudentCode));
    }

    public final String path = "src/ThiThucHanhMoDul2/IOfile/List";

    public void addFile() {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ListStudent);
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Lỗi hệ thống");
        }
    }

    public ArrayList<CollegeStudent> saveFile() {
        ArrayList<CollegeStudent> ListStudent = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ListStudent = (ArrayList<CollegeStudent>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Lỗi");
        }return ListStudent;
    }
}
