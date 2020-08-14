import java.util.*;
public class Knapsack {
  public static int Knapsack(int weight[],int value[],int n,int w)
  {
	  int dp[][]=new int[n+1][w+1];
	  for(int i=0;i<n;i++)
	  {
		  dp[i][0]=0;
	  }
	  for(int j=0;j<=w;j++)
		  dp[0][j]=0;
	  
	  for(int i=1;i<=n;i++)
	  {
		  for(int j=1;j<=w;j++)
		  {
			  
			  if(j>=weight[i-1])
			  {
				  dp[i][j]=Math.max(value[i-1]+dp[i-1][j-weight[i-1]], dp[i-1][j]);
			  }
			  else {
				  dp[i][j]=dp[i-1][j];
			  }
		  }
	  }
	
	  return dp[n][w];
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight[]= {1,3,4,5};
		int value[]= {1,4,5,7};
		int k=7;
		System.out.println(Knapsack(weight,value,4,k));
		

	}

}
