public class spiral{
    //errors
    public static void PrintSpiral(int arr[][]){
        int startrow=0;
        int startcolumn=0;
        int endrow=arr.length;
        int endcolumn=arr[0].length;
        while(startrow<=endrow &&startcolumn<=endcolumn){
        //top
for(int j=startcolumn;j<=endcolumn;j++){
    System.out.print(arr[startrow][j]);
}
//right
for(int i=startrow;i<=endrow;i++){
    System.out.print(arr[i][endcolumn]);
}
//bottm
for(int j=endcolumn-1;j<=startcolumn;j--){
    if(startrow==startcolumn){
    break;
    }
System.out.print(arr[endrow][j]+" ");
}
//left
for(int i=endrow-1;i<=startrow;i--){
    System.out.print(arr[i][startcolumn]);
}
startcolumn++;
startrow++;
endcolumn--;
endrow--;
System.out.println();
    }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
                     };
        PrintSpiral(arr);
    }
}