
public class pracstackusinginklist {
   int count;
    Node<Integer> head;
   pracstackusinginklist()
   {
	   head=null;
	   count=0;
   }
   void push(int item)
   {    count++;
	   if(head==null)
	   {   
		   Node<Integer> newnode=new Node<>(item);
	          head=newnode;
	   }
	   else
	   {    
		  
		   Node<Integer> newnode=new Node<>(item);
		   newnode.next=head;
		   head=newnode;
	   } 
   }
   int pop()
   {
	   if(head==null)
	   {
		   System.out.println("underflow");
	   }
	   Node<Integer> p=head.next;
	        Node <Integer>prev=head;
	      head=p;
	      count--;
	      return prev.data;
   }
   int size()
   {
	   return count;
   }
   Boolean isempty()
   {
	   return head==null?true:false;
   }
   void print()
   {
	   while(head!=null)
	   {
		   System.out.print(head.data+" ");
		   head=head.next;
	   }
   }
	public static void main(String[] args) {
		pracstackusinginklist p=new pracstackusinginklist();
		p.push(5);
		p.push(10);
		p.push(15);
       p.push(20);
       p.pop();
       p.print();
       
	}

}
