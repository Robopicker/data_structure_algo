package design_algo;
import java.util.*;
class bstNode
{
	int data;
	bstNode left;
	bstNode right;
	public bstNode(int data)
	{
		this.data=data;
		left=null;right=null;
	}
}

public class BST {

	   bstNode root=null;
	
	   public BST(int data)
	   {
		     this.root=new bstNode(data);
	   }
	   
	   bstNode addNode(bstNode root,int data)
	   {
		   if(root==null)
			   {
			   bstNode newnode=new bstNode(data);
			   return newnode;
			   }
		   if(root.data>data)
		   {
			  root.left= addNode(root.left,data);
		   }
		   else  if(root.data<data)
		   {
			root.right =  addNode(root.right,data);
		   }
		   
		   return root;
	   }
	   public void print(bstNode root)
	   {
		   if(root==null)return;
		   print(root.left);
		   System.out.println(root.data);
		   print(root.right);
	   }
	public static void main(String[] args) {
		BST bt=new BST(5);
		   bt.addNode(bt.root, 4);
		 bt.addNode(bt.root, 3);
		 bt.addNode(bt.root, 2);
		  bt.addNode(bt.root, 6);
		 bt.addNode(bt.root, 7);
		   
     bt.print(bt.root);
	}

}
