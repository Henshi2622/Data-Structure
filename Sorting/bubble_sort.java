public class bubble_sort {

    public static void bubblesort(int arr[]){
        // loop for passes
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            // loop for comaprision 
            for(int j=0;j<arr.length-1-i;j++){
                // swapping
                if(arr[j]>arr[j+1]){      //  for decreasinng order change the comparision symbol with " <"
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                swap++;
            }
            if(swap==0){
                return;
            }

            
        }
    }

    public  static void  print_elements(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        bubblesort(arr);
        print_elements(arr);
    }
    
}
