import java.util.Scanner;

public class basic_calc_with_few_operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ANY THREE NUMBERS:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        // float c = sc.nextFloat();
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("NOT THAT ADVANCED CALULATOR");
                break;
        }
    }
}
