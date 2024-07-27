import java.util.*;
public class Frequency {

    public static void array_frequency(int arr[],int n){
        boolean visited[]= new boolean[arr.length];
        Arrays.fill(visited,false);
        // count frequencies
        for(int i=0;i<n;i++){
            //skip the element if already processed
            if(visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i] +" " + "count =" + count);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        int n=arr.length;
        array_frequency(arr, n);
    }
}
