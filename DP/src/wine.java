import java.util.*;
public class wine {

	 public static int max_profit(int arr[],int beg,int end,int year)
	 {
		 if(beg>end)
		 {
			 return 0;
		 }
		 int ans1=arr[beg]*year+max_profit(arr,beg+1,end,year+1);
		 int ans2=arr[end]*year+max_profit(arr,beg,end-1,year+1);
		 return Integer.max(ans1, ans2);
	 }
	 static  int memo[][]=new int[100][100];
	 
	 public static int memo_wine(int arr[],int beg,int end,int year)
	 {
		 if(beg>end)
		 {
			 return 0;
		 }
		 if(memo[beg][end]!=-1)
		 {
			 return memo[beg][end];
		 }
		 int ans1=arr[beg]*year+max_profit(arr,beg+1,end,year+1);
		 int ans2=arr[end]*year+max_profit(arr,beg,end-1,year+1);
		int ans= Integer.max(ans1, ans2);
		memo[beg][end]=ans;
		
		 return ans;
	 }
	 public static int max_dp(int arr[],int n)
	 {
		 int dp[][]=new int[100][100];
		 int year=n;
		 for(int i=0;i<n;i++)
		 {
			 dp[i][i]=arr[i]*year;
		 }
		 --year;
		 for(int len=2;len<=n;len++)
		 {
			 int srt=0;
			 int end=n-len;
			 while(srt<=end)
			 {
				 int endwindow=srt+len-1;
				dp[srt][endwindow]=Integer.max(dp[srt][endwindow]*year+dp[srt+1][endwindow],dp[srt][endwindow-1]*year+dp[srt-1][endwindow]);
			++srt;
			
			 }
			 --year;
		 }
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 System.out.print(dp[i][j]+" ");
			 }
			 System.out.println();
		 }
		 return dp[0][n-1];
		 
	 }
	
	public static void main(String[] args) {
		
    Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int arr[]=new int[n];
      for(int i=0;i<n;i++)
    	  arr[i]=s.nextInt();
      for(int i=0;i<100;i++)
      {
    	  for(int j=0;j<100;j++)
    	  {
    		  memo[i][j]=-1;
    	  }
      }
     int x= max_profit(arr,0,n-1,1);
     int y=memo_wine(arr,0,n-1,1);
     int z=max_dp(arr,5);
System.out.print(x+" "+y+" "+z);

	}

}
