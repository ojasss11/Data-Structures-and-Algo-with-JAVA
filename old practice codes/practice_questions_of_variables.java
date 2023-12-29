import java.util.Scanner;

public class practice_questions_of_variables {
    public static void main(String[] args) {
        // CHAPTER VARIABLES AND DATATYPES PRACTICE QUESTIONS
        // In a program,input 3numbers :A, B and C .You have to output the average of
        // these 3 numbers.
        Scanner sc = new Scanner(System.in);
        // float a, b, c;
        // System.out.println("ENTER ANY THREE NUMBERS:");
        // a = sc.nextFloat();
        // b = sc.nextFloat();
        // c = sc.nextFloat();
        // float average = (a + b + c) / 3;
        // System.out.println("AVERAGE IS : " + average);

        // QUESTION NO 2:In a program,input the side of a square.You have to output the
        // area of the square.
        // float side;
        // System.out.println("ENTER THE SIDE OF SQAURE:");
        // side = sc.nextFloat();
        // float area_of_square = side * side;
        // System.out.println("THE AREA OF SQUARE IS: " + area_of_square);
        // Write a java program to Enter cost of 3 items from the user (using float
        // datatype)-a pencil,a pen and an eraser. You have to output the total cost of
        // the items back to the user as their bill.(Add on : You can also try adding
        // 18% gst tax to the items in the bill as an advanced problem).
        float pencilCost, eraserCost, penCost;
        System.out.println("ENTER THE COST OF PENCIL: ");
        pencilCost = sc.nextFloat();
        System.out.println("ENTER THE COST OF PEN: ");
        penCost = sc.nextFloat();
        System.out.println("ENTER THE COST OF ERASER: ");
        eraserCost = sc.nextFloat();
        float finalcost = (penCost + pencilCost + eraserCost);
        float gst = 0.18f * finalcost;
        float totalcostwithGst = finalcost + gst;
        System.out.println("THE COST WITHOUT GST IS: " + finalcost);
        System.out.println("THE COST WITH GST IS: " + totalcostwithGst);
        /*
         * Will the following statementgive any error in Java?
         * int$=24;
         * 
         */
        int $ = 24;

    }
}