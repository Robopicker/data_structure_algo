class Node
{
	int key;
	Node next;
	Node(int data)
	{
		this.key=data;
	}
}
public class pracqueue {
  Node front;
  Node rear;
  int size;
  pracqueue()
  {
	  size=0;
	  front=rear=null;
  }
  void push(int data)
  {   Node newnode=new Node(data);
  
	  if(front==null&&rear==null)
	  {
	    front=newnode;
	    rear=newnode;
	  }
	
	  rear.next=newnode;
	  rear=newnode;
	  
  }
  int pop()
  {
	  if(front==null&&rear==null)
	  {
		  return 0;
	  }
	  Node p=front.next;
	  int x=front.key;
	  front=p;
	  return  x;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         pracqueue p=new pracqueue();
         p.push(10);
         p.push(15);
         p.push(25);
         System.out.println(p.pop());
	}

}
