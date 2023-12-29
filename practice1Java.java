import java.util.Scanner;

public class practice1Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Call the isPrime function to check if a number is prime
        System.out.println("Enter any number");
        int num = sc.nextInt();
        boolean isPrimeResult = isPrime(num);

        if (isPrimeResult) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

      System.out.println(Math.sqrt(4));
    }

    public static boolean isPrime(int num) {
        // Handle the case where num is less than or equal to 1
        if (num <= 1) {
            return false;
        }

        // Iterate from 2 to the square root of num to check for divisibility
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                // If num is divisible by i, it's not a prime number
                return false;
            }
        }

        // If no divisor is found, num is a prime number
        return true;
    }
}
