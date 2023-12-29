public class advance_patterns {
    // public static void hollow_rectanlge(int totalrows,int totalcolumns){
    //     //outer loop
    //     for(int i=1;i<=totalrows;i++){
    //         for(int j=1;j<=totalcolumns;j++){
    //             if(i==1||i==totalrows||j==1||j==totalcolumns){
    //                 System.out.print("*");
    //             }
    //             else{
    //             System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    public static void practiceHollow_Rectangle(int totalrows,int totalcolumns){
        for(int i=1;i<=totalrows;i++){
            for(int j=1;j<=totalcolumns;j++){
                if(i==1||i==totalrows||j==1||j==totalcolumns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    //INVERTED PYRAMID
public static void InvertedPyramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        
            System.out.println(" ");

    }
}



    public static void main(String[] args) {
        // hollow_rectanlge(10,7);
        // practiceHollow_Rectangle(6, 6);
        InvertedPyramid(6);
        
    }
}
