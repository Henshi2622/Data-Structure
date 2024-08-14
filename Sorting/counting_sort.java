import java.util.*;
public class counting_sort {
    public  static void  print_elements(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    

    public static void counting(int arr[]){
        // maximum value
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=Math.max(max, arr[i]);
            }
        }

        // creating count array that count the frequecy
        int count []=new int[ max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting
       int j=0;
       for(int i=0;i<count.length;i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
       }

    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,7};
        counting(arr);
        print_elements(arr);
    }
    
}
