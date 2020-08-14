import java.util.*;
public class count_palindromic_subsequence {

	public static int memo(String str1,int l,int n,HashMap<String,Integer> map)
	{
		if(l>n)return 0;
		if(l==n)return 1;
		String key=l+"|"+str1.length();
		if(map.containsKey(key))
		{
			return map.get(key);
		}
		else {
			
			if(str1.charAt(l)==str1.charAt(n))
			{
				int ans=memo(str1,l+1,n,map)+memo(str1,l,n-1,map)+2;
				map.put(key, ans);
			}
			else {
				int ans=memo(str1,l+1,n,map)+memo(str1,l,n-1,map)-memo(str1,l+1,n-1,map);	
				map.put(key, ans);
			}
		}
		return map.get(key);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="aab";
		
		int ans=memo(str1,0,str1.length()-1,new HashMap<String,Integer> ());
		System.out.println(ans);
	}
}
