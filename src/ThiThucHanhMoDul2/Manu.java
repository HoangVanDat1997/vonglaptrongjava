package ThiThucHanhMoDul2;

import java.util.Scanner;

public class Manu {
    public void manu() throws Exception{
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        int number = -1;
        System.out.println("----Student Management\n----");
        System.out.println("Enter Number");
        do {
            System.out.println("1. ShowAllMember");
            System.out.println("2. AddMember");
            System.out.println("3. Update");
            System.out.println("4.Delete");
            System.out.println("5.Sort");
            System.out.println("6.WriteFile");
            System.out.println("7.Add File");
            System.out.println("8.Exit");
            System.out.println("Select function:");
            int numbers = Integer.parseInt(scanner.nextLine());
            switch (numbers){
                case 1:
                    studentManager.showAll();
                    break;
                case 2:
                    studentManager.addStudent(scanner);
                    break;
                case 3:
                    studentManager.uppDate(scanner);
                    break;
                case 4:
                    studentManager.Delete(scanner);
                    break;
                case 5:
                    studentManager.sort();
                    break;
                case 6:
                    studentManager.addFile();
                    break;
                case 7:
                    studentManager.saveFile();
                    break;
                case 8:
                    System.exit(0);
            }
        } while (number!=0);
    }
}
