public class sum_recursion {
    public static int calculateSum(int n){
        if(n==1){
            return 1;
        }
        int sumnm1=calculateSum(n-1);
       int sumn=n+calculateSum(n-1);
       return sumn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(calculateSum(5));
        
    }
}
