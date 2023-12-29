public class reverse_Array {
    public static void do_reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            temp = arr[first];
            first++;
            last++;

        }
    }

    public static void main(String[] args) {
        int marks[] = { 10, 20, 30, 40, 50, 60, 70 };
        do_reverse(marks);
        for (int elements : marks) {
            System.out.println(marks + " ");

        }

    }
}
