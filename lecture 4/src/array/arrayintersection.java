package array;
import java.util.Scanner;
public class arrayintersection {
  //private static Scanner s;
  public static void intersection( int arr[],int arr1[]) 
  {
	  for(int i=0;i<arr.length-1;i++)
	  {    int p=arr[i];
		  for(int j=0;j<arr1.length-1;j++)
		  {
			if(arr1[j]==p)
				System.out.println(arr[j]);
		
		  }
	  }
	  
	  
  }
public static void main(String[] args)
  {
	 // s = new Scanner(System.in);
	  int arr[]= {5,2,3,4,5,6};
	  int arr1[]= {6,3,7};
	  intersection(arr,arr1);
	 // System.out.println("hello");
	  
	  
  }
	
}
