public class prac_getlarge_small {
    public static int get_large_small(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("THE LARGEST ELEMENT OF THE ARRAY IS: " + largest);
        System.out.println("THE SMALLEST ELEMENT OF THE ARRAY IS: " + smallest);

        return largest;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        get_large_small(arr);

    }
}
// Initializing largest and smallest variables:

// You have initialized largest with Integer.MAX_VALUE, which is the largest
// possible integer value. Instead, you should initialize it with
// Integer.MIN_VALUE to ensure that any element in the array will be greater
// than the initial value.
// Similarly, you have initialized smallest with Integer.MIN_VALUE, which is the
// smallest possible integer value. Instead, you should initialize it with
// Integer.MAX_VALUE to ensure that any element in the array will be smaller
// than the initial value.
