import java.util.ArrayList;
import java.util.Arrays;

public class pairsum2 {
    public static boolean pairsum(ArrayList <Integer> list,int target){
        int bp=-1; //bp=breaking point
        int n=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;

            }
        }
        int lp=bp+1;
        int rp=bp;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if (list.get(lp)+list.get(rp)<target)
                lp=(lp+1)%n;
            else    
                rp=(n+rp-1)%n;

        }
        return false;
    }

     public static void main(String[] args) {
         ArrayList<Integer> list = new  ArrayList<>(Arrays.asList(11,15,6,8,9,10));
         int target =16;
         System.out.println(pairsum(list, target));
     }
    
}
