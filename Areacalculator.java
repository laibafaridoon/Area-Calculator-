
package areacalculator;

import java.util.Scanner;

public class Areacalculator {


    public static double area(double radius) {
        return Math.PI * radius * radius;
    }


    public static double area(double length, double width) {
        return length * width;
    }

  
    public static double area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of Circle: " + area(radius));

       
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of Rectangle: " + area(length, width));

        
        System.out.print("Enter side of the square: ");
        int side = scanner.nextInt();
        System.out.println("Area of Square: " + area(side));

        scanner.close();
    }
}
