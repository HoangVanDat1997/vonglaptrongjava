package CaseMd2.Acc;
import CaseMd2.Canbogiaovien;
import CaseMd2.Manager;
import CaseMd2.Menu;

import java.util.Scanner;
    public class LogIn {
        public static Scanner scanner = new Scanner(System.in);
        public static final String ACCOUNT_ADMIN = "Admin";
        public static final String PASSWORD_ADMIN = "hihihi";

        public void logInAcc() throws Exception {
            do {
                System.out.println("Please login to your account");
                System.out.println("Username ");
                String inputAccount = scanner.nextLine();
                System.out.println("Password ");
                String inputPassword = scanner.nextLine();

                if (ACCOUNT_ADMIN.equals(inputAccount)) {
                    if (PASSWORD_ADMIN.equals(inputPassword)) {
                        Menu menu = new Menu();
                        menu.Menu();
                        System.out.println("---------Successful---------");
                    } else {
                        System.out.println("Wrong password");
                    }
                } else {
                    System.out.println("Account does not exist");
                }
            } while (true);
        }
    }
