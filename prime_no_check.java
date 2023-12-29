import java.util.Scanner;

public class prime_no_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int number = sc.nextInt();
        boolean prime = true;
        for (int i = 0; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                prime = false;
            }
        }
        if (prime == true) {
            System.out.println("IT IS A PRIME NUMBER");
        } else {
            System.out.println("IT IS NOT A PRIME NUMBER");
        }
    }
}