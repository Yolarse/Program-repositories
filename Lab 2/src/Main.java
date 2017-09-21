import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String args[]) {
        //Part 1: area/perimeter
        Scanner input = new Scanner(System.in);
        double length;
        double width;
        double height;
        double radius;
        double base;

        //area and perimeter of rectangle
        System.out.println("Rectangle: Enter width");
        width = input.nextDouble();
        System.out.println("Rectangle: Enter length");
        length = input.nextDouble();

        double recPerimeter = 2 * (length + width);
        double recArea = length * width;
        System.out.println("The perimeter of the rectangle is " + recPerimeter + " and the area is " + recArea);
        System.out.println("");

        //area and cirumference of circle
        System.out.println("Circle: enter circumference");
        radius = input.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double radiusSquared = Math.pow(radius, 2.0);
        double circleArea = Math.PI * radiusSquared;
        System.out.println("The circumference of the circle is " + circumference + " and the area is " + circleArea);
        System.out.println("");

        //area and perimeter of triangle
        System.out.println("Triangle: Enter base");
        base = input.nextDouble();
        System.out.println("Triangle: Enter height");
        height = input.nextDouble();

        double triPerimeter = 3 * base;
        double triArea = 0.5 * base * height;
        System.out.println("For an equilateral triangle, the perimeter is " + triPerimeter + " and the area is " + triArea);
        System.out.println("\n ");

        //Part 2: Surface area/Volume
        //sphere
        System.out.println("Sphere: Enter radius");
        radius = input.nextDouble();

        radiusSquared = Math.pow(radius, 2.0);
        double radiusCubed = Math.pow(radius, 3.0);
        double sphereSurfaceArea = 4 * Math.PI * radiusSquared;
        double sphereVolume = 4 * Math.PI * (radiusCubed / 3);
        System.out.println("The surface area of the sphere is " + sphereSurfaceArea + " and the volume is " + sphereVolume);
        System.out.println("");

        //rectangular prism
        System.out.println("Rectangular Prism: Enter height");
        height = input.nextDouble();
        System.out.println("Rectangular Prism: Enter width");
        width = input.nextDouble();
        System.out.println("Rectangular Prism: Enter length");
        length = input.nextDouble();

        double recPrismSA = 2 * ((height * length) + (height * width) + (length * width)); //Surface area
        double recPrismVolume = height * length * width;
        System.out.println("The surface area of the rectangular prism is " + recPrismSA + " and the volume is " + recPrismVolume);
        System.out.println("");

        //cylinder
        System.out.println("Cylinder: Enter radius");
        radius = input.nextDouble();
        System.out.println("Cylinder: Enter height");
        height = input.nextDouble();
        radiusSquared = Math.pow(radius, 2.0);

        double cylinderSA = ((2 * Math.PI * radius * height) + (2 * Math.PI * radiusSquared));
        double cylinderVolume = Math.PI * radiusSquared * height;
        System.out.println("The surface area of the cylinder is " + cylinderSA + " and the volume is " + cylinderVolume);













    }
}
