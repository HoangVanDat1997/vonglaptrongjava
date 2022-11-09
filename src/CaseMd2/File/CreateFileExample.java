package CaseMd2.File;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;


public class CreateFileExample {
    public static Object docFile() throws Exception {
        Object objects;
        File file = new File("CaseMd2.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        if (fileInputStream.available() > 0) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            objects = objectInputStream.readObject();
        } else {
            return null;
        }
        return objects;
    }
    public void ghiFile() throws IOException {
        File file = new File("CaseMd2.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream("CaseMd2.txt");

    }
}
