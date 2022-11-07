package bai16;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader input = null;
        FileWriter output = null;
       input = new FileReader("IO/abc.txt");
       output = new FileWriter("IO/vbn.txt");
        try {
            int c;
            while ((c = input.read()) != -1) {
                output.write(c);
            }
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
}

