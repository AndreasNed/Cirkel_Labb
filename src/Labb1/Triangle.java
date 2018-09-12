package Labb1;

public class Triangle {
    
    private double base;
    private double height;
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;        
    }
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(){
        this.height = height;
    }
    
    public double calculateArea(){
        return (base*height)/2;
    }
    
    public double calculateCircumference(){
        double circumference =  Math.pow(base, 2) + Math.pow(height, 2);
        circumference = Math.sqrt(circumference);
        return circumference;
    }
    
}
