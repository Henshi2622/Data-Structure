public class recursive_search{
    public static class node {
        int data;
        node next;

        // constructor
        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node head;
    public static node tail;
    public static int size = 0;

    public int helper (node head,int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }

        int ind=helper(head.next,key);
        if(ind==-1){
            return -1;
        }
        return ind+1;
    }

    public int recursive(int key){
        return helper(head,key);
    }


    public static void main(String[] args) {
        recursive_search ll = new recursive_search();
        head = new node(10);
       
        head.next = new node(20);
       
        head.next.next = new node(30);
     
         // return -1 element not found 
         System.out.println(ll.recursive(30));
         System.out.println(ll.recursive(40));

    }

}