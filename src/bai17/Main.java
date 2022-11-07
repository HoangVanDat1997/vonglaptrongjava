package bai17;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
  private static void copyFileUsingJava7Files(File abc, File vbn) throws IOException {
      Files.copy(abc.toPath() , vbn.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
   private static void copyFileUsingStream(File abc , File vbn) throws IOException{
       InputStream is = null;
       OutputStream os = null;
       try {
           is = new FileInputStream(abc);
           os = new FileOutputStream(vbn);
           byte [] buffer = new byte[1000];
           int length ;
           while ((length = is.read(buffer))> 0){
               os.write(buffer , 0 , length);
           }
       }finally {
           is.close();
           os.close();
       }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập file abc");
        String abcPath = scanner.nextLine();
        System.out.println("Nhập file vbn");
        String vbnPath = scanner.nextLine();
        File abcFile = new File(abcPath);
        File vbnFile = new File(vbnPath);
        try {
            copyFileUsingJava7Files(abcFile, vbnFile);
            System.out.println("Coppy Complated");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
