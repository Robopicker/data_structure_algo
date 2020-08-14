import java.util.*;
 class Node
 {
	 int data;
	 Node left;
	 Node right;
	 int height;
	 int size;
	 public Node(int data)
	 {
		 this.data=data;
		 this.size=size;
		 this.height=height;
		 
	 }
 }
public class BST {
  static Node root;
  public static int height(Node root)
  {
	  if(root==null)return 0;
   return root.height;
  }
  public static Node rightrotate(Node root)
  {
	  
	  Node newRoot=root.left;
	    root.left=root.left.right;
	    newRoot.right=root;
	    root.height = setHeight(root);
        root.size = setSize(root);
        newRoot.height = setHeight(newRoot);
        newRoot.size = setSize(newRoot);
        return newRoot;
	  
  }
  public static Node leftrotate(Node root)
  {
	  Node newRoot=root.right;
	    root.right=root.right.right;
	    newRoot.left=root;
	    root.height = setHeight(root);
      root.size = setSize(root);
      newRoot.height = setHeight(newRoot);
      newRoot.size = setSize(newRoot);
      return newRoot;
	  
  }
  public static int setHeight(Node root){
      if(root == null){
          return 0;
      }
      return 1 + Math.max((root.left != null ? root.left.height : 0), (root.right != null ? root.right.height : 0));
  }
  public static int setSize(Node root){
      if(root == null){
          return 0;
      }
      return 1 + Math.max((root.left != null ? root.left.size : 0), (root.right != null ? root.right.size : 0));
  }
  
  public static Node addNode(Node root,int data)
  {
	  if(root==null)
	  {
		  return new Node(data);
		  
	  }
	  if(root.data>data)
	  {
		  root.left=addNode(root.left,data);
		
	  }
	  else if(root.data<data)
	  {
		  root.right=addNode(root.right,data);
		  
	  }
	  else {
		  
		  int balance=height(root.left)-height(root.right);
		  if(balance>1)
		  {
			if(height(root.left.left)>height(root.left.right))
			{
				root= rightrotate(root);
			}
			else {
				root.left=leftrotate(root.left);
				root=rightrotate(root);
				
			}
		  }
		  else if(balance<-1)
		  {
			  
			  if(height(root.left.left)<height(root.left.right))
				{
					root=leftrotate(root);
				}
				else {
					root.right=rightrotate(root.right);
					root=leftrotate(root);
					
				}
		  }
		  else{
	            root.height = setHeight(root);
	            root.size = setSize(root);
	        }
	        return root;
	  }
	  return root;
	 
  }
  public static Node delete(Node root,int data)
  {
	  if(root==null)return null;
	  if(root.data<data)
	  {
		  root.right=delete(root.right,data);
		  
	  }
	  else if(root.data>data)
	  {
		  root.left=delete(root.left,data);
		
	  }
	  else {
		  
		  if(root.left==null&&root.right==null)
		  {
			root= null;
		  }
		  else if(root.left!=null&&root.right==null)
		  {
			 root=root.left;
		  }
		  else if(root.right!=null&&root.left==null)
		  {
			  root= root.right;
		  }
		  else {
			  
			  Node temp=root.right;
			  while(temp.left!=null)
			  {
				temp=temp.left;  
			  }
			  root.data=temp.data;
			  root.right=delete(root,root.data);
			  
		  }
		  
		
	  }
	  int balance=height(root.left)-height(root.right);
	  if(balance>1)
	  {
		  if(height(root.left.left)>height(root.left.right))
		  {
			  root=rightrotate(root);
		  }
		  else {
			  root.left=leftrotate(root.left);
			  root=rightrotate(root);
			  
			  
		  }
	  }
	  if(balance<-1)
	  {
		  if(height(root.right.right)>height(root.right.left))
		  {
			  root=leftrotate(root);
			  
		  }
		  else {
			  root.right=rightrotate(root.right);
			  root=leftrotate(root);
			  
		  }
	  }
	  return root;
		  
  }
  public static void print()
  {
	  printl(root);
  }
  public static void printl(Node root)
  {
	  if(root==null)return ;
	  printl(root.left);
	  System.out.print(root.data+" ");
	  printl(root.right);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      while(n-->0)
      {
    	  root=addNode(root,s.nextInt());
      }
        System.out.print("enter delete num");
       Node temp=delete(root,s.nextInt());
      printl(temp);
	}

}
