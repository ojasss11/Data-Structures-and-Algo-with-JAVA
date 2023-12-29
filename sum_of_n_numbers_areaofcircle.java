import java.util.Scanner;

public class sum_of_n_numbers_areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int number = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = sum + i;
        }
        System.out.println("THE SUM OF THE N-NUMBERS IS: " + sum);
        System.out.println("ENTER THE RADIUS OF CIRCLE:");
        float radius = sc.nextFloat();
        float area_of_circ = (float) (3.14 * radius * radius);
        System.out.println("THE AREA OF CIRCLE IS: " + area_of_circ);

        System.out.println("THE EVEN NUMBERS FROM 9 TO 100 ARE:");
        for (int i = 9; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i + " ");

            }
        }
    }

}
