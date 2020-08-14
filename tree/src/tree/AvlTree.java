package tree;
 class Node
{
	int key,hight;
	Node left,right;
	Node(int item)
	{
		key=item;
	   hight=1;
	}
}
public class AvlTree {
   Node root;
        AvlTree()
        {
        	root=null;
        }
        int hight(Node root1)
        {
        	if(root1==null)
        	{
        		return 0;
        	}
        	return root1.hight;
        }

        int max(int a, int b) {
            return (a > b) ? a : b;
        }
        int getBalance(Node N) {
            if (N == null)
                return 0;
     
            return hight(N.left) - hight(N.right);
        }
        
         Node RightRotate(Node root)
         {
        	 Node newroot=root.left;
        	 root.left=newroot.right;
        	 newroot.right=root;
        	 root.hight=Math.max(hight(root.left), hight(root.right))+1;
        	 newroot.hight=Math.max(hight(newroot.left), hight(newroot.right))+1;
        	 return newroot;
         }
         Node LeftRotate(Node root)
         {
        	 Node newroot=root.right;
        	 newroot.left=root;
        	 root.right=newroot.left;
        	 root.hight=Math.max(hight(root.left), hight(root.right))+1;
        	 newroot.hight=Math.max(hight(newroot.left), hight(newroot.right))+1;
        	 return newroot;
        	 
         }
        
        Node insert(Node root,int item)
        {
        	if(root==null)
        	{
        		return (new Node(item));
        	}
        	
        	if(root.key<item)
        	{
        		root.right=insert(root.right,item);
        	}
        	else if(root.key>item)
        	{
        		root.left=insert(root.left,item);
        	}
        
        	root.hight=Math.max(hight(root.left), hight(root.right))+1;
        	int balance=getBalance(root);
        	if(balance>1)
        	{  if(hight(root.left.left)>hight(root.left.right))
        		return RightRotate(root);
        	else
        		root.left=LeftRotate(root.left);
        	     return  RightRotate(root.left);
        
        	}
        	if(balance<-1)
        	{
        		 if(hight(root.right.right)>hight(root.right.left))
             		return LeftRotate(root);
             	else
             		root.right=RightRotate(root.right);
             	     return  LeftRotate(root.right);
        	}
        	return root;
        	
        }
        void insert(int item)
        {
        	insert(root,item);
        }
        void preOrder(Node node) {
	        if (node != null) {
	            System.out.print(node.key + " ");
	            preOrder(node.left);
	            preOrder(node.right);
	        }
	    }
        void print()
        {
        	preOrder(root);
        }
    	public static void main(String[] args) {
		   AvlTree tree=new AvlTree();
		   tree.root = tree.insert(tree.root, 10);
	        tree.root = tree.insert(tree.root, 20);
	        tree.root = tree.insert(tree.root, 30);
	        tree.root = tree.insert(tree.root, 40);
	        tree.root = tree.insert(tree.root, 50);
	        tree.root = tree.insert(tree.root, 25);
	        tree.preOrder(tree.root);
         
	}

}
