
public class Regx {

	public static void main(String[] args) {
		String st="xaabyc";
		String pt="xa*b.c";
		char str[]=st.toCharArray();
		char pattern[]=pt.toCharArray();
		boolean ans=funcDP(str,pattern);
		System.out.println(ans);

	}
	public static boolean funcDP(char str[],char [] pattern)
	{
		boolean dp[][]=new boolean[str.length+1][pattern.length+1];
		dp[0][0]=true;
		for(int i=1;i<=pattern.length;i++)
		{
			if(pattern[i-1]=='*')
			{
				dp[0][i]=dp[0][i-2];
			}
		}
		
		for(int i=1;i<=str.length;i++)
		{
			for(int j=1;j<=pattern.length;j++)
			{
				if(str[i-1]==pattern[j-1]||pattern[j-1]=='.')
				{
					dp[i][j]=dp[i-1][j-1];
				}
				else if( pattern[j-1]=='*')
				{
					dp[i][j]=dp[i][j-2];
					
					if(pattern[j-2] == '.' ||str[i-1]==pattern[j-2])
					{
						dp[i][j]=dp[i-1][j];
					}
				}
				else {
					dp[i][j]=false;
				}
				
				
			}
		}
		return dp[str.length][pattern.length];
		
	}

}
