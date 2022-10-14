package KeThua;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setX(5.5f);
        point3D.setY(4.4f);
        point3D.setXY(3.3f,2.2f);
        point3D.setZ(1.1f);
        point3D.setXYZ(44.44f,33.33f,22.22f);
        System.out.println("In ra XYZ");
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }

}
