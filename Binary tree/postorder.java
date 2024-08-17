public class postorder {
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
    // to build tree
    public static class Binarytree{
        static  int idx=-1;
        public static node buildtree(int arr[]){
            idx++;
            if(arr[idx]==-1){
                return null;
            }
            node newnode=new node(arr[idx]);
            newnode.left = buildtree(arr);
            newnode.right = buildtree(arr);
            return newnode;
        }
        // postorder
        public static void findpostorder(node root){
            if(root==null){
                return;
            }
            findpostorder(root.left);
            findpostorder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree  tree=new Binarytree();
        node root=tree.buildtree(arr);
        tree.findpostorder(root);
    }    
    
}
