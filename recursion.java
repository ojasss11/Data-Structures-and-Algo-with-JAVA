public class recursion {
    public static void PrintDecreasing(int n){
    if(n==1){
        System.out.println(1);
        return;
    }
    System.out.print(n+" ");
    PrintDecreasing(n-1);

    }
    // public static void PrintDec(int n){
    //     if(n==1){
    //         System.out.println(1);
    //         return;
    //     }
    //     System.out.print(n+ " ");
    //     PrintDec(n-1);
    // }

    public static void PrintIncreasing(int num){
        if(num==1){
            System.out.print(num+" ");
            return;
        }
        PrintIncreasing(num-1);
        System.out.print(num+" ");


    }
    public static void main(String[] args) {
        int n=10;
        PrintIncreasing(n);
        // System.out.println("");
        // PrintDecreasing(n);
        // int a=23;
        // float b=2314.34f;
        // char ch="asdmasdmasdma";
        // System.out.println(ch);
    }
    
}
