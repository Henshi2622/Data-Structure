import java.util.ArrayList;
import java.util.Arrays;

public class pairsum_twopinter {
    public static boolean pairsum(ArrayList <Integer> list,int target){
        int lp=0;   //left pointer
        int rp= list.size()-1;     //right pointer
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
               
            }
             if(list.get(lp)+list.get(rp)<target)
                lp++;
            else
                rp--;
        }
        return false;

    }



    public static void main(String[] args) {
         ArrayList<Integer> list = new  ArrayList<>(Arrays.asList(1,2,3,4,5,6));
         int target =5;
         System.out.println(pairsum(list, target));
    }
    
}
