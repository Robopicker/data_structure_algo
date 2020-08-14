
import java.util.*;
public class Longest_bitonic {

	public static void print(int arr[])
	{
		int n=arr.length;
		Vector<Integer> dp[]=new Vector[arr.length];
		Vector<Integer> dp1[]=new Vector[arr.length];
		for(int i=0;i<n;i++)
			dp[i]=new Vector<Integer>();
		
		for(int i=0;i<n;i++)
			dp1[i]=new Vector<Integer>();
		
		dp[0].add(arr[0]);
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j]&&dp[i].size()<dp[j].size()+1)
				{
					dp[i]=dp[j];
				}
			}
			dp[i].add(arr[i]);
		}
		dp1[n-1].add(arr[n-1]);
		for(int i=n-2;i>=0;i--)
		{
			for(int j=n-1;j>i;j--)
			{
				if(arr[i]>arr[j]&&dp1[i].size()<dp[j].size()+1)
				{
					dp[i]=dp[j];
				}
			}
			dp1[i].add(arr[i]);
		}
		int max=dp[0].size()+dp1[0].size()-1;
		Vector<Integer> vr1=new Vector<>();;
		Vector<Integer> v2=new Vector<>();;
		for(int i=1;i<n;i++)
		{
			if(dp[i].size()+dp1[i].size()-1>max)
			{
				max=dp[i].size()+dp1[i].size()-1;
			     vr1=dp[i];
			     v2=dp1[i];
			}
			
		}
		for(int i=0;i<vr1.size();i++)
		{
			System.out.print(vr1.get(i)+" ");
		}
		for(int i=0;i<v2.size();i++)
		{
			System.out.print(v2.get(i)+" ");
		}
		
		
	}
	public static int function(int arr,int n)
	{
		int leg=Integer.MIN_VALUE;
		for(int i=1;i<)
	}
	public static void main(String[] args) {
		
		int []arr= {1,11,2,10,4,5,2,1};
		print(arr);

	}

}
