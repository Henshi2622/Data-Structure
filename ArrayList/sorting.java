import java.util.ArrayList;
import java.util.Collections;

public class sorting {
    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList<>();
        list.add(34);
        list.add(76);
        list.add(21);
        list.add(90);
        list.add(46);
        System.out.println(list);

        // Ascending order
        Collections.sort(list);
        System.out.println("Ascending order:");      
        System.out.println(list);

        //Descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order:");
        System.out.println(list);

    }
    
}
/* Collections is a class  which has method sort() that give the sorrted array 
 Point to ponder: Collection is a interface
                  Collections ia a class
 Collections.reverseOrder() is Comparator 
 Comparator: is the interface  that use to change the logic(here :order of sorting) of the method.
 */
