package Bafi5;

import java.awt.geom.Area;

public class Circle {
    double radius = 1.0;
    String color = "red";
    public Circle(){

    }
    public Circle(double r){
        r = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        double Area = radius * radius * Math.PI;
        return Area;

    }
}
