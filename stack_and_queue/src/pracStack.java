
public class pracStack {
      int size;
      int top;
      int arr[];
      pracStack(int size)
      {   arr=new  int[size];
    	  this.size=size;
    	  top=-1;
      }
      void push(int item)
      {   if(top==size)
        {
    	   System.out.println("overflow"); 
         }
      else 
       top=top+1;
       arr[top]=item;  
      }
      int  pop()
      {
    	  if(top==-1)
    	  {
    		  System.out.println("underflow");
    	  }
    	  int item=arr[top];
    	  top=top-1;
    	  return item;
      }
      int size()
      {
    	  return top+1;
      }
      int top()
      {
    	  return arr[top];
      }
	public static void main(String[] args) {
     pracStack s=new pracStack(5);
     s.pop();
       s.push(4);
       s.push(3);
       s.push(6);
       s.push(7);
       s.push(8);
       System.out.println(s.top());
       System.out.println(s.pop());
       System.out.println(s.pop());
     
     
	}

}
