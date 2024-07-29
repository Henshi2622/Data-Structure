import java.util.*;
public class swapping {
    public static void swap( ArrayList <Integer> list ,int ind1,int ind2 ){
        int temp=list.get(ind1);
        list.set(ind1,list.get(ind2));
        list.set(ind2,temp);

        
    }
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList<>(Arrays.asList(34,52,76,85,45));
        System.out.println("enter index 1:");
        Scanner sc=new Scanner(System.in);
        int ind1=sc.nextInt();
        System.out.println("enter index 2:");
        int ind2=sc.nextInt();
        swap(list, ind1, ind2);
        System.out.println(list);
    }
    
}
