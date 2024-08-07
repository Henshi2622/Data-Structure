public class add_index {
    public static class node{
        int data;
        node next;

        public node( int data){
            this.data=data;
            this.next =null;
        
        }
    }

    public static node head;
    public static node tail;

    // adding at first
    public void addfirst(int data){

        // step 1: create new node
        node newnode=new node( data);
        if(head==null){
            head=tail=newnode;
            return;
        }

        // step 2: newnode=head  i.e pointing next of newnode to the current head node
         newnode.next=head;

         // step 3: creating newnode as head node
         head=newnode;
    }

    public  void addmiddle(int data,int ind){
        if(ind==0){
            addfirst(data);
            return;
        }
        // step 1: create new node
        node newnode=new node(data);
        node temp=head;         //initializing temp node with head node
         int i=0;
         while(i<ind-1){
            temp=temp.next;
            i++;
         }

         // i=ind-1 i.e prev node

         newnode.next=temp.next;
         temp.next=newnode;
        

    }

    // printing ll elements
    public void print_LL(){

        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print( temp.data +"->");
            temp=temp.next;

        }
        System.out.println("null");


    }
    public static void main(String[] args) {
        add_index ll =new add_index();
        ll.addfirst(67);
        ll.addfirst(56);
        ll.addfirst(70);
        ll.addfirst(30);
        ll.addmiddle(20, 2);

        ll.print_LL();
    }
    
}
