import java.util.*;
public class part3_partition {

	public static boolean recursive(int arr[],int n)
	{
		if(n<3)return false;
		int sum=0;
		for(int i=0;i<n;i++)sum+=arr[i];
		if(sum%3!=0)return false;
		else {
			HashMap<String,Boolean > map=new HashMap<>();
			return recursive1(arr,0,n,sum/3,sum/3,sum/3,map);
		}
	}
	public static boolean recursive1(int arr[],int pos,int n,int s1,int s2,int s3,HashMap<String,Boolean> map)
	{
		if(s1==0&&s2==0&&s3==0)
		{
			return true;
		}
		if(pos==n&&(s1!=0||s2!=0||s3!=0))
		{
			return false;
		}
		String key=s1+" |"+s2+" |"+s3;
		if(map.containsKey(key))
		{
			return map.get(key);
		}
		else {
		boolean a=false;
		boolean b=false;
		boolean c=false;
		a=recursive1(arr,pos+1,n,s1-arr[pos],s2,s3,map);
		b=recursive1(arr,pos+1,n,s1,s2-arr[pos],s3,map);
		c=recursive1(arr,pos+1,n,s1,s2,s3-arr[pos],map);
		  map.put(key, a||b||c);
		}
		return map.get(key);
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)arr[i]=s.nextInt();
      boolean ans=recursive(arr,n);
      System.out.println(ans);
		
	}

}
