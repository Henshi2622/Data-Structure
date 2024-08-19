public class daimeter {
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
        if(root==null){
            return 0;
        }

        int l_height= height(root.left);
        int r_height =height(root.right);
        return Math.max(l_height,r_height)+1;
    }

     public static int daimeter_node(node root){
        if(root==null){
            return 0;
        }

        int l_daimeter=daimeter_node(root.left);
        int r_daimeter= daimeter_node(root.right);
        int l_height= height(root.left);
        int r_height =height(root.right);
        int self =height(root.left)+height(root.right)+1;
        return Math.max( self,Math.max(l_height,r_height));
     }

    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        System.out.println(height(root));
        System.out.println(daimeter_node(root));
        

    }
    
}
