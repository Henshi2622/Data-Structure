import java.util.*;
public class input_elements {
    public static void main(String[] args) {
        int marks[]=new int[5];

        //taking user input

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of array elements ");
        int n = sc.nextInt();
        System.out.println("enter array elements");


        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt(); 
        }

        //printing array elements

        System.out.println("array elements:");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

    }
    
}
