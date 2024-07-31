import java.util.ArrayList;
import java.util.Arrays;
public class Max_water {

    public static int storewater(ArrayList<Integer> height){
        int max=0;
        //brute force
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int curr_water= width*ht;
                max=Math.max(curr_water,max);

            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7));
        System.out.println(storewater(height));
    }
    
}
