public class count_node {
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

    public static int count(node root){
        if(root==null){
            return 0;
        }
        int l = count(root.left);
        int r=count(root.right);
        return l+r+1;
    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        System.out.println(count(root));
       

    }
    
}
