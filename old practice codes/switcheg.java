import java.util.Scanner;

public class switcheg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A AND B:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        char operator = sc.next().charAt(0);
        System.out.println("ENTER THE OPERATOR:");
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
                System.out.println("MY CALCULATOR IS NOT THAT ADVANCE");
                break;
            // int number = sc.nextInt();
            // switch (number) {
            // case 1:
            // System.out.println("SAMOSA");
            // break;
            // case 2:
            // System.out.println("SANDWICH");
            // break;
            // case 3:
            // System.out.println("MANGO");
            // break;
            // case 4:
            // System.out.println("PIZZA");
            // break;

            // default:
            // System.out.println("DONT EAT ANYTHING");
            // }

        }

    }

}
