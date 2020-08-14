package array;
import java.util.Scanner;
public class swapalternate {
	public static void p(int a,int b)
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args)
	{   int a=12;
	    p(a,7);
	    boolean  p[]=new boolean[15];
	    System.out.println(p[0]);
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int temp=0;
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<N-1;i=i+2)
		{
			 temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for(int i=0;i<N;i++)
		{ System.out.print(arr[i]+" ");
			
		}
	}

}
