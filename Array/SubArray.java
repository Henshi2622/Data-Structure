
public class SubArray {
 
    public static void Print_subarray(int arr[]){
         int total=0;
         int curr_sum=0;
         int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){          //for finding start value for subarray
            for(int j=i;j<arr.length;j++){
                curr_sum=0;                     // for finding end value for subarray
                for(int k=i;k<=j;k++){          // for printing subarray
                             
                    System.out.print(  arr[k]+  " ");
                    //sum os subarray
                    curr_sum+=arr[k];
                    
                }
                total++;
                System.out.println( );
                System.out.println( "sum of subarray="+curr_sum);

                //  for max subarray sum
                if(maxsum<curr_sum){
                    maxsum = curr_sum;

                }
            }
            System.out.println();
            
        }
        System.out.println("total subarray:"+ total);
        System.out.println("max sum="+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={ 2,5,6,7,10};
        Print_subarray(arr);
    }
 }
  
 