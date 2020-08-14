
import java.util.*;
public class matrix_chain {
	
	public static int recursivememo(int arr[],int i,int r)
	{
		int dp[][]=new int[arr.length][arr.length];
		return memo(arr,i,r,dp);
	}
	public static int memo(int arr[],int i,int r,int dp[][])
	{
		if(i==r)
		{
			dp[i][r]=0;
			return dp[i][r];
		}
		if(dp[i][r]!=0)
		{
			return dp[i][r];
		}
		int ans=Integer.MAX_VALUE;
		for(int k=i;k<r;k++)
		{
			int count=	recursive(arr,i,k)+recursive(arr,k+1,r)+arr[i-1]*arr[k]*arr[r];	
					if(count<ans)
					{
						ans=count;
					}
		
		}
		dp[i][r]=ans;
		return dp[i][r];
	}
	public static int recursive(int arr[],int i,int r)
	{
		if(i==r)
		{
			return 0;
		}
		int ans=Integer.MAX_VALUE;
		for(int k=i;k<r;k++)
		{
			int count=	recursive(arr,i,k)+recursive(arr,k+1,r)+arr[i-1]*arr[k]*arr[r];	
					if(count<ans)
					{
						ans=count;
					}
		
		}
		return ans;
	}

	public static int dp(int arr[],int l,int r)
	{
		int n=arr.length;
		int dp[][]=new int[n][n];
		for(int gap=1;gap<=n;gap++)
		{
			for(int i=1;i<n-gap+1;i++)
			{
				int j=i+gap-1;
				if(i==j)
				{
					dp[i][j]=0;
				}
				else {
					
					int ans=Integer.MAX_VALUE;
					for(int k=i;k<j;k++)
					{
						int count=dp[i][k-1]+dp[k+1][j]+arr[i-1]*arr[k]*arr[j];
						if(count<ans)ans=count;
					}
					dp[i][j]=ans;
				}
			}
		}
		return dp[1][n-1];
	}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
			}
			
			int ans=recursive(arr,1,n-1);
			int ans1=recursivememo(arr,1,n-1);
			int ans3=dp(arr,1,n-1);
			System.out.println(ans);
			System.out.println(ans1);
			System.out.println(ans3);
		}

	}

}
