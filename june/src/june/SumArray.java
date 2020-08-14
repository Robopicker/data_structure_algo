package june;
import java.util.*;
public class SumArray {

	public static int[] sum(int arr1[],int arr2[])
	{  int size=0;
	  int m=arr1.length;
	  int n=arr2.length;
	  if(m-n==0)size=m;
	  else if(m-n>0)size=m+1;
	  else size=n+1;
      int carry=0;	 
	  int sum[]=new int[size];
	  int newtemp[]=new int[size];
	  
	  if(m-n>0)
	  {
		  for(int i=m-n;i<m;i++)
			  newtemp[i]=arr2[i-(m-n)];
		  
		  for(int i=size-1;i>=0;i--)
		  {  
			  int temp1=newtemp[i]+arr1[i]+carry;
			  if(temp1<9)
			  {
				  sum[i]=temp1;
				  carry=0;
			  }
			  else if(temp1>9)
			  {
				  sum[i]=temp1%10;carry=1;
			  }
			  else {
				  sum[i]=temp1;
			  }
		  }
		  if(carry!=0)sum[0]=carry;
		  
	  }
	  else if(m-n<0)
	  {
		  for(int i=n-m;i<n;i++)
			  newtemp[i]=arr1[i-(n-m)];
		  
		  
	  }
	 
	return sum;
	}
	public static void main(String args[])
	{
		int arr1[]= {9,9};
		int arr2[]= {1,};
	int arr[]=	sum(arr1,arr2);
	for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");
	}
	
}
