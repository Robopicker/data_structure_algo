import java.util.*;
public class MINCOST_PATH {
 
	public static int min_path(int arr[][],int x,int y,int n)
	{   
		
		if(x==n-1&&y==n-1)
		{
			return arr[x][y];
		}
		if(x>=n||y>=n)return Integer.MAX_VALUE;
		int a=min_path(arr,x+1,y,n);
		int b=min_path(arr,x+1,y+1,n);
		int c=min_path(arr,x,y+1,n);
		return Math.min(a, Math.min(b, c))+arr[x][y];
		
	}
	public static int min_pathmemo(int arr[][],int n)
	{
		int memopad[][]=new int[n][n];
		return min_pathM(arr,0,0,memopad,n);
		
	}
	public static int min_pathM(int arr[][],int x,int y,int memo[][],int n )
	{
		if(x==n-1&&y==n-1)
		{
			memo[x][y]=arr[x][y];
			return memo[x][y];
		}
		if(x>=n||y>=n)
		{
			return Integer.MAX_VALUE;
		}
		if(memo[x][y]!=0)
		{
			return memo[x][y];
		}
		int a=min_pathM(arr,x+1,y,memo,n);
		int b=min_pathM(arr,x+1,y+1,memo,n);
		int c=min_pathM(arr,x,y+1,memo,n);
		memo[x][y]=Math.min(a, Math.min(b, c))+arr[x][y];
		return memo[x][y];
	}
	
	public static int min_costDP(int arr[][],int x,int y,int n)
	{
	  int dp[][]=new int[arr[0].length][arr[0].length];
	  dp[0][0]=arr[0][0];
		int i1=0;
	   while(i1<1)
	   {
		   for(int j=1;j<n;j++)
		   {
			 //  arr[0][j]+=arr[0][j-1];
			   dp[0][j]=arr[0][j]+arr[0][j-1];
		   }
		   for(int j=1;j<n;j++)
		   {
			  // arr[j][0]+=arr[j-1][0];
			   dp[j][0]=arr[j-1][0]+arr[j][0];
		   }
		   i1++;
	   }
	 
	   for(int i=1;i<n;i++)
	   {
		   for(int j=1;j<n;j++)
		   {
			 
			   
				   dp[i][j]=Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]))+arr[i][j];
			   
			   
		   }
		   
			   
	   }
	   return dp[n-1][n-1];
	   
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[][]= {{1,1,1},
        		       {5,6,2},
        		       {9,10,9}
        		   
                     };
        int ans= min_path(arr,0,0,arr[0].length);
        int ans1=min_pathmemo(arr,arr[0].length);
        int ans2=min_costDP(arr,0,0,arr[0].length);
        System.out.println(ans+" "+ans1+" "+ans2);
	}

}
