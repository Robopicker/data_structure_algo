import java.util.*;
public class shotest_common_supersequence {
 public static int function(String str1,String str2,int s1,int s2)
 {
	 if(s1==0||s2==0)return s1+s2;
	 if(str1.charAt(s1-1)==str2.charAt(s2-1))
	 {
		 return 1+function(str1,str2,s1-1,s2-1);
	 }
	 else return Math.min(function(str1, str2,s1-1,s2),function(str1,str2,s1,s2-1))+1;
 }
	public static void main(String []args)
	{

		Scanner s=new Scanner(System.in);
		String str1=s.next();
		
		String str2=s.next();
		int ans=function(str1,str2,str1.length(),str2.length());
		System.out.println(ans);
	}
}
