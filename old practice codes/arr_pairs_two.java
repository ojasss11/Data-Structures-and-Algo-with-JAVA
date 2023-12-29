public class arr_pairs_two{
    public static void arrayPairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+curr+","+arr[j]+")");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,5};
        arrayPairs(numbers);
        
    }
}