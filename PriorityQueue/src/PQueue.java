class Node
{
	int key;
	Node next;
	int PR;
	Node(int data,int pr)
	{
		this.key=data;
		this.PR=pr;
	}
}
public class PQueue {
      Node front;
      Node rear;
      int size;
      PQueue()
      {     size=0;
    	  front=rear=null;
      }
	void push(int item,int prnum)
	{     Node newnode=new Node(item,prnum);
		if(size==0)
		{
			front=newnode;
			rear=newnode;
		}
		else {
		Node pt=front;
		while(pt.PR<prnum)
		{
			pt=pt.next;
		}
		newnode.next=pt.next;
		pt.next=newnode;
		
		 }
		
	}
	
//	void print()
//	{
//		Node pt=front;
//		
//		while(pt!=null)
//		{
//			System.out.print(pt.key+" ");
//			pt=pt.next;
//		}
//	}
	
	int pop()
	{   
		if(front==rear)
		{   
			int x=front.key;
			front=null;
			rear=null;
			return x;
		}
		int x=front.key;
		size--;
		if(size==0)
		{
			return 0;
		}
		else {
		front=front.next;
		}
		return x;
		
	}
	public static void main(String[] args) {
    PQueue p=new PQueue();
    p.push(5, 1);
    p.push(1, 2);
    p.push(2, 3);
    System.out.println(p.pop());
  

	}

}
