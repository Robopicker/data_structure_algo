
public class QueueUsingLinkList<T> {
 Node<T> front;
 Node<T> rear;
 int size=0;
   public QueueUsingLinkList()
     { front=null;
       rear=null;
    }
   public boolean isEmpty()
   {
	   return size==0;
   }
   public int size()
   {
	   return size;
   }
   public void enqueue(T element)
   {  
	   Node<T> newnode=new Node<>(element);
	   if(size==0)
	   {
		   front=newnode;
		    rear=newnode;    
	   }
		   rear.next=newnode;
		   rear=rear.next;
       size++;
   }
   public T dequeue() throws QueueEmptyException
   {  if(size==0)
     {
	   throw new QueueEmptyException();
      }
   T temp=front.data;
   size--;
   if(size==0)
   {
	   front=null;
	   rear=null;
   }
   else
   {
   front=front.next;
   }
   return temp;
	    
   }
   public T Front() throws QueueEmptyException 
   { if(size==0)
   {
	   throw new QueueEmptyException();
   }
	   return front.data;
   }
   


}
