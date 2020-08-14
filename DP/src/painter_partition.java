import java.util.*;

public class painter_partition {
public static int recursion(int arr[],int n,int k)
{

	ArrayList<Integer> arr1=new ArrayList<>();
	ArrayList<Integer> arr2=new ArrayList<>();
	return helper(arr,arr1,n-1,k);
	
}

public static int helper(int arr[],ArrayList<Integer> arr1,int pos,int k)
{
	if(k==0)
	{
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=pos;i++)
		{
			sum1+=arr[i];
		}
		for(int i=0;i<arr1.size();i++)
		{
			sum2+=arr1.get(i);
		}
		return Math.max(sum1, sum2);
	}
	
	else {
		arr1.add(0,arr[pos]);
		int ans1=helper(arr,arr1,pos-1,k-1);
		arr1.remove(0);
		int ans2=helper(arr,arr1,pos,k-1);
		return Math.min(ans1, ans2);
	}
}
public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=s.nextInt();
			int k=s.nextInt();
			int ans=recursion(arr,n,k);
			System.out.println(ans);
		}
      
	}

}
