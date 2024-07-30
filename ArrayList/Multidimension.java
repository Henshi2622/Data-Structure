import java.util.ArrayList;

public class Multidimension {
    public static void main(String[] args) {
        // 2D arraylist
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList <>();
        l1.add(1);l1.add(2);
        list.add(l1);
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(3);l2.add(4);
        list.add(l2);

        // Accesing arraylist elements
        for(int i=0;i<list.size();i++){
            ArrayList <Integer> curr_list = list.get(i);
            for(int j=0;j<curr_list.size();j++){
                System.out.print(curr_list.get(j) + " ");
            }
            System.out.println( " ");
        }
        System.out.println(list);
    }
    
}
