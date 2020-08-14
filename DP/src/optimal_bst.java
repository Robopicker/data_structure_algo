import java.util.*;
public class optimal_bst {

	public static int recursive(int arr[],int l,int r,int level)
	{
		if(l>r)return 0;
		int ans=Integer.MAX_VALUE;
		for(int k=l;k<=r;k++)
		{
			int leftoptimal=recursive(arr,l,k-1,level+1);
			int rightoptimal=recursive(arr,k+1,r,level+1);
			int a=arr[k]*level+leftoptimal+rightoptimal;
			ans=Math.min(a,ans);
			
		}
		return ans;
	}
	public static int memosol(int arr[],int l,int r)
	{
		int n=arr.length;
		int dp[][]=new int[n][n];
		
		return helper(arr,l,r,1,dp); 
	}
	public static int helper(int arr[],int l,int r ,int level ,int dp[][])
	{
		if(l>r)return 0;
		if(dp[l][r]!=0)
		{
			return dp[l][r];
			
		}
		else {
			int ans=Integer.MAX_VALUE;
			for(int k=l;k<=r;k++)
			{
				int leftoptimal=helper(arr,l,k-1,level+1,dp);
				int rightoptimal=helper(arr,k+1,r,level+1,dp);
				int a=arr[k]*level+leftoptimal+rightoptimal;
				ans=Math.min(a,ans);
				
			}
		
		dp[l][r]=ans;
		return dp[l][r];
		}
	}
	public static int memo1(int arr[],int l,int r,int level,HashMap<String,Integer> map)
	{
		if(l>r)return 0;
		
		String key=l+" |"+r+" |"+level;
		
		if(map.containsKey(key))
		{
			return map.get(key);
		}
		else {
		int ans=Integer.MAX_VALUE;
		for(int k=l;k<=r;k++)
		{
			int left=memo1(arr,l,k-1,level+1,map);
			int right=memo1(arr,k+1,r,level+1,map);
			int data=arr[k]*level+left+right;
			ans=Math.min(ans, data);
		}
		map.put(key, ans);
		}
		return map.get(key);
	}
	public static int dp(int arr[],int n)
	{
		int dp[][]=new int[n][n];
		for(int gap=1;gap<=n;gap++)
		{
			for(int i=0;i<n-gap+1;i++)
			{
				int j=i+gap-1;
				
				if(i==j)
				{
				 	dp[i][j]=arr[i];
				}
				else {
					int weight=0;
					for(int k=i;k<=j;k++)
					{
						weight+=arr[i];
					}
					dp[i][j]=Integer.MAX_VALUE;
					for(int k=i;k<=j;k++)
					{
						int left=0;
					
						if(k>i)
						{
					 left=dp[i][k-1];
						}
						
						int right=0;
								if(k<j)
								{
								right=dp[k+1][j];
								}
						int ans=left+right+weight;
						if(ans<dp[i][j])dp[i][j]=ans;
					}
				}
			}
		}
	  return dp[0][n-1];	
	}
	
	public static void main(String[] args) {


		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=s.nextInt();
		  int ans=recursive(arr,0,n-1,1);
		  int ans1=memo1(arr,0,n-1,1,new HashMap<>());
		  int ans2=dp(arr,n);
		  System.out.println(ans+" "+ans1+" "+ans2);
		}

	}

}
