import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF N: ");
        int n = sc.nextInt();
        // while (counter<=2) {
        // System.out.println("PRINTING HELLO WORLD");
        // counter++;
        // }
        // System.out.println("PRINTED HELLO WORLD 10 TIMES");

        // while (counter <= n) {
        // {
        // System.out.print(counter + " ");
        // counter++;
        // }
        int sum = 0;
        while (counter <= n) {
            sum = sum + counter;
            counter++;
        }
        System.out.println("SUM IS : " + sum);
    }
}
