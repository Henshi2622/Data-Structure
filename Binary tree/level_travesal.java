import java.util.*;

public class level_travesal {
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

    public static void leveltravesal(node root){
        // if tree is empty
        if(root==null){
            return;
        }

        Queue<node> q =new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            node currnode=q.remove();

            // printing next line

            if(currnode==null){
                System.out.println();
                // if node is last
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currnode.data +" ");
                if(currnode.left!=null){
                    q.add(currnode.left);
                }
                if(currnode.right!=null){
                    q.add(currnode.right);
                }
            }
        }

    }
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        leveltravesal(root);
    }
    
}
