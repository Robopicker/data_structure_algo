class doublenode
{
	int data;
	doublenode forward;
	doublenode backward;
	doublenode(int data)
	{
		this.data=data;
		forward=backward=null;
	}
}
public class pracstackusingdoublylinklist {
  doublenode head;
  int count;
  pracstackusingdoublylinklist()
  {   count=0;
	  head=null;
  }
  void push(int item)
  {  count++;
  doublenode newnode =new  doublenode(item);
    if(head==null)
    {
    	head=newnode;
    	newnode.backward=null;
    	newnode.forward=null;
    }
    newnode.forward=head;
    head.backward=newnode;
    newnode.backward=null;
    head=newnode;
	  
  }
 	int pop()
 	{
 		if(head==null)
 		{
 			return 0;
 		}
 		doublenode node =head.forward;
 		doublenode cur=head;
 		head=node;
 		head.backward=null;
 		return cur.data;
 		
 	}
 
 	public static void main(String[] args)
 	{
 		pracstackusingdoublylinklist p=new pracstackusingdoublylinklist();
 		p.push(20);
 		p.push(15);
 		p.push(10);
 		p.push(5);
 		System.out.println(p.pop());
 
 	}
	
}
