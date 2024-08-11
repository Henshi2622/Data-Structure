public class remove_n_fromlast {
    public  static class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;

    // for print
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

    public void remove_n(int n){
    // calculate size;
    int size=0;
    node temp=head;
    while(temp!=null){
        temp=temp.next;
        size++;
    }
        // if node to be delete is head node
        if(n==size){
            head=head.next;
            return;
        }

        // if node to be delete is not head
        int i=1;
        int indTOfind=size-n;
        node prev=head;
        while (i<indTOfind) {
            prev=prev.next;
            i++;
            
        }
        // remove operation
        prev.next=prev.next.next;
        return;

    }
public static void main(String[] args) {
    remove_n_fromlast ll =new remove_n_fromlast();
    head=new node(10);
    head.next=new node(40);
    head.next.next=new node(60);
    head.next.next.next=new node(70);
    ll.remove_n(2);
    ll.print();
}

}
