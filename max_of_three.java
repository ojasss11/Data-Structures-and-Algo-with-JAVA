import java.util.Scanner;

public class max_of_three {
    public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY THREE NUMBERS:");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        if (a > b && a > c) {
            System.out.println("A IS THE LARGEST NUMBER");
        } else if (b > c && b > a) {
            System.out.println("B IS THE LARGEST NUMBER");
        } else {
            System.out.println("C IS THE LARGEST NUMBER");
        }

    }
}
