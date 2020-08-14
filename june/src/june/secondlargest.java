package june;


import java.util.*;
public class secondlargest{	
	
	public static int secondLargestElement(int[] arr) {
		/* Your class should be named SecondLargest
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
  		 */
     
      int size=arr.length-1;
      int num=0;
      int count=0;
      Arrays.sort(arr);
      
      
      for(int i=size;i>=0;i--)
      {   if(i-1<0)break;
      if(arr[i]!=arr[i-1])
      {
        num=arr[i-1];
        break;
      }
      
      else if(arr[i]==arr[i-1])
        {
          count++;
        }
        
        
      }
      if(count==size)return -1;
   return num;

	}
	public static void main(String args[])
	{
		int arr[]= {2,2,3};
		int a=secondLargestElement(arr);
		System.out.print(a);
	}
}