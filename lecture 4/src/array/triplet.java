package array;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class triplet {

	private static Scanner s;

	public static void Main(int arr[],int item) {
	
		for(int i=0;i<arr.length-2;i++)
	{
			for(int j=i+1;j<arr.length-1;j++)
		{
				for(int k=j+1;k<arr.length;k++)
			{
				if(arr[i]+arr[j]+arr[k]==item)
				{
					   if(arr[i]<arr[j]&&arr[j]<arr[System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
					   else if(arr[j]<arr[i]&&arr[i]<arr[k]) System.out.println(arr[j]+" "+arr[i]+" "+arr[k]);
					   else System.out.println(arr[k]+" "+arr[j]+" "+arr[i]);
				}
				
					
			}
		}
	}
	
	}
public static void main(String[] args)
{
	int arr[]= {1,2,3,4,5,6,7};
	int item =12;
	Main(arr,item);
}
}
