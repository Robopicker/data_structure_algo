package lecture9;

public class allindex2 {
	public static int[] allIndexes(int input[], int x)
	{
		int arr[]=allIndexeshelper(input,x,0);
		return arr;
	}
	public static int[] allIndexeshelper(int input[],int x,int startindex)
	{   if(startindex==input.length)
    	    {  
		    int base[]= new int[0];
		    return base;    
    	       }  		
		 
	  int smallarray[] = allIndexeshelper(input,x,startindex+1);
	  
	  if(input[startindex]==x)
		 {    int newarray[]=new int[smallarray.length+1];
		        newarray[0]=startindex;
		      		    for(int i=1;i<newarray.length;i++)
		      		    {
		      		    	newarray[i]=smallarray[i-1];
		      		    	
		      		    }
		      		    return newarray;
	      }
		return smallarray;
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,5,6,7,5,3,5};
	    int x[]=allIndexes(arr,5);
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}	
	}
}
