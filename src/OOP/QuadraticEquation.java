package OOP;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        double delta = Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC();
        return delta;
    }
    public double getRoot1(){
        double r1 = (-b + Math.sqrt(b * b - 4 * a * c))/2 * a;
        return r1;
    }
    public double getRoot2(){
        double r2 = (-b - Math.sqrt(b*b - 4 * a * c))/ 2 * a;
        return r2;
    }


    public static void main(String[] args) {
        QuadraticEquation A = new QuadraticEquation();
        A.a = 1;
        A.b = 2;
        A.c = 1;
        if (A.getDiscriminant() > 0) {
            System.out.println(A.getRoot1());
            System.out.println(A.getRoot2());
        } else if (A.getDiscriminant() == 0) {
            System.out.println(A.getRoot1());

        } else {
            System.out.println("The equation has no roots");
        }
    }

}
