package design_algo;
   
  class Queue
  {
	  int front;
	  int rear;
	  int arr[];
	  int size;
	  public Queue(int size)
	  {    front=-1;
	       rear=-1;
		  arr=new int[size];
		  this.size=size;
	  }
	  
	  
  }
  

public class circular_queue {
       
	Queue cir;
	  int size=0;
	    circular_queue(int size)
	    {   this.size=size;
	    	cir=new Queue(size); 
	    }
	    void insert(int x)
	    {
	    	   if(cir.front==0&&cir.rear==size-1||cir.rear+1==cir.front)
	    	   {
	    		   System.out.print("overflow");
	    		   return ;
	    	   }
	    		   
	    	
	          if(cir.front==-1&&cir.rear==-1)
	          {
	        	  cir.front=0;cir.rear=0;
	        	  cir.arr[cir.rear]=x;
	          }
	          else if(cir.front!=0&&cir.rear==size-1)
	          {
	        	  cir.rear=0;
	        	  cir.arr[cir.rear]=x;
	          }
	          else {
	        	  cir.rear++;
	        	  cir.arr[cir.rear]=x;
	          }
	         
	    }
	    int delete()
	    {
	        if(cir.front==-1)
	        {
	        	System.out.println(" empty queue");
	        	return -20;
	        }
	        
	        else {
	        	int item=cir.arr[cir.front];
	        	
	        	 if (cir.front == cir.rear) 
	        	    { 
	        	        cir.front = -1; 
	        	        cir.rear = -1; 
	        	    } 
	        	    else if (cir.front == size-1) 
	        	        cir.front = 0; 
	        	    else
	        	        cir.front++; 
	        	  
	        	    return item; 
	        }
	        
	    	
	    }
	    
	    void print()
	    {   if(cir.front==-1)
	    {
	    	System.out.println("queue is empty");
	    	return ;
	    }
          if(cir.rear>=cir.front)
          {
        	  for(int i=cir.front;i<=cir.rear;i++)
	          {
	        	  System.out.print(cir.arr[i]+" ");
	          }
          }
          else {
	    	
	          for(int i=cir.front;i<cir.size;i++)
	          {
	        	  System.out.print(cir.arr[i]+" ");
	          }
	          
	          int j=0;
	          for( j=0;j<=cir.rear;j++)
	          {
	        	  System.out.print(cir.arr[j]+" ");
	          }
          }
	    }
	
	
	public static void main(String []args)
	{
		circular_queue q=new circular_queue(5);
		 
		     q.insert(5);
		     q.insert(7);
		     q.insert(9);
		     q.insert(19);
		     q.insert(12);
		   
		     q.delete();
		     q.delete();
		     q.insert(1);
		     q.insert(2);
		    
		     q.print();
		     System.out.println();
		     System.out.print(x+" ");
	    
	}
}
