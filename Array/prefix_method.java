public class prefix_method {
    public static void sum_array(int arr[]){
        int curr_sum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        // Calculating prefix array
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i+1;j<arr.length;j++){
                int end=j;
                curr_sum= start==0?prefix[end]:prefix[end]-prefix[start-1];

                if(maxsum<curr_sum){
                    maxsum=curr_sum;
                }
            }
        }
        System.out.println("max sum="+ maxsum);
    }
    public static void main(String[] args) {
        int arr[]={ 1,2,3,4};
        sum_array(arr);
    }
}


