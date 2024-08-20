public class k_level {
    public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void klevel(node root, int level ,int k){
        if(root==null){
           return;
        }
        if(level==k){
            System.out.print(root.data + " ");
            return;
        }
        klevel(root.left, level+1, k);
        klevel(root.right, level+1, k);
    }

    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        klevel(root, 0, 3);

     /*                  1
                        /  \
                       2    3
                      / \    \
                     4   5    6
*/
    }
}
