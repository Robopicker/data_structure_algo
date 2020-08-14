import java.util.*;
public class Experiment {
static int dp[][];
	public static void main(String[] args)
	{
		int[][] mat =
		{
			{ 1, 1, -1, 1, 1 },
			{ 1, 0, 0, -1, 1 },
			{ 1, 1, 1, 1, -1 },
			{ 1, 1, 1, 1, -1 },
			{ 1, 1, 1, 1, -1 },
			{ 1, 1, 1, 1, -1 },
			{ 1, 1, 1, 1, -1 },
			{ 1, 1, 1, 1, -1 },
			{ -1, -1, 1, 1, 1 },
			{ 1, 1, -1, -1, 1 }
		};
		dp=new int[mat.length][mat[0].length];
       for(int i=0;i<dp.length;i++)
       {
    	   Arrays.fill(dp[i],-1);
       }
		System.out.println("Maximum value collected is "
				+ findMaximum(mat, 0, 0));
	}

	private static boolean  valid(int [][] mat,int x,int y)
	{
		return x>=0&&x<mat.length&&y>=0&&y<mat[0].length&&(mat[x][y]!=-1);
	}
	private static int  findMaximum(int[][] mat, int i, int j) {
		if(!valid(mat,i,j))
		{
			return 0;
		}
		if(dp[i][j]!=-1)return dp[i][j];

		 int ans=-1;
		if(i%2==1)
		{
			ans= mat[i][j]+Math.max(findMaximum(mat,i,j-1), findMaximum(mat,i+1,j));
		}
		else ans= mat[i][j]+Math.max(findMaximum(mat,i,j+1), findMaximum(mat,i+1,j));
		dp[i][j]=ans;
		return dp[i][j];

	}

}
