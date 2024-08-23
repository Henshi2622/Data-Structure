import java.util.*;

public class bst_To_Balanced_bst {
    public static class node{
        int data;
        node left;
        node right;

         node(int data){
            this .data= data;
            this.left=null;
            this.right=null;
         }


    }

    // to print the elements 

    public static void preorder(node root){
        if(root==null){
            return ;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    // to get inorder sequence
    public static node createbst( ArrayList<Integer> inorder,int st,int end){
        if(st>end){
            return null;
        }

        int mid= (st+end)/2;
        node root =new node(inorder.get(mid));
        root.left=createbst(inorder, st, mid-1);
        root.right=createbst(inorder, mid+1, end);
        return root;


    }
    public static void getinorder(node root,ArrayList<Integer> inorder){
        if(root==null)
        {  return;

        }

        getinorder(root.left, inorder);
        inorder.add(root.data);
        getinorder(root.right, inorder);
    }


    public static node balance_tree(node root){
        // to get inorder sequence of bst
        ArrayList <Integer> inorder=new ArrayList<>();
        getinorder(root,inorder);

        // sorted inorder -> balanced tree
        root =createbst(inorder, 0, inorder.size()-1);
        return root;

    }
    
    public static void main(String[] args) {
        node root= new node(8);
         root.left =new node(6);
         root.left.left=new node(5);
         root.left.left.left=new node(3);
         root.right=new node(10);
         root.right.right=new node(11);
         root.right.right.right=new node(12);
         preorder(root); 
         System.out.println();
          root =balance_tree(root);
         preorder(root);



 /* given bst
                        8 
 *                   /     \
 *                  6      10
 *                 /         \
 *                5          11
 *               /             \
 *              3               12
 *        
 * 
 * balanced bst
 *    
                        8 
 *                   /     \
 *                  5       11
 *                 /  \    /  \
 *                3    6   10   12
 *                      

 */              

 
    }
    
}
