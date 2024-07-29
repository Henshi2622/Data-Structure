import java.util.*;
public class max_element {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>( Arrays.asList(1,2,3,4,5,6));
       
        System.out.println(list);

        int max=Integer.MIN_VALUE;      

        for(int i=0;i<list.size();i++){

            max=Math.max(max,list.get(i));
            
        }
        System.out.println(max);

    }
    
}
