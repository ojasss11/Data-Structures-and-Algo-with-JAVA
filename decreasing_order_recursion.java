public class decreasing_order_recursion {
    public static void printDec(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
        }
        printInc(n);
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
        
    }
}
