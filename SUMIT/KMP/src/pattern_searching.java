import java.util.*;
public class pattern_searching {

	public static void computelps(int lps[],String patt)
	{
		lps[0]=0;
		int i=1;
		int j=0;
		while(i<patt.length())
		{
			if(patt.charAt(i)==patt.charAt(j))
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
	}
	public static int find(String str,String patt,int n,int m)
	{
		
		int lps[]=new int[m];
		computelps(lps,patt);
		int i=0;
		int j=0;
		while(i<n)
		{
			if(str.charAt(i)==patt.charAt(j))
			{
				i++;
				j++;
			}
			if(j==m-1)
			{
				return i-j;
			}
			
			else if(i<n&&patt.charAt(j)!=str.charAt(i))
				{
					if(j!=0)
					{
						j=lps[j-1];
					}
					else {
						i++;
					}
				}
			
		}
		return -1;
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String str=s.next();
	String patt=s.next();
	int n=str.length();
	int m=patt.length();
	int pos=find(str,patt,n,m);
	System.out.println(pos);
		

	}

}
