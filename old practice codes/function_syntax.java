import java.util.Scanner;

public class function_syntax {
    // return type(){
    // body;
    // return statement;
    // }
    public static int PrintHello() {
        System.out.println("PRINTING HELLO WORLD");
        System.out.println("PRINTING HELLO WORLD");
        System.out.println("PRINTING HELLO WORLD");
        System.out.println("PRINTING HELLO WORLD");
        return 3;

    }

    public static float calculatesum(float a, float b) {
        float sum = a + b;
        return sum;
    }

    public static float swap(float a, float b) {
        float temp;
        temp = a;
        a = b;
        b = temp;
        return temp;
    }

    public static void main(String[] args) {
        PrintHello();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float sum = calculatesum(a, b);
        System.out.println("THE SUM OF TWO NUMBERS IS: " + sum);
        float x=15;
        float y=90;
        System.out.println("BEFORE SWAPPING THE NUMBERS ARE "+x+"AND"+y);
        float swapping=swap(x, y);
        System.out.println("AFTER SWAPPING THE NUMBERS ARE: "swapping);

    }
}