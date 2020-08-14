import java.util.*;
public class maximum_subarray {

	public static int function(int arr[],int n)
	{
		int ans=Integer.MIN_VALUE;
		int max_start=0;
		int max_end=0;
		int s=0;
		int end=0;
		int max_so_far=0;
		int curr_sum=0;
		for(end=0;end<n;end++)
		{
			curr_sum+=arr[end];
			if(arr[end]>0)
			{
				if(curr_sum>max_so_far)
				{
					max_so_far=curr_sum;
					max_start=s;
					max_end=end;
				}
			
			}
			
			else if(arr[end]>=0)
			{
				if(curr_sum==max_so_far&&max_end-max_start<end-s)
				{
					max_start=s;
					max_end=end;
				}
			}
			else {
				curr_sum=0;
				s=s+1;
			}
		}
		 ans=0;
		for(int i=max_start;i<=max_end;i++)
			ans+=arr[i];
		System.out.println(max_start+" "+max_end);
		return ans;
		
	}
	public static void main(String []args)
	{

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)arr[i]=s.nextInt();
		
		int ans=function(arr,n);
		System.out.println(ans);
	}
}
