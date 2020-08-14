import java.util.*;
public class min_cut {

	public static int min_cut(int arr[],int length)
	{
		if(length==0)
		{
			return 0;
		}
		int best=-1;
		for(int i=1;i<=length;++i)
		{
			int ans=arr[i]+min_cut(arr,length-i);
			best=Math.max(best, ans);
			
		}
			return best;	
	}
	
	
	static int memopad[]=new int[100];
	public static int min_2(int arr[],int length)
	{
		if(length==0)
			return 0;
		if(memopad[length]!=-1)
		{
			return memopad[length];
		}
		int best=-1;
	for(int i=1;i<=length;++i)
	{
		int ans=arr[i]+min_2(arr,length-i);
		best=Math.max(best, ans);
		
	}
	memopad[length]=best;
	return memopad[length];
	}
	
	public static int dp(int arr[],int length)
	{
		int dp[]=new int[100];
		
		for(int len=1;len<=length;++len)
		{   int best=0;
			for(int cut=1;cut<=len;++cut)
			{
			   best=Math.max(best,arr[cut]+dp[len-cut] );	
			}
			dp[length]=best;
			
		}
		
		return dp[length];
	}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n+1];
		for(int i=1;i<=n;i++)
			arr[i]=s.nextInt();
		for(int i=0;i<=n+1;i++)
		{
			memopad[i]=-1;
		}
	  int ans=	min_cut(arr,n);
	  int ans2=min_2(arr,n);
	     int ans3 =    dp(arr,n);
		System.out.println(ans+" "+ans2+" "+ans3);
	}

}
