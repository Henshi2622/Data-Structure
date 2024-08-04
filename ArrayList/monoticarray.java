import java.util.ArrayList;
import java.util.Arrays;

public class monoticarray {
    public static boolean isMonotonic(ArrayList<Integer> A) {
        boolean inc = true;
        boolean dec = true;
        for (int i=0; i<A.size()-1; i++) {
        if (A.get(i) > A.get(i+1))
        inc = false;
        if (A.get(i) < A.get(i+1))
        dec = false;
        }
        return inc || dec;
    }
    
    public static void main(String[] args) {
         ArrayList<Integer> list= new ArrayList<>(Arrays.asList(6,5,4,4));
         System.out.println(isMonotonic(list));

    }
}

