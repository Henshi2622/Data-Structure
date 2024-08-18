public class height_tree {
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

    public static int height(node root){
        if (root==null){
            return 0;      // height of empty tree is 0
        }
        int l = height(root.left);  // height of left subtree
        int r =height(root.right);  // height of right  subtree
        return Math.max(l,r)+1;     // height of tree


    }

    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        System.out.println(height(root));

    }
    
}
