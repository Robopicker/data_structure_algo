package array;
import java.util.Scanner;
public class difference {
  private static int difference(int arr[])
  {  int evensum=0,oddsum=0;
	  for(int i=0;i<arr.length;i++)
	    {   
	    	if(i%2==0)
	    	{
	    		evensum=evensum+arr[i];
	    	}
	    	else
	    	{
	    		oddsum=oddsum+arr[i];
	    	}
	    }
//	    System.out.println(evensum);
//	    System.out.println(oddsum);
	    int p=evensum-oddsum;
	    if(p<1) { 
	    	return -p; 
	    }
	    return p;
  }
	private static Scanner s;

	public static void main(String[] args) {
  s = new Scanner(System.in);		
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    { 
      arr[i]=s.nextInt();
      
    }
   int p=difference(arr);
 System.out.println(p);
 }

}
