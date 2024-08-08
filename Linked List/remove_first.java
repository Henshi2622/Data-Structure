public class remove_first {
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

    public node delete_first(node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        size--;
        return head;
    }

    public void printll(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        remove_first ll = new remove_first();
        head = new node(10);
        size++;
        head.next = new node(20);
        size++;

        head.next.next = new node(30);
        size++;

        ll.printll(head);
        head = ll.delete_first(head);  // Update head here
        ll.printll(head);
        System.out.println(ll.size);
    }
}
//  unlike C ,garbage collector of java automatically  delete the node and free up space
