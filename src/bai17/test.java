package bai17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class test {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("abc.dat"));
        {
            output.write("John".getBytes());
            output.writeDouble(85.5);
            output.writeObject(new java.util.Date());

        }
    }
}
