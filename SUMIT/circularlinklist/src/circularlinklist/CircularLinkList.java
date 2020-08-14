package circularlinklist;
import java.util.Scanner;
class LinkedListNode<T> {

	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}
	
class LinkedList {
	private LinkedListNode<Integer> head;
	public LinkedList()
	{
		head=null;
	}
	
	public static int length(LinkedListNode<Integer> head){
	    LinkedListNode<Integer> temp=head.next;
      int count=0;
    
      while(temp!=head)
      {
        count=count+1;
        temp=temp.next;
      }
      
		return count;
	}
	
	//public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head,int data)
	public static LinkedListNode<Integer> takeInput() 
	{  
		LinkedListNode<Integer> head = null,tail=null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data != -1) {
			LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
			if(head == null) {
				head = newNode;
				head.next=head;
			}else {
				// Travel to the last Node
				/*Node<Integer> temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				// Temp is at the last node
				temp.next = newNode;*/
				tail.next = newNode;
				 tail= newNode; // tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}
//		if(head==null)
//		{
//			temp.next=temp;
//			return temp;
//		}
//		else if(head!=null)
//		{
//		   while(temp1!=null)
//		   {
//			   temp=temp.next;
//		   }
//		   temp.next=head;	
//		}
//		return head;
//		
//	}
	public static LinkedListNode<Integer> Delete(LinkedListNode<Integer> head,int data,int pos)
	{ LinkedListNode<Integer> temp=head.next;
	LinkedListNode<Integer> save=head;
	 int count=0;
		while(temp!=head&&count<pos)
	     {
			count++;
			save=temp;
			temp=temp.next;
		  }
	   if(pos==length(head))
	   {
		   save.next=head;
		   return head;
	   }
	   if(temp.data==data)
		{
			save=temp.next;
			return head;
		}
	   else
	    {
		   return head;
	      }
		
	}
	public static void printList(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head.next;
		while(temp != head) {
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
   public  void insert(int element)
   {
	   LinkedListNode<Integer>
   }

/*	public static LinkedListNode<Integer> insert( int elem, int i) {
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(elem);
		int pos = 0;
		if(i == 0) {
			newNode.next = head;
			head = newNode;
			return newNode;
		}else {
			LinkedListNode<Integer> temp = head;
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
*/

}
public class CircularLinkList
{
  public static void main(String[]args)
  {
	  LinkedList l=new LinkedList();
	 l.insert(1);
	 
	  
	  
  }
}
