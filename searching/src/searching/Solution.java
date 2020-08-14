package searching;
import java.util.*;
public class Solution {

	public static void delete(int arr[],int n,int k)
	{
		int pos=deleteposition(arr,k);
		if(pos==-1)
		{
			System.out.println("no solution");
		}
		else {
			int i;
			for(i=pos;i<n-1;i++)
			{   
				arr[i]=arr[i+1];
			}
			arr[i]=0;
		}
	}
	
	private static int deleteposition(int[] arr, int k) {
		
		   for(int i=0;i<arr.length;i++)
		   {
			   if(arr[i]==k)
			   {
				   return i;
			   }
		   }
		  
		return -1;
	}

	public static void insertion_sort(int arr[],int n)
	 {
	        for(int i=0;i<n;i++)
	        {
	        	int key=arr[i];
	        	int j=i-1;
	        	  while (j >= 0 && arr[j] > key)
	              {
	                  arr[j+1] = arr[j];
	                  j = j-1;
	              }
	              arr[j+1] = key;
	        }
	        
	        
	   }
	public static int[] abs_arrange(int arr[],int k)
	{   int index[]=new int[arr.length];
	    int temp[]=new int[arr.length];
	    for(int i=0;i<arr.length;i++)
	    {
	    	index[i]=Math.abs(arr[i]-k);
	    }
	  
	    int count=0;
	    while(count<temp.length)
	    {    int temp2=index_1(index);
	         
	          putzero(temp2,index);
	    	
	        temp[count]=arr[temp2];
	    	   count++;
	    }
	   return temp;
	}
	
  private static void putzero(int temp2, int[] index) {
	   for(int i=0;i<index.length;i++)
	   {
		   if(temp2==index[i])
		   {
			   index[i]=-1;
		   }
	   }
		
	}

private static int index_1(int[] index) {
		
	  int num=Integer.MAX_VALUE;
	  for(int i=0;i<index.length;i++)
	  {    if(index[i]==-1)
	  {
		  continue;
	  }
		  if(index[i]<num)
		  {
			  num=index[i];
		  }
	  }
	  
		return num;
	}

public static void wave_from(int arr[])
  {
	  for(int i=0;i<arr.length;i=i+2)
	  {
		  if(i<arr.length-1&&arr[i]<arr[i+1])
		  {
			  swap(arr,i,i+1);
		  }
		  if(i>0&&arr[i-1]>arr[i])
		  {
			  swap(arr,i-1,i);
		  }
	  }
  }
	private static void swap(int arr[],int i, int j) {
	int temp=arr[j];
	arr[j]=arr[i];
	arr[i]=temp;
	
}

	public static void main(String []args)
	{
		int arr[]= {2, 6, 8, 3};
		//insertion_sort(arr,);
	        int arr1[]=  abs_arrange(arr,5);
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
}
