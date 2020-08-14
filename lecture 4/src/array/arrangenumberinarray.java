package array;
import java.util.Scanner;
public class arrangenumberinarray {

	private static Scanner s;
  public static int[] array(int n)
 { int count=0,l=0;
	int arr[]= new int[n];
	while(l<n) {
		for(int i=0;i<arr.length;i++)
	      {
		int p=i+1;
		if(p%2!=0&&p<n) {count++;
		//System.out.print(p+" ");
		arr[i]=p;
		    }
		if(p==n) {
		 arr[i]=p;
		  count++;
		 }
		}
		for(int z=count;z<arr.length;z++)
		{    if(n%2!=0) n=n-1;
		     else n=n-2;
			  arr[z]=n; //System.out.print(n+" ");
		 }
		l=l+1;
		
	   }
	
return arr;	  
    }
	public static void main(String[] args) {
		s = new Scanner(System.in);
		int n=s.nextInt();
		array(n);
		
	}

}
