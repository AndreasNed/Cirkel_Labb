package Labb1;

import java.util.Scanner;

public class LabbMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true; // Ska programmet köras? 0 = false

        while (run) {
            System.out.println("1) Circle\n2) Rectangle\n3) Triangle\n0) Exit");
            int userInput = sc.nextInt();
            sc.nextLine();
            //Läs inmatning av ett heltal och töm Scanner cachen

            switch (userInput) {                
                case 1:
                    createCircle(); // Skapa circle objekt
                    break;                    
                case 2:
                    createRectangle(); // Skapa Rektangel objekt
                    break;
                case 3:
                    createTriangle(); // Skapa Triangel objekt
                    break;
                case 0:
                    run = false; // Avsluta
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    private static void createCircle() {
        System.out.println("Enter circle radius: ");
        double radieInput = sc.nextDouble();
        sc.nextLine();
        Circle circle = new Circle(radieInput);
        // Läs in cirkelns radie och skapa objekt med referens "circle".
        //Konstruktorn public Circle(double radie)

        System.out.println("What would you like to calculate?\n1) circumference\n2) area\n3) both");
        int circleChoice = sc.nextInt();
        sc.nextLine();
        // Läs in val och töm Scanner cache
        switch (circleChoice) {
            case 1:
                System.out.println("Circumference = "+circle.calculateCircumference());
                break;
            case 2:
                System.out.println("Area = "+ circle.calculateArea());
                break;
            case 3:
                System.out.println("Circumference = "+circle.calculateCircumference());
                System.out.println("Area = "+ circle.calculateArea());
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        
    }

    private static void createRectangle() {
        System.out.println("Enter rectangles length: ");
        double rectanglesLength = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter rectangles width: ");
        double rectanglesWidth = sc.nextDouble();
        sc.nextLine();
        Rectangle rektangle = new Rectangle(rectanglesLength,rectanglesWidth);
        
        //Läs in data till rektangelns konstruktor och skapa objekt med referns rektangle
        //Konstruktorn public  Rectangle(double length, double width)

        System.out.println("What would you like to calculate?\n1) circumference\n2) area\n3) both");
        int rectangleChoice = sc.nextInt();
        sc.nextLine();
        //Läs in vad som ska räknas ut och töm Scanner cache
        switch (rectangleChoice) {
            case 1:
                System.out.println("Circumference = "+rektangle.calculateCircumference());
                break;
            case 2:
                System.out.println("Area = "+ rektangle.calculateArea());
                break;
            case 3:
                System.out.println("Circumference = "+rektangle.calculateCircumference());
                System.out.println("Area = "+ rektangle.calculateArea());
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        
        
    }

    private static void createTriangle() {
        System.out.println("Enter triangle base: ");
        double triangleLength = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter triangle height: ");
        double triangleWidth = sc.nextDouble();
        sc.nextLine();
        Triangle triangle = new Triangle(triangleLength,triangleWidth);
        
        //Läs indata för triangel och töm Scanner cache
        //Konstruktorn public Triangle(double base, double height)
        

        System.out.println("What would you like to calculate?\n1) circumference\n2) area\n3) both");
        int rectangleChoice = sc.nextInt();
        sc.nextLine();
        //Läs inmatning och töm Scanner cache
        switch (rectangleChoice) {
            case 1:
                System.out.println("Circumference = "+triangle.calculateCircumference());
                break;
            case 2:
                System.out.println("Area = "+ triangle.calculateArea());
                break;
            case 3:
                System.out.println("Circumference = "+triangle.calculateCircumference());
                System.out.println("Area = "+ triangle.calculateArea());
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        
    }

}
