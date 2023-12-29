public class merge_Sort {
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void MergeSortArray(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        MergeSortArray(arr, si, mid);
        MergeSortArray(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;int k=0;
        //left(0,3), right(4,7)
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }
            else if(arr[i]>arr[j]){
                temp[k]=arr[j];
                j++;k++;
            }

        }
        while(i<=mid){
            arr[i]=temp[k];
            i++;k++;
        }
        while(j<=ei){
            arr[j]=temp[k];
            j++;k++;
        }
        for(k=0;k<arr.length;k++){
            arr[si+k]=temp[k];
        }
    }
public static void main(String[] args) {
    int arr[]={90,20,40,70,30};
    MergeSortArray(arr, 0, arr.length-1);
    PrintArray(arr);
    
}
}
