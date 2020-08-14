
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Egg_puzzle {
    public static int egg_puzzle(int n,int floor)
    {
        if(floor==1||floor==0)
        {
            return floor;
        }
        if(n==1)
        {
            return floor;
        }
        
        int res=Integer.MAX_VALUE;
        
        for(int x=1;x<=floor;x++)
        {
            int temp=Math.max(egg_puzzle(n-1,x-1),egg_puzzle(n,floor-x))+1;
            if(temp<res)
            {
                res=temp;
            }
        }
        return res+1;
    }
    public static int egg_puzzleMemo(int n,int floor)
    {
        int memo[][]=new int[n+1][floor+1];
         return egg_puzzleHelper(n,floor,memo);
    }
    public static int egg_puzzleHelper(int n,int floor,int memo[][])
    {   
        if(n==1)
        {
            memo[n][floor]=floor;
            return memo[n][floor];
        }
        if(floor==1||floor==0)
        {
            memo[n][floor]=floor;
            return memo[n][floor];
        }
        if(memo[n][floor]!=0)
        {
            return memo[n][floor];
        }
        int min=Integer.MAX_VALUE;
        for(int x=1;x<=floor;x++)
        {
            int temp=Math.max(egg_puzzleHelper(n-1,x-1,memo),egg_puzzleHelper(n,floor-x,memo));
            if(temp<min)
            {
                min=temp;
            }
        }
        memo[n][floor]=min+1;
        return memo[n][floor];
    }
    public static int egg_puzzleDP(int n,int floor)
    {
        int dp[][]=new int[n+1][floor+1];
         for (int i = 1; i <=n; i++) 
        { 
            dp[i][1] = 1; 
            dp[i][0] = 0; 
        } 
        for(int j=0;j<=floor;j++)
        {
            dp[1][j]=j;
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<=floor;j++)
            {
                dp[i][j]=Integer.MAX_VALUE;
                for(int k=1;k<=j;k++)
                {
                int temp=Math.max(dp[i-1][k-1],dp[i][j-k])+1;
                if(temp<dp[i][j])
                {
                    dp[i][j]=temp;
                }
                }
            }
        }
        return dp[n][floor];
    }
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int n=s.nextInt();
		    int k=s.nextInt();
		    System.out.println(egg_puzzleDP(n,k));
		}
	}
}