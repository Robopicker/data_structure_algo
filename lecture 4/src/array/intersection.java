package array;

import java.util.Arrays;

public class intersection{
	
	public static void intersection(int[] arr1, int[] arr2){
		/* Your class should be named Intersection
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
  		 */
          Arrays.sort(arr1);
      Arrays.sort(arr2);
            int n=0;
          if(arr1.length>arr2.length)
          {
            n=arr2.length;
          }
      else{
        n=arr1.length;
      }
      for(int i=0;i<n;i++)
      {
        if(arr1[i]==arr2[i])
        {
          System.out.println(arr1[i]);
        }
        else{ break;}
      }
        

	}
	public static void main(String []args)
	{
		int arr1[]= {4,2,2,3,1};
		int arr2[]= {6,5,3,2,2,1};
		intersection(arr1,arr2);
	}
}
