import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int physics = sc.nextInt();
        int marks[] = new int[80];
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("PHYSICS MARKS ARE:" + marks[0]);// MARKS OF PHYSICS
        System.out.println("CHEMISTRY MARKS ARE:" + marks[1]);// CHEM MARKS
        System.out.println("MATHS MARKS ARE:" + marks[2]);// MATHS MARKS
        marks[0] = marks[0] + 1;
        marks[1] = 35;
        System.out.println("PHYSICS MARKS ARE:" + marks[0]);
        System.out.println("CHEM MARKS ARE:" + marks[1]);
        System.out.println("MATHS MARKS ARE:" + marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("PERCENTAGE OF MARKS IS: " + percentage + "%");

        // PASS BY VALUE AND PASS BY REFERENCE ARE WAYS OF PASSING ARRAYS AS ARGUMENTS
    }
}
