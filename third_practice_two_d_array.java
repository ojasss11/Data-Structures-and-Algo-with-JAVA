import java.util.Scanner;
public class third_practice_two_d_array {
    public static boolean searchElement(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("ELEMENT IS FOUND AT CELL ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("ELEMENT NOT FOUND IN THE CELL");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=3;
        int columns=3;
        int matrix[][]=new int[rows][columns];
        System.out.println("Enter the elements of an array separated by space: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("MATRIX: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("ENTER THE ELEMENT TO BE SEARCHED");
        int element_to_be_searched=sc.nextInt();
        searchElement(matrix, element_to_be_searched);


    }
}
