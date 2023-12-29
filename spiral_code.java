public class spiral_code {
    public static void printSpiral(int matrix[][]){
        int startrow=0;
        int startcolumn=0;
        int endrow=matrix.length-1;
        int endcolumn=matrix.length-1;
        while(startrow<=endrow && startcolumn<=endcolumn){
            //top
            //FOR COLUMN WE WILL USE j and for row we will use i
            for(int j=startcolumn;j<=endcolumn;j++){
                System.out.println(matrix[startrow][j]+" ");
            }
            //right boundary
            for(int i=startrow+1;i<=endrow;i++){
                System.out.println(matrix[i][j]+" ");
            }
//bottom boundary
for(int j=endcolumn-1;j<=startcolumn;j++){
    System.out.println(matrix[endrow][j]+" ");
}
//left boundary
for(int i=endrow-1;i<=startcolumn+1;i++){
    System.out.println(matrix[i][startcolumn]+" ");
}
startrow++;
startcolumn++;
endrow--;
endcolumn--;
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
    }
    
}
