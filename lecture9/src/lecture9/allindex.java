package lecture9;

public class allindex {

	public static int[] allIndexes(int input[], int x) {
		int size=count(input,x);
		  int s[]=new int[size];
		int arr[]=allIndexeshelper( input, x,s,input.length-1);
		return arr;
	}
	public static int count(int s[],int x)
	{  int count=0;
	for(int i=0;i<s.length-1;i++)
     	{   if(s[i]==x)
     	     count++;}
		return count;
	}
	public static int[] allIndexeshelper(int input[],int x,int s[],int startindex)
	{   if(startindex==input.length-1)
    	    {  return s;
    	       }  		
		 
	  int ans[] = allIndexeshelper(input,x,s,startindex+1); 
	  if(ans[startindex]==x)
		 {    int k=0;
		      s[k]=startindex;
		      k=k++;        	
	      }
		return s;
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,5,6,7,5,3,5};
	    int x[]=allIndexes(arr,5);
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]);
		}	
	}
	
}
