
public class linear_search {
     public static int l_search(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i])
            return i;
            
        }
        return -1;
         
        
    }
    public static void main(String[] args) {
        int arr[]={ 3,67,78,65,29,75};
        int key=78;
        int index=l_search(arr,key); 
        if(index==1){
            System.out.println("element not found");

        }
        else{
            System.out.println("key is at index:"+ index);
        }

    }
}
