package tree;




import java.util.Scanner;
import java.util.Stack;

import stack and queue.QueueEmptyException;
import stack_and queue.QueueUsingLL;

public class TreeUse {

	public static  TreeNode<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data ");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		System.out.println("Enter number of children of " + rootData);
		int numChild = s.nextInt();
		for(int i = 0; i < numChild; i++) {
			TreeNode<Integer> ithChild = takeInput();
			root.children.add(ithChild);
		}
		return root;
	}
	
	public static TreeNode<Integer> takeInputLevelWise(){
		
		Scanner s = new Scanner(System.in);
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data ");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while(! pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> currentNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of " + currentNode.data);
				int numChild = s.nextInt();
				for(int i = 0; i < numChild; i++) {
					System.out.println("Enter " +i+" th child of " + currentNode.data);
					int childData = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
					currentNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
//				pendingNodes.dequeue();
			} catch (QueueEmptyException e) {}		
		}
		return root;
	}

	public static void print(TreeNode<Integer> root) {
		
		System.out.print(root.data +": ");
		for(int i = 0; i < root.children.size(); i++) {
			System.out.print(root.children.get(i).data+", ");
		}
		System.out.println();
		for(int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	
	public static int count(TreeNode<Integer> root) {
		int ans = 0;
		for(int i = 0; i < root.children.size(); i++) {
			ans +=count(root.children.get(i));
		}
		return ans + 1;
	}
	
	public static TreeNode<Integer> maxDataNode(TreeNode<Integer> root){
		
		TreeNode<Integer> max = root;
		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> maxInChild = maxDataNode(root.children.get(i));
			if(maxInChild.data > max.data) {
				max = maxInChild;
			}
		}
		return max;
	}
	
	public static void printAtDepthK(TreeNode<Integer> root, int depth) {
		if(depth == 0) {
			System.out.println(root.data);
			return;
		}
		for(int i = 0; i < root.children.size(); i++) {
			printAtDepthK(root.children.get(i), depth - 1);
		}
	}
	
	public static void replaceWithDepth(TreeNode<Integer> root) {
		replaceWithDepth(root, 0);
	}

	private static void replaceWithDepth(TreeNode<Integer> root, int depth) {
		root.data = depth;
		for(int i = 0; i < root.children.size(); i++) {
			replaceWithDepth(root.children.get(i), depth + 1);
		}
	}
	
	
	public static void preOrder(TreeNode<Integer> root) {
		System.out.print(root.data +" ");
		for(int i = 0; i < root.children.size(); i++) {
			preOrder(root.children.get(i));
		}
	}
	
	public static void postOrder(TreeNode<Integer> root) {
		for(int i = 0; i < root.children.size(); i++) {
			postOrder(root.children.get(i));
		}
		System.out.print(root.data +" ");
	}
	// 10 3 30 30 40 1 50 2 60 70 1 80 0 0 0 0
	public static void main(String args[]) {
		
		TreeNode<Integer> root = takeInputLevelWise();
		print(root);
		System.out.println(maxDataNode(root).data);
//		TreeNode<Integer> node1 = new TreeNode<Integer>(10);
//		System.out.println(node1.data);
//		TreeNode<Integer> node2 = new TreeNode<Integer>(20);
//		TreeNode<Integer> node3 = new TreeNode<Integer>(30);
//		TreeNode<Integer> node4 = new TreeNode<Integer>(40);
//		node1.children.add(node2);
//		node1.children.add(node3);
//		node1.children.add(node4);
//		for(int i = 0; i < node1.children.size(); i++) {
//			System.out.println(node1.children.get(i));
//		}
//		for(TreeNode<Integer> child: node1.children) {
//			System.out.println(child);
//		}

		//		System.out.println(node1.children.size());
		//		System.out.println(node1.children.get(0));

	}

}

