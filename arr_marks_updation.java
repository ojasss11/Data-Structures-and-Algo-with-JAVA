public class arr_marks_updation {
    public static void update(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 78, 79, 80, 81 };
        update(marks);
        System.out.println("THE UPDATED MARKS ARE: ");
        for (int element : marks) {
            System.out.print(element + " ");
        }

    }
}
