package tree;
import java.util.*;
  class binarytreenode{
	  int data;
	  binarytreenode left;
	  binarytreenode right;
	  binarytreenode(int data)
	  {
		  
		  this.data=data;
		  left=null;right=null;
	  }
  }
  
public class geekTree {
	binarytreenode root;
	geekTree()
	{
		root=null;
	}
   static void inorder(binarytreenode root)
	{
		if(root==null) return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	void inorder()
	{
		inorder(root);
	}
  public static void convertBST(binarytreenode root)
	{     ArrayList<Integer>  array =new ArrayList<>(); 
	        convert(root,array);
	    	Collections.sort(array);
	    	inorder1(root,array,0);
	    	inorder(root);
	    	
	}
   public static	void inorder1(binarytreenode root,ArrayList<Integer> array,int pos)
	{
		if(root==null) return ;
		inorder1(root.left,array,pos);
		root.data=array.get(pos);
		pos++;
		inorder1(root.right,array,pos);
	} 
public static	void convert(binarytreenode root,ArrayList<Integer> array)
	{   if(root==null)return ;
	    array.add(root.data);
	    if(root.left!=null) convert(root.left,array);
		if(root.right!=null) convert(root.right,array);
	}
   static int count=0;
  public static void secondlargest(binarytreenode root,int k)
  {   if(root==null||count>=2)
    {
	  return ;
    }
	secondlargest(root.right,k);
	count++;
	if(count==k)
	{
		System.out.print(root.data);
		
	}
  secondlargest(root.left,k);
  
  }

   public static void ksmallest(binarytreenode root,int k)
   {
	   if(root==null||count>=k)
	   {
		   return ;
	   }
	   ksmallest(root.left,k);
	   count++;
	   if(count==k)System.out.print(root.data);
	   ksmallest(root.right,k);
   }
  
   
  public static binarytreenode arraytobst(int arr[],int start,int end)
{
	if(start>end)return null;
	else {
		int mid =(start+end)/2;
		binarytreenode root= new binarytreenode(arr[mid]);
		root.left=arraytobst(arr,start,mid-1);
		root.right=arraytobst(arr,mid+1,end);
		return root;
	}
}
void preOrder(binarytreenode node) {
    if (node == null) {
        return;
    }
    System.out.print(node.data + " ");
    preOrder(node.left);
    preOrder(node.right);
}
static int pos=0;
public static void  sub_sequence(binarytreenode root,int[] seq)
{
   if(root==null ||pos>=seq.length-1) return ;
   if(seq.length==pos)
   {
  	 System.out.print("YES");
   }else {
  	 System.out.print("NO");
   }
     sub_sequence(root.left,seq);
     if(root.data==seq[pos])
     {
    	 pos++;
    	 
     }
     sub_sequence(root.right,seq);
   
}

static int min =1;
static int max =Integer.MAX_VALUE;
public static void deadend(binarytreenode root,int min,int max)
{     
	   if(root==null)
	   {  
		   return;
	   }
	  
	if(min==max)
	{
		System.out.print("YES");
	}
	
	
	deadend(root.left,min,root.data-1);
	deadend(root.right,root.data+1,max);
	
}

public static void distance(binarytreenode root,HashMap<Integer,Integer> map,int count,int x,int y)
{   if(root==null)
{
	return ;
}


map.put(root.data,count);
  
distance(root.left,map,count+1,x,y);

if(root.data<x)

distance(root.right,map,count+1,x,y);	

}
public static void distance1(binarytreenode root,int x ,int y)
{
	   HashMap<Integer,Integer> map=new HashMap<>();
	    distance(root,map,0,x,y);
	    int distance=0;
	    if(map.containsKey(x)&&map.containsKey(y) )
{
	distance=map.get(x)+map.get(y);
}
	    System.out.print(distance);
}
public static void main(String args[])
	{
		geekTree tree=new geekTree();
		tree.root= new binarytreenode(8);
		tree.root.left=new binarytreenode(10);
		tree.root.right=new binarytreenode(12);
		tree.root.left.left=new binarytreenode(6);
		tree.root.right.right=new binarytreenode(14);
		//tree.inorder();
		//convertBST(tree.root);
		int array[]= {20,5,22};
		  Arrays.sort(array);
		  geekTree tree3 =new geekTree();
		  
		  tree3.root=tree3.arraytobst(array, 0, array.length-1);
		  //tree3.deadend(tree3.root,0,Integer.MAX_VALUE);
		geekTree tree1=new geekTree();
		tree1.root=new binarytreenode(8);
		tree1.root.left=new binarytreenode(5);
		tree1.root.right=new binarytreenode(9);
		tree1.root.left.right=new binarytreenode(7);
		tree1.root.left.left=new binarytreenode(2);
		tree1.root.left.left.left=new binarytreenode(1);
		
		//tree1.ksmallest(tree1.root, 5);
		//tree.sub_sequence(tree1.root, seq);
		//tree1.deadend(tree1.root);
		tree1.distance1(tree1.root, 1, 7);
	}

}
