public class sumOfNode {
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

    public static int sum(node root){
        if(root==null){
            return 0;
        }
        int l=sum(root.left);
        int r =sum(root.right);
        return l+r+root.data;

    }
        
    
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        System.out.println(sum(root));
        
       

    }
    
}
