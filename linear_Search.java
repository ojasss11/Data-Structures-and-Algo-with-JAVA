public class linear_Search {
    public static int ls(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int key = 199;
        int index = ls(arr, key);
        if (index == -1) {
            System.out.println("KEY NOT FOUND");
        } else {
            System.out.println("KEY IS FOUND AT INDEX: " + index);
        }
    }

}
