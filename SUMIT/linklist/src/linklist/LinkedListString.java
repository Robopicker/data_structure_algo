package linklist;
import java.util.Scanner; 

class Node<T> {

	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}
	
}
 class LinkedListUse {
 public static void printList(Node<String> head) {
		Node<String> temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
		//		temp = head;
		//		while(temp != null) {
		//			System.out.print(temp.data +" ");
		//			temp = temp.next;
		//		}
		//		System.out.println();
	}
 
 public static Node<String> takeinput() {
		Node<String> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		String data = s.nextLine();
		while(data != null) {
			Node<String> newNode = new Node<String>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				// Travel to the last Node
				/*Node<Integer> temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				// Temp is at the last node
				temp.next = newNode;*/
				tail.next = newNode;
				tail = newNode; // tail = tail.next
			}
			data = s.nextLine();
		}
		return head;
	}
 public static Node<String> insert(Node<String> head, String elem, int i) {
		Node<String> newNode = new Node<String>(elem);
		int pos = 0;
		if(i == 0) {
			newNode.next = head;
			head = newNode;
			return newNode;
		}else {
	     Node<String> temp = head;
			while(pos < i - 1 && temp != null) {
				temp = temp.next;
				pos++;
			}
			if(temp == null) {
				return head;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		return head;
	}

public static int count(Node<String> head)
{ int count=0;
 Node<String> temp=head;
 while(temp!=null)
 {
	 count=count+1;
	 temp=temp.next;
			 
 }
	return count;
}
public static Node<String> deleteIthNodeRec(Node<String> head, int i){
	
    if(head==null)
      return null;
      if(i==0)
    {
      Node<String> temp=head.next;
      head=temp;
      return head;
    }
    else
    {
      Node<String> newnode= deleteIthNodeRec(head.next,i-1);
      head.next=newnode;
      return head;
    }
		
	}
public static Node<String> reverse_R(Node<String> head)
{   if(head.next==null)
  {
	return head;
    }
	Node<String> p=head;
	Node<String> q=head.next;
	q=reverse_R(q);
	p.next.next=p;
	q.next=p;
	p.next=null;
	return q;
}
	
 }
public class LinkedListString {

	public static void main(String[] args) {
//		Node<String> head = takeInput();
//		head = insert(head, "yogesh", 0);
//		printList(head);
		LinkedListUse pointer=new LinkedListUse();
			Node<String> head = new Node<String>("yogesh12");
				Node<String> node1 = new Node<>("yogesh");
				
				Node<String> node2 = new Node<>("kumar");
				node1.next = node2;
			Node<String> node3 = new Node<>("rohilla");
				node2.next = node3;
				Node<String> node4 = new Node<>("RZ");
			node3.next = node4;
			head=node1;
				pointer.printList(head);
        Node<String> newhead=  pointer.reverse_R(head);
	     pointer.printList(newhead);


	}

}
