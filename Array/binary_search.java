public class binary_search {
    public  static int b_search(int arr[],int key ){
        int low=0;
        int high= arr.length-1;
        

        while (low<=high) {
        
            int mid=(low+high)/2;
    
            if( arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                low=mid+1; 
            }
            else{
                high=mid-1;
            }
            
        }
        return-1;
    }
    public static void main(String args[]){
        //sorted array
        int arr[]={34,56,65,78,86,92 };
        int key=78;
        System.out.println("index for key :" + b_search(arr,key));
    }
    
}
