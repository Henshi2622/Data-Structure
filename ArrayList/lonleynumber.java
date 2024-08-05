import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lonleynumber {
    public static ArrayList<Integer> islonely(ArrayList<Integer> list){
        ArrayList<Integer> a= new ArrayList<>();
        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            boolean islonley=true;

            if(i>0 && list.get(i)-list.get(i-1)==1)
                islonley=false;

            if(i<list.size()-1 &&  list.get(i+1)-list.get(i)==1)
                islonley=false;

            if(i>0 && list.get(i).equals(list.get(i-1)))
                islonley=false;

            if(i>list.size()-1 && list.get(i).equals(list.get(i+1)))
                islonley=false;

            if(islonley)
                a.add(list.get(i));
            
            
        }
        return a;
        
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 1,3,5,3);
        ArrayList<Integer> result = islonely(nums);
        System.out.println(result); // Output: [10, 8]
    }
}
