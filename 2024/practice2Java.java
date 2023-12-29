import java.util.Scanner;

public class practice2Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print a message with line spaces
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        // Print a pyramid of asterisks
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        // Input two numbers to calculate their product
        System.out.println("Enter two numbers to calculate their product:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double product = num1 * num2;
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        // Calculate the area of a circle
        System.out.println("CIRCLE (AREA):");
        System.out.println("Enter the radius of the circle:");
        float radius = sc.nextFloat();
        double PI = Math.PI; // Constant value of PI
        double areaOfCircle = PI * radius * radius;
        System.out.println("The area of the circle is: " + areaOfCircle);

        // Type casting in Java refers to the process of converting a variable of one data type into another.
        // There are two types of casting in Java: implicit casting (automatic) and explicit casting (manual).

        // JAVA AUTOMATICALLY promotes each byte, short, or char operand to int when evaluating an expression
        // If one operand is long, float, or double then the whole expression is promoted to long, double, and float respectively

        // TYPE CONVERSION IN JAVA:
        // Conversion happens when:
        // a] type compatible
        // b] destination type > source type

        int mark = (int) (99.99f);
        System.out.println(mark);
        float val = 25.65f;
        int m = (int) val;
        System.out.println(m);
        char cd = 'a';
        int cd2 = cd;
        System.out.println(cd2);

        // Calculate the average of three numbers
        System.out.println("Enter the first number(A):");
        double A = sc.nextDouble();
        System.out.println("Enter the first number(B):");
        double B = sc.nextDouble();
        System.out.println("Enter the first number(C):");
        double C = sc.nextDouble();
        double avgOfThree = (A + B + C) / 3;
        System.out.println("Average of three numbers is: " + avgOfThree);

        // AREA OF SQUARE
        System.out.println("Enter the side of square to find its area:");
        double side = sc.nextDouble();
        double squareArea = side * side;
        System.out.println("Area of square is: " + squareArea);

        // Takes input cost of a pencil, a pen, and an eraser from the user, calculates the total cost,
        // adds 18% GST, and then outputs the final bill
        System.out.println("Enter the cost of pencil");
        float pencilCost = sc.nextFloat(); // pencil cost
        System.out.println("Enter the cost of pen");
        float penCost = sc.nextFloat(); // pen cost
        System.out.println("Enter the cost of eraser");
        float eraserCost = sc.nextFloat(); // eraser cost
        float totalCost = pencilCost + eraserCost + penCost; // calculates the total cost
        float gst = 0.18f * totalCost;
        float costWithGst = totalCost + gst;
        System.out.println("\n********* Bill *********");
        System.out.println("Cost of pencil $"+pencilCost);
        System.out.println("Cost of pen $"+penCost);
        System.out.println("Cost of eraser $"+eraserCost);
        System.out.println("Total cost of pencil, eraser, and pen without GST is $"+totalCost);
        System.out.println("GST applied $"+gst);
        System.out.println("Total cost of pencil, eraser, and pen with GST is $"+costWithGst);

        int $ = 24;
        System.out.println($);
    //  Symbols that tell compiler to perform some operation 
    int m1=10;
    int m2=m1--;
    System.out.println(m1);
    System.out.println(m2);

    }
}
