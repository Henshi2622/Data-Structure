public class print_LL {
    public static class node{
        int data;
        node next;    // next is of node type because it is pointing to the next node
      
        // constructor
        public node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static node head;
    public static node tail;

    // printing linlked list element
    public void print(){

        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
         node temp=head;   // creating temporary node which stores head
         while(tail!=null){
             System.out.println( temp.data);
             temp=temp.next;
         }
         System.out.println();
    }

    public static void main(String[] args) {
        print_LL ll=new print_LL();
        ll.print();
    }
    
}
