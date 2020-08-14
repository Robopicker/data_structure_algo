class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}
 class StackEmptyException extends Exception {

}

 class Stack<T> {
  private Node <T>head;
  private int count =0;

	public Stack() {
    head=null;
	}
  public void push(T data) {
       count++;
      Node<T> newnode=new Node<>(data);
    if(head==null)
    {
      head=newnode;
      
    }
    else { newnode.next=head;
      head=newnode;}
	}
	public T pop() throws StackEmptyException {
         if(head==null)
         {
          StackEmptyException e = new StackEmptyException();
			throw e;
         }
      else
      {
        Node<T> temp=head;
        head=head.next;
         count--;
         return temp.data;
      }    
	}
	public int size() {
       return count;
	}
	public boolean isEmpty() {
      if(head==null)
      {
        return true;
      }
      else
      {
        return false;
      }
	}
	public T top() throws StackEmptyException {
      if(head==null)
      {
         StackEmptyException e = new StackEmptyException();
			throw e;
        
      }
      else
      {
        return head.data;
      }

	
 }
 }

public class Balance {

	public static boolean checkBalanced(String exp) {
	   Stack<Character> s=new Stack<>();
        int count=0;
      while(count<exp.length())
      {   
        count++;
      }
  return true;
	}
}
 
