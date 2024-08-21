import java.util.ArrayList;

public class lowest_coomon_ancestor {

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

    public static  boolean getpath(node root,int n, ArrayList<node > path){
        // if tree is empty
        if(root==null){
            return false;

        }
        path.add(root);
        // if root data = node to be found
         if (root.data==n) {
            return true;
         }
        
         // checking if node found at left or right subtree
         boolean foundleft =getpath(root.left, n, path);
         boolean foundright =getpath(root.right, n, path);

         if(foundleft || foundright){
            return true;
         }
        
         //if node not found then remove that node 
         path.remove(path.size()-1);
         return false;
    }

    public static node lca(node root , int n1, int n2){

        ArrayList<node> path1= new ArrayList<>();
        ArrayList<node> path2= new ArrayList<>();

        getpath(root, n1, path1);
        getpath(root, n2, path2);

         // lowest commomn ancestor 
         int i=0;
        for( ;i<path1.size() && i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }

        // last equal node -> i-1
        node lca =path1.get(i-1);
        return lca;

    }
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
       System.out.println(lca(root, 2, 3).data);

     /*                  1
                        /  \
                       2    3
                      / \    \
                     4   5    6 
*/
    }
    
}
