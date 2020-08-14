package design_algo;
import java.util.*;
class Node
{
	int data;
	Node left;Node right;
	public Node(int data)
	{
		this.data=data;left=null;right=null;
	}
}


public class BinaryTree {
    Node root;
    BinaryTree(int data)
    {
    	root=new Node(data);
    }
    
    void addNode(int data,char ch)
    {
    	if(ch=='l')
    	{
    		Node temp=root;
    		while(temp.left!=null)
    		{
    			temp=temp.left;
    		}
    		temp.left=new Node(data);
    		
    	}
    	else {
    		
    		Node temp=root;
    		while(temp.right!=null)
    		{
    			temp=temp.right;
    		}
    		temp.right=new Node(data);
    	}
    }
    void Print()
    {
    	print_util(root);
    }
	
    void print_util(Node root)
    {
    	if(root==null)return ;
    	
    	print_util(root.left);
    	System.out.println(root.data);
    	print_util(root.right);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BinaryTree bt=new BinaryTree(4);
		 bt.addNode(3, 'l');
		 bt.addNode(2, 'l');
          bt.addNode(1, 'l');
          bt.addNode(0,'l');
          bt.addNode(5, 'r');
          bt.addNode(6, 'r');
          bt.Print();
	}

}
