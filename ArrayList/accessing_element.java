import java.util.*;

public class accessing_element {
    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList<>();
        
        list.add(3);
        list.add(56);
        list.add(67);
        int n=list.size();
       
        for(int i=0;i<n;i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
}
