public class reverse_array {
    public static int reverse(int arr[]){
       int start=0;
       int  end=arr.length-1;

       while(start<end){
        
        //swapping the elements
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        start++;
        end--;
     }
     return-1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,10,5,12,45};
        reverse(arr);

        //printing reverse array
        System.out.println("reverse array:");
        for(int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);
        }
    }
    
}
// what if we create another array and copy the value of original array into that?
// in such cases time complexity : O(n)
//               space complexity :O(n)
// but here time complexity is same but space complexity is O(1) which is constant
