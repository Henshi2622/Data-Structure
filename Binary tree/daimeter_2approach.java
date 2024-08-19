public class daimeter_2approach {
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
     static class info{
        int dai;
        int ht;
        info(int dai,int ht){
            this.dai=dai;
            this.ht=ht;
        }
     }

     public static info daimeter(node root){
        if(root==null){
            return new info(0, 0);
        }

        info leftinfo=daimeter(root.left);
        info rightinfo =daimeter(root.right);
        
        int daim = Math.max(Math.max(leftinfo.dai,rightinfo.dai),leftinfo.ht+rightinfo.ht+1);
        int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;

        return new info(daim, ht);
     }

    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        System.out.println(daimeter(root).dai);
        System.out.println( daimeter(root).ht);
        
        

    }
    
    
}
