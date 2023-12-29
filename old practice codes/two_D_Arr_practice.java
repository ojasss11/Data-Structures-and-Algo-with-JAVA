
import java.util.Scanner;

public class two_D_Arr_practice {
    public static boolean search(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element is found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("ELEMENT NOT FOUND");
        return false;
    }

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix separated by spaces:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter the element to search: ");
        int searchKey = sc.nextInt();
        search(matrix, searchKey);
    }
}
