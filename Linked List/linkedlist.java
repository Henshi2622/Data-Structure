public class linkedlist {

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

    public void addfirst(int data){

        // step 1: create new node
        node newnode=new node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }

        // step 2: newnode=head  i.e pointing next of newnode to the current head node
         newnode.next=head;

         // step 3: creating newnode as head node
         head=newnode;
    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.addfirst(10);
        ll.addfirst(35);
        
    }
}