public class quick_sort {
    public  static void  print_elements(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }


    public static void quick_sort(int arr[],int si,int ei){
        // base case
        if(si>=ei){
            return ;
        }
        int pind=partition(arr,si,ei);
        quick_sort(arr, si, pind-1);  // left part
        quick_sort(arr, pind+1, ei);  // right part


    }

    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        // for elements smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        // for pivot ->correct position
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        quick_sort(arr, 0, arr.length-1);
        print_elements(arr);
    }
    
}
