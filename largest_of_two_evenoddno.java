import java.util.Scanner;

public class largest_of_two_evenoddno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("ENTER ANY TWO NUMBERS: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a > b) {
        // System.out.println("A IS LARGEST OF TWO");
        // System.out.println("A >= B");

        // } else {
        // System.out.println("B IS LARGEST OF TWO ");
        // System.out.println("B >= A");
        // }
        // EVEN ODD NUMBER
        System.out.println("ENTER A NUMBER TO CHECK IF IT IS EVEN OR ODD?");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("IT IS AN EVEN NUMBER");
        } else {
            System.out.println("IT IS AN ODD NUMBER");
        }
    }
}
