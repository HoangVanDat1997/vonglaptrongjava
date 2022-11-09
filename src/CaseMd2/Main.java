package CaseMd2;

import CaseMd2.Acc.LogIn;
import CaseMd2.File.CreateFileExample;

public class Main {
    public static void main(String[] args) throws Exception {
        LogIn logIn = new LogIn();
        logIn.logInAcc();
        CreateFileExample createFileExample = new CreateFileExample();
        createFileExample.ghiFile();
    }
}
