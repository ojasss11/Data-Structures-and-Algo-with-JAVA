import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("ENTER AGE: ");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("YOU ARE ADULT");
            System.out.println("YOU CAN DRIVE");
            System.out.println("YOU CAN VOTE");
        } else {
            System.out.println("YOU ARE NOT ADULT");
            System.out.println("YOU CANNOT DRIVE");
            System.out.println("YOU CANNOT VOTE");

        }
    }
}
