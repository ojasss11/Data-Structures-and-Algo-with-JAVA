public class largest_in_arr {
    public static int get_largest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 19, 20, 30 };
        int large_elem = get_largest(arr);
        System.out.println("THE LARGEST ELEMENT OF THE ARRAY IS: " + large_elem);

    }
}
