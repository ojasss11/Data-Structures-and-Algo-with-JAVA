public class lsp {
    public static int main(String[] args) {
        int arr[]={10,20,30,40,50,60,79,89,90};
        int key=90;
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        
    }
}
