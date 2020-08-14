import java.util.*;
public class inc_subsequnce {

	public static int max_length(int arr[],int n)
	{
		int dp[]=new int[100];
		for(int i=0;i<=n;i++)
		  dp[i]=1;
		int best=-1;
		for(int i=1;i<n;i++)
		{     for(int j=0;j<i;j++)
		{
			if(arr[j]<=arr[i])
			{
				int len=1+dp[j];
				dp[i]=Math.max(len, dp[i]);
			}
		}
		best=Math.max(best, dp[i]);
		
		}
		return best;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int n=s.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=s.nextInt();
		    System.out.println(max_length(arr,n));
	}
	}

}