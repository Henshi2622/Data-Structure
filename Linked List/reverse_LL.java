public class reverse_LL {
    public class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;

    // printing elements 
    public void print(){

        if(head==null){
            System.out.println("linked list is empty");
            return;
        }
         node temp=head;   // creating temporary node which stores head
         while(temp!=null){
             System.out.print( temp.data + "->");
             temp=temp.next;
         }
         System.out.println("null");
    }

    public void reverse(){
        node prev=null;
        node curr=tail=head;
        node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        reverse_LL ll = new reverse_LL();
        // To create an instance of a non-static inner class (node),
        // you need an instance of the outer class (reverse_LL).
        ll.head = ll.new node(10);  
        ll.head.next =ll. new node(20);
        ll.head.next.next = ll.new node(30);
        
        ll.reverse();
        ll.print();
    }
}
