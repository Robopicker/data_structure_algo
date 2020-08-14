package design_algo;

class Node
{
	  int data;
	  Node left;
	  Node right;
	 public Node(int data)
	 {
		 this.data=data;
		 left=null;
		 right=null;
	 }
	
}

public class BinaryTree {
	
	Node root=null;
	BinaryTree(int data)
	{
		root=new Node(data);
	}
	
	void add(int pos,int data ,char ch )
	{
		Node newnode=new Node(data);
		add1(root,pos,newnode,ch);
 		
		
	}
	
	
	void add1(Node root,int pos,Node newnode,char ch)
	{
		if(root==null)
		{
			return ;
		}
		
		if(root.data==pos)
		{
			if(ch=='L')
			{
				root.left=newnode;
			}
			else if(ch=='R')
			{
				root.right=newnode;
			}
			return ;
		}
		
		add1(root.left,pos,newnode,ch);
		add1(root.right,pos,newnode,ch);
			
	}
	
	void printinorder(Node root)
	{
		if(root==null)return ;
		printinorder(root.left);
		System.out.println(root.data+" ");
		printinorder(root.right);
	}
public static void main(String []args)
{
	BinaryTree bt=new BinaryTree(5);
	bt.add(5, 4, 'L');
	
	bt.printinorder(bt.root);
	
	
	
}
}
