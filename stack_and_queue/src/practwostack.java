
public class practwostack {
    int size;
    int top1;
    int top2;
    int arr[];
    practwostack(int size)
    {
    	arr=new int[size];
    	this.size=size;
    	top1=-1;
    	top2=size;
    }
   void pushstack1(int item)
   {
	   if(top1<top2-1)
	   {
		   top1++;
		   arr[top1]=item;
	   }
	   else
	   {
		   System.out.print("overflow");
	      return ;
	   }
   }
   void pushstack2(int item)
   {
	   if(top2>top1+1)
	   {
		top2--;
		arr[top2]=item;
		  
	   }
	   else
	   {
		   System.out.print(" overflow");
		   return ;
	   }
   }
    int popstack1()
    {   int data;
    	if(top1>=0)
    	{
    		data=arr[top1];
    		top1--;
    	}
    	else
    	{
    		System.out.print(" underflow");
    		return 0;
    	}
    	return data;
    }
    int pop2()
    {
        if(top2 < size)
        {
            int x =arr[top2];
            top2++;
            return x;
        }
        else
        {
            System.out.println("Stack Underflow");
            System.exit(1);
 
        }
        return 0;
    }
	public static void main(String[] args) {
		 practwostack s=new  practwostack(10);
		 for(int i=1;i<6;i++)
		 s.pushstack1(i);
		 for(int i=6;i>1;i--)
			 s.pushstack2(i);
		 System.out.println(s.popstack1());
		 System.out.println(s.pop2());

	}

}
