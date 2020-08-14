

public class stackusinglinkedlist<t> {
 
 private Node <t>head;
private int count =0;

public t pop(Node<t> head){
    head.next=null;	
	count--;
  return head.data;
}
public void push(t element)
{    count++;
	Node<t> newnode=new Node<>(element);
	  newnode.next=head;
	  head=newnode;
	
}
public boolean isempty(Node<t> head)
{ if(head==null)
 {
	return true;
  }
else return false; 
	
}

public int length()
{
	return count;
}

}

