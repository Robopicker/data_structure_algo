package tree;

public class BinarySearchTree {
	class Node
	{
	 int Key;
	 Node left, right;

	 public Node(int item)
	 {
	     Key= item;
	     left = right = null;
	 }
	}
    // Root of BST
    Node root;
 
    // Constructor
    BinarySearchTree() { 
        root = null; 
    }
 
    // This method mainly calls insertRec()
    void insert(int key) {
       root = insertRec(root, key);
    }
     
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int data) {
 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(data);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (data< root.Key)
            root.left = insertRec(root.left,data);
        else if (data > root.Key)
            root.right = insertRec(root.right,data);
        return root;
    }
 
    // This method mainly calls InorderRec()
    void inorder()  {
       inorderRec(root);
    }
  public  int minValue(Node root)
    {
        int minv = root.Key;
        while (root.left != null)
        {
            minv = root.left.Key;
            root = root.left;
        }
        return minv;
    }
 
    public Node Delete(Node head,int item)
    {
    	if(head==null)
    	{
    		return head;
    	}
    	else if(head.Key>item)
    		root.left= Delete(head.left,item);
    	else if(head.Key<item)
         root.right= Delete(head.right,item); 
    	else
    	{
    		if(head.right==null)
    			return head.left;
    		if(head.left==null)
             return head.right;
    		else
    			root.Key=minValue(root.right);
    		   root.right=Delete(root.right,root.Key);
    	}
    	return root;
    }
    void delete(int item)
    {
    	System.out.println(Delete(root,item));
    }
  public  Boolean CompareTree(Node head1, Node head2)
  {    if(head1==null&&head2==null)
    {
	    return true;
      }
	  if(head1==null||head2==null)
	  {
		  return false;
	  }
	  if(head1.Key==head2.Key&&CompareTree(head1.left,head2.left)&&CompareTree(head1.right,head2.right))
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.Key);
            inorderRec(root.right);
        }
    }
//    public Node InorderPreceder(Node head,Node pre,Node suc,int data)
//    {    
//    	if(head==null)
//    	{
//    		return head;
//    	}
//    	if(head.Key==data) {
//    		if(head.left!=null)
//    		{
//    			Node temp=head;
//    			while(temp.left!=null)
//    			{
//    				temp=temp.right;
//    			}
//    			pre=temp;
//    		}
//    		if(head.right!=null)
//    		{
//    			Node temp=head;
//    			while(temp.right!=null)
//    			{
//    				temp=temp.left;
//    			}
//    			suc=temp;
//    		}
//    	  	
//    	}
//    	if(head.Key>data)
//		{
//			suc=head;
//			InorderPreceder(head.left,pre,suc,data);
//		}
//    	
//    }
//			  

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		 BinarySearchTree tree1=new BinarySearchTree();
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree1.insert(50);
        tree1.insert(30);
        tree1.insert(20);
        tree1.insert(40);
        tree1.insert(70);
        tree1.insert(60);
        tree1.insert(80);
        // print inorder traversal of the BST
       // tree.inorder();

    }

	}

