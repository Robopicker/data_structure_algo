import java.util.*;
public class buyy_sellstock {
	public static int recursive(int arr[],int n,int k)
	{
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
	int temp= helper(arr,0,k);
	ans=Math.max(ans, temp);
		}
	}

	public static int helper(int arr[],int pos,int k)
	{
		if(pos==arr.length)return 0;
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<pos;i++)
		{
			
		}
		
		
	}
	public static void main(String[] args) {
		
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        	arr[i]=s.nextInt();
         
         int k=s.nextInt();
         int ans=recursive(arr,n,k);
        System.out.print(ans);
	
	}

}
