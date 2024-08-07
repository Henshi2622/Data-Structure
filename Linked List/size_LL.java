public class size_LL {
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
     public static int size=0;

    public void addfirst(int data){

        // step 1: create new node
        node newnode=new node( data);
        size++; // size increase by 1 whenever new node is created
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
        size_LL ll=new size_LL();
        ll.addfirst(10);
        ll.addfirst(3);
        System.out.println(ll.size);
        
    }
    
}
