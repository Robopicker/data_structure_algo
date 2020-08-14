import java.util.*;
public class max_sumsubmatrix {

	public static int solution(int arr[][],int n,int k)
	{
		int sum[][]=new int[n][n];
		sum[0][0]=arr[0][0];
		for(int i=1;i<n;i++)
		{
			sum[0][i]=arr[0][i]+sum[0][i-1];
		}
		
		for(int i=1;i<n;i++)
		{
			sum[0][i]=arr[0][i]+sum[0][i-1];
		}
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				sum[i][j]=sum[i][j-1]+sum[i-1][j]+arr[i][j]-sum[i-1][j-1];
			}
		}
		int ans=Integer.MIN_VALUE;
		for(int i=k-1;i<n;i++)
		{
			for(int j=k-1;j<n;j++)
			{
				int total=sum[i][j];
						if(i-k>=0)
						{
							total-=sum[i-k][j];
							
						}
						if(j-k>=0)
						{
							total-=sum[i][j-k];
						}
						if(i-k>=0&&j-k>=0)
							total+=sum[i-k][j-k];
					
			   ans=Math.max(ans,total);	
			}
		}
		return ans;
	}
	public static void main(String[] args) {

      Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[][]=new int[n][n];
		int k=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		int ans=solution(arr,n,k);
		System.out.println(ans);
		
	}

}
