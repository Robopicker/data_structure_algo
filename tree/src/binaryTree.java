import java.util.*;
class TreeNode
{
	
	int data;
    TreeNode left;
	TreeNode right;
	TreeNode(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}
public class binaryTree {

	static TreeNode root;
	
	public static TreeNode find(TreeNode root,int data)
	{
		if(root==null)return null;
		if(root.data==data)
		{
			return root;
		}
         TreeNode a=find(root.left,data);
         TreeNode b=find(root.right,data);
         if(a!=null&&b==null)return a;
         else if(b!=null&&a==null)return b;
         return null;
	}
	public static void addNode(int p,int data,char ch)
	{
		if(root==null)
		{
			root=new TreeNode(p);
			if(ch=='l')
			{
				root.left=new TreeNode(data);
				
			}
			else {
				root.right=new TreeNode(data);
			}
		}
		TreeNode parent=find(root,p);
		
		if(ch=='l')
		{
			parent.left=new TreeNode(data);
		}
		else {
			parent.right=new TreeNode(data);
		}
		
      		
		
	}
	
	public static void print()
	{
		printl(root);
	}
	public static void printl(TreeNode root)
	{
		if(root==null)return;
		printl(root.left);
		System.out.print(root.data+" ");
		printl(root.right);
	}
	public static void main(String[] args) {
      
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		binaryTree g= new binaryTree();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int p=s.nextInt();
			int c=s.nextInt();
			char ch=s.next().charAt(0);
			addNode(p,c,ch);
			
		}
		print();

	}

}
