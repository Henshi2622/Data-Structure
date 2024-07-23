import java .util.*;

public class array_pairs {

    public static void pairs(int arr[]){
        int total_pair=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+ curr + ","+ arr[j]+")");
                total_pair++;
            }
            System.out.println( );
        }
        System.out.println("total pairs:"+total_pair);
       
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,8,10};
        pairs(arr);
    }
    
}
// formula to find total pair: n(n-1)/2
//time complexity=O(n^2)