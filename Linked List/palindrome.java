import java.nio.channels.Pipe.SourceChannel;

public class palindrome {
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

    // calculate mid
    public node findMid(node head){
        node slow=head; // +1
        node fast=head; //+2
        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;  // mid 
    }

    // check palindrome
    public boolean check_palindrome(){
        if(head==null || head.next==null){
            return true;
        }

        // step 1:
        node mid=findMid(head);

        // step 2:
        node prev=null;
        node curr=mid;
        node next;
        while (curr!=null) {

            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node right=prev;     // right half head
        node left =head;

        // step 3:
        while (right!=null) {
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;

        }
        return true;
    }
    public static void main(String[] args) {
        palindrome ll=new palindrome();
        head=new node(1);
        head.next=new node(2);
        head.next.next=new node(2);
        head.next.next.next=new node(1);
        System.out.println(ll.check_palindrome());

    }
}
