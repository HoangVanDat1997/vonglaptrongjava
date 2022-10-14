package KeThua;

public class Circle {
    public double radius;
    public String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius * radius * Math.PI;

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("red");
        System.out.println(circle.getColor());
        circle.setRadius(55.5);
        System.out.println(circle.getArea());

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
