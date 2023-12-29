public class arr2 {
    public static void update(int marks[], int nonchangable) {
        int unchangable = 5;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }

    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        int nonchangable = 10;
        update(marks, nonchangable);
        System.out.println(nonchangable);
        System.out.println("THE UPDATES MARKS ARE: ");

        for (int element : marks) {
            System.out.print(element + " ");

        }
    }
}
