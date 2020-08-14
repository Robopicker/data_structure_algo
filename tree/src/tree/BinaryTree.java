package tree;
class node1
{
 int key;
 Node left, right;

 public node1(int item)
 {
     key = item;
     left = right = null;
 }
}

class BinaryTree
{
 node1 root;

 BinaryTree()
 {
     root = null;
 }
void PrintGivenLevel(Node node,int level)
{   if(level==0)
   {
	return ;
     }

	if(level==1)
	{
		System.out.print(node.key+" ");
	}
	else if(level>1)
	{
		System.out.print(node.key+" ");
	}
	PrintGivenLevel(node.left,level-1);
	PrintGivenLevel(node.right,level-1);
	
}
void PrintLevelOrder(Node node)
{
	int height=height(root);
	for(int i=0;i<height;i++)
	{
		PrintGivenLevel(root,i);
	}
}
 
int height(Node node)
{   if(node==null)
  {
	return 0;
   }

	int height1=height(node.left);
	

	int height2=height(node.right);
	if(height1>height2)
		return 1+height1;
	else return 1+height2;
	
}
 void printPostorder(Node node)
 {
     if (node == null)
         return;
     printPostorder(node.left);

     printPostorder(node.right);

     System.out.print(node.key + " ");
 }

 void printInorder(Node node)
 {
     if (node == null)
         return;

     /* first recur on left child */
     printInorder(node.left);

     /* then print the data of node */
     System.out.print(node.key + " ");

     /* now recur on right child */
     printInorder(node.right);
 }

 /* Given a binary tree, print its nodes in preorder*/
 void printPreorder(Node node)
 {
     if (node == null)
         return;

     /* first print data of node */
     System.out.print(node.key + " ");

     /* then recur on left sutree */
     printPreorder(node.left);

     /* now recur on right subtree */
     printPreorder(node.right);
 }
  public boolean ISBST(Node root)
  {
	  return ISBSTHELPER(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
  }
  public Boolean ISBSTHELPER(Node head,int min ,int max)
  {
	  if(root==null)
	  {
		  return false;
	  }
	  if(root.key<min||root.key>max)
	  {
		  return false;
	  }
	  return ISBSTHELPER(head.left,min,max-1)&&ISBSTHELPER(head.right,min+1,max);
  }



 void printPostorder()  {     printPostorder(root);  }
 void printInorder()    {     printInorder(root);   }
 void printPreorder()   {     printPreorder(root);  }
void PrinLevelOrder() { PrintLevelOrder(root);}
 
 public static void main(String[] args)
 {
     BinaryTree tree = new BinaryTree();
//     tree.root = new Node(1);
//     tree.root.left = new Node(2);
//     tree.root.left.left=new Node(10);
//     tree.root.right = new Node(3);
//     tree.root.right.right=new Node(8);
//     tree.root.left.right = new Node(5);
//     
//        System.out.println("Preorder traversal of binary tree is ");
//        tree.printPreorder();
// 
//        System.out.println("\nInorder traversal of binary tree is ");
//        tree.printInorder();
// 
//        System.out.println("\nPostorder traversal of binary tree is ");
//        tree.printPostorder();
     tree.root = new Node(1);
     tree.root.left = new Node(2);
     tree.root.right = new Node(3);
     tree.root.left.left = new Node(4);
     tree.root.left.right = new Node(5);
       
     System.out.println("Level Order traversal of binary tree is : ");
     

//        System.out.println("\n LevelOrder of binary tree is ");
        tree.PrinLevelOrder();
 }
}
