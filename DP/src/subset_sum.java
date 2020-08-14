import java.util.*;
public class subset_sum {
  public static boolean func(int arr[],int n,int currsum,int sum,int p)
  {
	  if(currsum==sum)
	  {
		  return true;
	  }
	  if(p<sum)
	  {
		  return false;
	  }
	  return func(arr,n-1,currsum+arr[n-1],sum,p-arr[n-1])||func(arr,n-1,currsum,sum,p-arr[n-1]);
  }
  public static boolean funcDP(int arr[],int sum)
  {
	  boolean dp[][]=new boolean[arr.length+1][sum+1];
	  for(int i=0;i<arr.length;i++)
	  {
		  dp[i][0]=true;
	  }
	  
	  for(int i=1;i<=arr.length;i++)
	  {
		  for(int j=1;j<=sum;j++)
		  {
			  if(j<arr[i-1])
			  {
				  dp[i][j]=dp[i-1][j];
			  }
			  else {
				  dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
			  }
		  }
	  }
	  return dp[arr.length][sum];
  }
	public static void main(String[] args) {
		
     Scanner s=new Scanner(System.in);
     int t=s.nextInt();
     while(t-->0)
     {
    	 int n=s.nextInt();
    	 int p=0;
    	 int arr[]=new int[n];
    	 for(int i=0;i<n;i++)
    		 {
    		 arr[i]=s.nextInt();
    		 p+=arr[i];
    		 }
    		 
    	 int sum=s.nextInt();
    	 
    	 
    	 boolean ans=funcDP(arr,sum);
    	 System.out.println(ans);
     }
		
		
	}

}
