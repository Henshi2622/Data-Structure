public class selection_sort {
    public  static void  print_elements(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    

    public static void selectionsort(int arr[]){
        // for number of passes
        for(int i=0;i<arr.length-1; i++){     
            int min=i;
            // for camparision
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            // swaping
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        selectionsort(arr);
        print_elements(arr);
    }
}
