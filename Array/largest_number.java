import java.util.*;
public class largest_number {
    public  static int get_Largest(int arr[]) {
        int largest= Integer.MIN_VALUE; // -infinity
         
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i])
            largest=arr[i];
        }
        return largest;

    }
    public static void main(String[] args) {
        int arr[]={2, 34,56,74,90,56,84};
        System.out.println("largest element:" + get_Largest(arr));
    }

    
}
