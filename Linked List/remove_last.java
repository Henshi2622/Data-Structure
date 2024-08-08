public class remove_last {
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
    
    public void delete_last(){
        if(size==0){
            System.out.println("empty ll");
            return;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return;
        }
         
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }

        int val=prev.next.data; //tail data
        prev.next=null;
        tail=prev;
        size--;

    }

   
    public void printll() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
     
    
    public static void main(String[] args) {
        remove_last ll = new remove_last();
        head = new node(10);
        size++;
        head.next = new node(20);
        size++;

        head.next.next = new node(30);
        size++;

        ll.printll();
        ll.delete_last();
        ll.printll();
        System.out.println(ll.size);
    }
}
