import java.util.ArrayList;
import java.util.Arrays;

public class pairsum {

    public static boolean pairSum1(ArrayList <Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }

            }
        }
        return false;
    }
    public static void main(String[] args) {
         ArrayList<Integer> list = new  ArrayList<>(Arrays.asList(1,2,3,4,5,6));
         int target =5;
         System.out.println(pairSum1(list, target));
    }
    
}
