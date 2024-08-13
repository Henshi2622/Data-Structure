public class insertion_sort {
    public  static void  print_elements(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }


    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];   // storing the valueof i in temp variable
            int prev= i-1;

            // finding correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1]=curr;
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        insertion(arr);
        print_elements(arr);
    }
    
}
