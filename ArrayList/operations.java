
import java.util.ArrayList;
public class operations {

  public static void main(String[] args) {
    ArrayList<Integer> list =new ArrayList<>();  
    // add operation  O(n)
    list.add(1);
    list.add(2);
    list.add(4);
    list.add(8);
    System.out.println(list);
    
    list.add(1,78);   //O(n)
    System.out.println(list);

    // get operation   O(n)
    System.out.println(list.get(3));

    //remove element   O(n^2)
    list.remove(1);
    System.out.println(list);

    //set element at index    O(n)
    list.set(2,34);
    System.out.println(list);

    //contains element  O(n)
    //check whether element is present in an array or not
    //return true if element is present otherwise return false

    System.out.println(list.contains(8));

    // size method
    System.out.println(list.size());
     
   }
}
   