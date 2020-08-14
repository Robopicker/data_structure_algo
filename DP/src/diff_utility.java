import java.util.*;
public class diff_utility {

	public static String diff_utility(String str1,String str2,int s1,int s2,int dp[][])
	{
		if(s1==0||s2==0)return "";
		if(str1.charAt(s1-1)==str2.charAt(s2-1))
		{
	return   diff_utility(str1,str2,s1-1,s2,dp)+" "+str1.charAt(s1-1);
	
		}
		else if(dp[s1-1][s2]>dp[s1][s2-1])
		{
			return  diff_utility(str1,str2,s1-1,s2,dp)+" +"+str1.charAt(s1-1);
			
		}
		else {
			return  diff_utility(str1,str2,s1,s2-1,dp)+" -"+str2.charAt(s2-1);
			
		}
	}
	public static void LCSLength(String X, String Y, int m, int n, int[][] lookup)
	{
		// first column of the lookup table will be all 0
		for (int i = 0; i <= m; i++) {
			lookup[i][0] = 0;
		}

		// first row of the lookup table will be all 0
		for (int j = 0; j <= n; j++) {
			lookup[0][j] = 0;
		}

		// fill the lookup table in bottom-up manner
		for (int i = 1; i <= m; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				// if current character of X and Y matches
				if (X.charAt(i - 1) == Y.charAt(j - 1)) {
					lookup[i][j] = lookup[i - 1][j - 1] + 1;
				}
					// else if current character of X and Y don't match
				else {
					lookup[i][j] = Integer.max(lookup[i - 1][j], lookup[i][j - 1]);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		int dp[][]=new int[str1.length()+1][str2.length()+1];
		LCSLength(str1,str2,str1.length(),str2.length(),dp);
	String ans=	diff_utility(str1,str2,str1.length(),str2.length(),dp);	
	System.out.println(ans);
		
	}

}
