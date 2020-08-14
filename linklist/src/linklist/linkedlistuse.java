package linklist;

import java.util.Scanner;

public class linkedlistuse {
	
	private static Scanner s;
	
	public static void printList(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
		if(head.data.equals(head.next))

	}
	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;
		s = new Scanner(System.in);
		int data = s.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				
				tail.next = newNode;
				tail = newNode; 
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		printList(head);
	
	}

}
