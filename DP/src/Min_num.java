import java.util.*;
public class Min_num {

	
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		for(int i=0;i<1000;i++)
		{
			memopad[i]=-1;
		}
	  int x=	min_no(n);
	  System.out.println(x);
	  
	}

	static int memopad[]=new int[1000];
	private static int fibonaaci(int n) {
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		if(memopad[n]!=-1)
		{
			return memopad[n];
		}
		int ans=fibonaaci(n-1)+fibonaaci(n-2);
		memopad[n]=ans;
		return memopad[n];
	}
	
	private static int fib_DP(int n)
	{
		int dp[]=new int[10000];
		dp[0]=0;dp[1]=1;
    	for(int i=2;i<=n;i++)
	   {
		   dp[i]=dp[i-1]+dp[i-2];
	      }
     return dp[n];
		
	}
	static int q1=Integer.MAX_VALUE;
 static 	int q2=Integer.MAX_VALUE;
	static int q3=Integer.MAX_VALUE;
	
	public static int min_no(int n)
	{
		if(n==1)return 0;
		
		if(memopad[n]!=-1)
		{
			return memopad[n];
		}
		if(n%3==0)q1=1+min_no(n/3);
		else if(n%2==0)q1=1+min_no(n/2);
		else q3=1+min_no(n-1);
		int ans=Math.min(Math.min(q1, q2), q3);
		memopad[n]=ans;
		return memopad[n];
		
	}
	public static void min_dp(int n)
	{
		
	}
}
