import java.util.ArrayList;
import java.util.Arrays;

public class maxwater {

    public static int storewater(ArrayList<Integer> height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(currwater,maxwater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }

        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.println(storewater(height));
    }
    
}
