package cvdfv;
import java.util.Scanner;

public class cc {
	
	private static Scanner s;

	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		
		int n=s.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		if(arr[1]<arr[0])
		{
			int index=arr.length;
			int count=0;
			for(int k=1;k<arr.length-1;k++)
			{
				if(arr[k+1]>arr[k])
				{
					index=k+1;
					break;
				}
			}
			for(int j=index;j<arr.length-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					System.out.println("false");
					count=1;
					break;
				}
			}
			if(count==0)
			{
				System.out.println("true");
			}
		}
		
		else
		{
			int index=arr.length;
			int count=0;
			for(int k=1;k<arr.length-1;k++)
			{
				if(arr[k+1]<arr[k])
				{
					index=k+1;
					break;
				}
			}
			for(int j=index;j<arr.length-1;j++)
			{
				if(arr[j+1]>arr[j])
				{
					System.out.println("false");
					count=1;
					break;
				}
			}
			if(count==0)
			{
				System.out.println("true");
			}
		}
	}
}
