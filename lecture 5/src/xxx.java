
public class xxx {
	public static int sum(int n) {
		if(n==1)
		{
			return 1;
			
		}
		return n+sum(n-1);
	}


	public static int sum(int input[])
	{   if(input.length==0)          
     	{  
           return 0;  		
         	}
	int smallinput[]=new int[input.length-1];
	  for(int i=1;i<input.length;i++)
	  {
		  smallinput[i-1]=input[i];
	  }
	
         return input[0]+sum(smallinput);         
	}
	public static boolean checkNumber(int input[], int x) {
		
      if(input[0]==x)
        {
        return true;     
        }
      else  if(input.length==0) return false;
     
      int array1 []=new int[input.length-1];
      for(int i=1;i<input.length;i++)
      {
        array1[i-1]=input[i];
      }
   boolean ans =checkNumber(array1,x);
   return ans;
  
		
	}
	public static int findlargest(int input[])
	{       if(x>array2[0])
    {   
	   array2[0]=x;
       return array2[0];
 }
 else
   {
	   return x;
    } 
		if(input.length==0)
		{
			return -1;
		}
		int x=input[0];
	   int array2 []=new int[input.length-1];
	   for(int i=1;i<input.length;i++)
	   {
	     array2[i-1]=input[i];
	   }
	  	
int  z = findlargest(array2);  
        return z ;
	}
	
	public static int power(int x, int n) {
	if(n==0)
	{
		return 1;
	}
	return x*power(x,n-1);
		
	}
	public static void main(String[] args) {
		//System.out.println(power(3,4));// TODO Auto-generated method stub
      //  System.out.println(sum(10));
		int arr[]= {1,6,3,4,5,6};
		//int p=sum(arr);
		//System.out.println(p);
	//boolean b=checkNumber(arr,4);
		//System.out.println(b);
		int x=findlargest(arr);
		System.out.println(x);
	}

}
