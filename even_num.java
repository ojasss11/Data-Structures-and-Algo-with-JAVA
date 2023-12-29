public class even_num {
    public static void main(String[] args) {
        System.out.println("THE EVEN NUMBERS FROM 9 TO 100 ARE:");
        for (int i = 9; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i + " ");
            }
        }
    }
}