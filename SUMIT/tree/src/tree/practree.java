package tree;
import java.util.*;
   class Node
   {
	   int key;
	   Node left;
	   Node right;
	   public Node(int data)
	   {
		   key=data;
		   right=left=null;
	   }
   }
public class practree {
	Node root;

	 practree()
	 {
	     root = null;
	 }
	int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
	int leftheight=	height(root.left);
	int rightheight=height(root.right);
	if(leftheight>rightheight)
	{
		return leftheight+1;
		
	}
	else
		return rightheight+1;
	}
	void height()
	{
		System.out.println(height( root));
	}
	void print(Node Root)
	{
		if(Root==null)
		{
			return ;
			
		}
		System.out.print(Root.key+" ");
		print(Root.left);
		print(Root.right);
		
	}
	void print()
	{
		print(root);
	}
	void iterativepreorder(Node Root)
	{
		Stack<Node> stk=new Stack<>();
		stk.push(null);
		Node ptr =Root;
		while(ptr!=null)
		{    
			
			System.out.print(ptr.key+" ");
			if(ptr.right!=null)
			{
				stk.push(ptr.right);
			}
			
			if(ptr.left!=null)
			{
				ptr=ptr.left;
			}
			else stk.pop();
		}
	}
	void iterativepreorder()
	{
		iterativepreorder(root);
	}
	
	Boolean ISBST(Node root)
	{
		return ISBSThelper(root,-10,100);
	}
	private Boolean ISBSThelper(Node root2, int min, int max) {
	  if(root2==null)
		return true;
	  if(root2.key<min||root2.key>max)
	  {
		  return false;
	  }
	  return ISBSThelper(root2.left,min,root.key-1)&&ISBSThelper(root2.right,root2.key,max);
	}
	void ISBST()
	{
		System.out.println(ISBST(root));
	}

	int countleafnode(Node root)
	{    int count=0;
		if(root.left==null&&root.right==null)
		{
			return count++;
		}
		if(root.left!=null)
		{
			count+=countleafnode(root.left);
		}
		if(root.right!=null)
		{
			count+=countleafnode(root.right);
		}
		return count;
	}
	
	void countleafnode()
	{
		System.out.println(countleafnode(root));
	}
	
	//mirror
	Node mirror(Node root)
	{
		if(root==null)
		{
			return root;
		}
		if(root.left!=null)
		{
			mirror(root.left);
		}
		if(root.right!=null)
		{
			mirror(root.right);
		}
		if(root!=null&&(root.left!=null||root.right!=null))
		{
			Node temp =root.right;
	       root.right=root.left;
	       root.left=temp;
			
		}
		return root;
	}
	
	void mirror()
	{
		
		mirror(root);
	}
	public static int Hight (Node root)
    {
      return root==null ? 0 : Math.max(Hight(root.left),Hight(root.right))+1;
    }
	int diameteroftree(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int lh=Hight(root.left);
		int rh=Hight(root.right);
		int op1=lh+rh+1;
		int lp=diameteroftree(root.left);
		int rp=diameteroftree(root.right);
		return Math.max(Math.max(lp, rp),op1);
	}
	void diameter()
	{
	 System.out.println(diameteroftree(root));
	 }
	void printlevelwise(Node root)
	  {
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		q.add(null);
	  Node curr;
	  while(q.size()>1)
	  {
		  curr=q.poll();
		  if(curr==null)
		  {
			  System.out.println();
			  q.add(null);
		     continue;
		  }
		  System.out.print(curr.key);
		  if(curr.left!=null)
		  {
			  q.add(curr.left);
		  }
		  if(curr.right!=null)
		  {
			  q.add(curr.right);
		  }
		  
	  }
	}
//	void printlevelwise()
//	{
//		printlevelwise(root);
//	}
//	ArrayList<Integer> findpath(Node root,int k)
//	{
//		if(root==null)
//		{
//			ArrayList<Node> arr=null;
//			arr.add(root);
//			return arr;
//		}
//		if(root.key==k)
//		{
//			ArrayList<Integer> arr=new ArrayList<Integer>();
//			arr.add(root.key);
//	       return arr;
//		}
//		if(root.key>k)
//		{
//			if(root.left!=null)
//			{
//				 if(!arr.isEmpty())
//				        arr.add(root.key);
//				        return arr;
//				      }
//				    
//				      else{
//				        ArrayList<Integer> arr=findPath(root.left,k);
//				        if(!arr.isEmpty())
//				        arr.add(root.key);
//				        return arr;
//				      }
//		}
//		
//	}
	public static void main(String[] args) {
		practree tree=new practree();
		 tree.root = new Node(1);
	     tree.root.right = new Node(2);
	     tree.root.right = new Node(3);
	     tree.root.right.right = new Node(4);
	     tree.root.right.right = new Node(10);
	     tree.root.left=new Node(5);
//		tree.height();
//		tree.print();
//		System.out.println();
//		tree.iterativepreorder();
//       tree.ISBST();
	     //tree.countleafnode();
	     tree.diameter();
	     tree.print();
	   
	}

}
