import java.util.*;
public class rainwater {
    public static int trappedwater(int height[]){

        //calculating left max boundary
        int left[]=new int[height.length]; // auxillary array
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(height[i],left[i-1]);
         }

         //calculating right max boundry
         int right[]=new int[height.length]; // auxillary array
         int n=height.length;
         right[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            right[i]=Math.max(height[i],right[i+1]);
         }

         // calculating trapped rainwater
         
         int trappedwater=0;
         for(int i=0;i<n;i++){
            //water level = min(left max -right max)
            int waterlevel=Math.min(left[i],right[i]);
            trappedwater+=(waterlevel-height[i]);

         }
         return trappedwater;


    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedwater(height));
    }
    
}
