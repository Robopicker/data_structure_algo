import java.util.*;
public class longest_prefix {
	
	
	public static int function(String str,int n)
	{
		
		int lps[]=new int[n];
		lps[0]=0;
		int j=0;
		int i=1;
		while(i<n)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				j++;
				lps[i]=j;
				i++;
			}
			else {
				if(j!=0)
				{
					j=lps[j-1];
				}
				else {
					lps[i]=0;
					i++;
				}
			}
		}
		int ans=0;
		for( i=0;i<n;i++)
		{
			if(lps[i]>ans)
			{
				ans=lps[i];
			}
		}
		return ans;
	}
	public static void main(String []args)
	{
	Scanner s=new Scanner(System.in);
	String str=s.next();
	
	int find=function(str,str.length());
	System.out.println(find);
	}

}
