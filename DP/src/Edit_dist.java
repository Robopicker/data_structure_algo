
import java.util.*;
public class Edit_dist {

	public static int edit_distance(String  s1,String s2)
	{
		if(s1.length()==0)
		{
			return s2.length();
		}
		if(s2.length()==0)
		{
			return s1.length();
		}
		if(s1.charAt(0)==s2.charAt(0))
		{
			return edit_distance(s1.substring(1),s2.substring(1));
		}
		else {
			int op1=edit_distance(s1.substring(1),s2);
			int op2=edit_distance(s1,s2.substring(1));
			int op3=edit_distance(s1.substring(1),s2.substring(1));
			return 1+Math.min(op1, Math.min(op2, op3));
		}
		
	}
	public static int edit_distM(String s1,String s2)
	{
		int memo[][]=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<=s1.length();i++)
		{
			for(int j=0;j<=s2.length();j++)
			{
				memo[i][j]=-1;
			}
		}
		return helper(s1,s2,memo);
		
	}
	public static int helper(String s1,String s2,int memo[][])
	{
		int n=s1.length();
		int m=s2.length();
		if(n==0)
		{
			memo[n][m]=m;
			return memo[n][m];
		}
		if(m==0)
		{
			memo[n][m]=n;
			return memo[n][m];
		}
		if(memo[n][m]!=-1)
		{
			return memo[n][m];
		}
		if(s1.charAt(0)==s2.charAt(0))
		{
			memo[n][m]=helper(s1.substring(1),s2.substring(1),memo);
			return memo[n][m];
		}
		else {
			
			int op1=helper(s1.substring(1),s2,memo);
			int op2=helper(s1,s2.substring(1),memo);
			int op3=helper(s1.substring(1),s2.substring(1),memo);
			memo[n][m]=Math.min(op1, Math.min(op2, op3))+1;
			return memo[n][m];
		}
	}
	public static int edit_distDP(String s1,String s2)
	{    int n=s1.length();
	int m=s2.length();
		int dp[][]=new int[s1.length()+1][s2.length()+1];
		for(int j=0;j<=s2.length();j++)
		{
			dp[0][j]=j;
		}
		for(int i=0;i<=s1.length();i++)
		{
			dp[i][0]=i;
		}
		for(int i=1;i<=s1.length();i++)
		{
			for(int j=1;j<=s2.length();j++)
			{
				if(s1.charAt(n-i)==s2.charAt(m-j))
				{
				     dp[i][j]=dp[i-1][j-1];	
				}
				else {
					int op1=dp[i-1][j-1];
					int op2=dp[i-1][j];
					int op3=dp[i][j-1];
					dp[i][j]=Math.min(op1, Math.min(op2, op3))+1;
					
				}
			}
		}
		return dp[n][m];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="absdvdafva";
		String s2="asdwaefa";
		System.out.println(edit_distance(s1,s2));
		System.out.println(edit_distM(s1,s2));
		System.out.println(edit_distDP(s1,s2));
	}

}
