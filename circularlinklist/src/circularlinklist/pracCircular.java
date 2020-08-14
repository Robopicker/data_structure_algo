package circularlinklist;
 class Node
 {
	 int key;
	 Node next;
	 Node(int data)
	 {
		 this.key=data;
	 }
 }
public class pracCircular {
	Node head;
	pracCircular()
	{
		head=null;
	}
	void insertAt0(int data)
	{ 
		Node newnode =new Node(data);
	  if(head==null)
	  {
		  head=newnode;
	  }
	  newnode.next=head;
	  head=newnode;
	}
	
	int  delete()
	{
		if(head==null)
		{
			return -1;
		}
		Node p=head.next;
		int x=head.key;
		head=p;
		return x;
	}
	void print()
	{
		Node p=head;
		while(p!=null)
		{
			System.out.print(p.key+" ");
			p=p.next;
		}
	}

	public static void main(String[] args) {
		pracCircular p=new pracCircular();
	    p.head =new Node(10);
		p.insertAt0(3);
		p.insertAt0(2);
		p.insertAt0(1);
		p.insertAt0(0);
		p.insertAt0(8);
		p.print();

	}

}
