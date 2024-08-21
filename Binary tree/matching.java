public class matching {
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
    public static boolean isIdentical(node node,node subroot){   
        // if both the node are null
        if(node==null && subroot==null){
            return true;
        }
        else if ( node==null || subroot ==null ||node.data!=subroot.data){
            return false;
        }
        if(!isIdentical(node.left, subroot.left)){  // checking in left subtree
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }

        return true;



    }

    public static boolean issubtree(node root ,node subroot){
        if (root==null) {
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
        // if root of tree does not match with root node of given tree
        return issubtree(root.left, subroot) || issubtree(root.right, subroot);
    }

    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);

         node subroot =new node(2);
         subroot.left = new node(4);
         subroot.right = new node( 5);
        System.out.println(issubtree(root, subroot));
        

    }
    
    
}
