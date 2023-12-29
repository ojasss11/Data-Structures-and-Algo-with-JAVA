public class lastDig {
    public static void PrintReverse(int num){
        while (num>0) {
              int lastdigit=num%10;
            num=num/10;
            System.out.print(lastdigit+" ");
            
        }
    }
    public static void main(String[] args) {
        int num=19823;
        PrintReverse(num);
    }
    
}
