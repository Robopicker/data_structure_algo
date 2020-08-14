package tree;

//import tree.BinarySearchTree.Node;

class Node
{
	int key;
	Node left;
	Node right;
	Node(int d)
	{
		key=d;
		left=right=null;
	}
}
public class PracBst {
	
	 Node root;
	 PracBst()
	 {
		 root=null;
	 }
	 void insert(int data)
	 {
		 root=insert(root,data);
	 }
	 Node insert(Node root,int data)
	 {
		 if(root==null)
		 {
			 return(new Node(data));
		 }
		 if(root.key>data)
		 {
			 root.left=insert(root.left,data);
		 }
		 if(root.key<=data)
		 {
			 root.right=insert(root.right,data);
		 }
		 return root;
		 
	 }
	 Node delete(Node root,int data)
	 {
		 if(root==null)
		 {
			 return root;
		 }
		 if(root.key>data)
		 {
			 root.left=delete(root.left,data); 
		 }
		 else if(root.key<data)
		 {
			 root.right=delete(root.right,data);
		  }
		 else
		 {
			 if(root.right==null)
			 {
				 return root.left;
			 }
			 if(root.left==null)
			  {
				 return root.right;
			  }
			 else root.key=minValue(root.right);
			 root.right= delete(root.right,root.key);			 
		 }
		 return root;
	 }
	 void delete(int item) {
		 Node cur= delete(root,item);
		 
		 System.out.println(cur.key);
	 }
	 public  int minValue(Node root)
	    {
	        int minv = root.key;
	        while (root.left != null)
	        {
	            minv = root.left.key;
	            root = root.left;
	        }
	        return minv;
	    }
   void printinorder(Node root)
   {
	   if(root==null)
	   {
		   return ;
	   }
	   printinorder(root.left);
	   System.out.println(root.key);
	   printinorder(root.right);
	   
   }
   void print()
   {
	   printinorder(root);
   }

	public static void main(String[] args) {
		PracBst p=new PracBst();
		p.insert(50);
		p.insert(45);
		p.insert(30);
		p.insert(40);
		p.insert(55);
		p.insert(60);
		
      // p.print();
      // p.delete(50);
       p.print();
	}

}
