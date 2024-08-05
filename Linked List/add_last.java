public class add_last {
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


    public void addlast(int data){
        // step 1:create new node
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }

        // step 2: pointing next of tail node to new node
        tail.next=newnode;

        //step 3: newnode as tail;
        tail=newnode;
    }
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
        add_last ll=new add_last();
        ll.addlast(45);
        ll.addlast(80);
        ll.print();
    }
    
}
