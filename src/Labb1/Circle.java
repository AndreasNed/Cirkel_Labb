package Labb1;

public class Circle {

    private final double PI = Math.PI;
    private double radie;

    public Circle(double radie) {
        this.radie = radie;
    }

    public double getRadie() {
        return radie;
    }

    public void setRadie(double radie) {
        this.radie = radie;
    }

    public double calculateArea() {
        double area = radie * radie * PI;
        return area;
    }
    
    public double calculateCircumference(){
        double circumference =  2 * PI * radie;
        return circumference;
    }

}
