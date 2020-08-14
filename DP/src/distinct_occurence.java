import java.util.*;
public class distinct_occurence {
public static int recursive(String str1,String str2,int n,int m)
{
	if(n==0&&m==0||m==0)
	{
		return 1;
	}
	if(n==0)
	{
		return 0;
	}
	if(str1.charAt(n-1)==str2.charAt(m-1))
	{
		return recursive(str1,str2,n-1,m-1)+recursive(str1,str2,n-1,m);
	}
	else {
		return recursive(str1,str2,n-1,m);
	}
}
public static int memo(String str1,String str2,int n,int m,HashMap<String ,Integer> map)
{
	if(n==0&&m==0||m==0)
	{
		return 1;
	}
	if(n==0)
	{
		return 0;
	}
	String key=n+" |"+m;
	if(map.containsKey(key))
	{
		return map.get(key);
	}
	else {
		if(str1.charAt(n-1)==str2.charAt(m-1))
		{
			int temp=memo(str1,str2,n-1,m,map)+memo(str1,str2,n-1,m-1,map);
			map.put(key,temp);
		}
		else {
			int ans=memo(str1,str2,n-1,m,map);
			map.put(key,ans);
		}
	}
	return map.get(key);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			String str1=s.next();
			String str2=s.next();
			int n=str1.length();
			int m=str2.length();
			int ans=recursive(str1,str2,n,m);
			int ans1=memo(str1,str2,n,m,new HashMap<>());
			System.out.println(ans+" "+ans1);
		}
	}

}
