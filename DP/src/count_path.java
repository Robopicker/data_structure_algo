import java.util.*;

public class count_path {
	
	public static int countPaths(int mat[][], int m, int n, int cost)
	{
		// base case
		if (cost < 0) {
			return 0;
		}

		// if we're at first cell (0, 0)
		if (m == 0 && n == 0) {
			return (mat[0][0] - cost == 0) ? 1: 0;
		}

		// if we're at first row, we can only go left
		if (m == 0) {
			return countPaths(mat, 0, n - 1, cost - mat[m][n]);
		}

		// if we're at first column, we can only go up
		if (n == 0) {
			return countPaths(mat, m - 1, 0, cost - mat[m][n]);
		}

		// recur to count total paths by going both left and top
		return countPaths(mat, m - 1, n, cost - mat[m][n]) +
				countPaths(mat, m, n - 1, cost - mat[m][n]);
	}

	public static int recursive(int arr[][],int n,int m,int cost)
	{
		if(cost<0)return 0;
		if(n==0&&m==0)
		{
			return  arr[0][0]-cost ==0 ? 1:0; 
		}
		if(n==0)
		{
			return recursive(arr,0,m-1,cost-arr[n][m]);
		}
		if(m==0)
		{
			return recursive(arr,n-1,0,cost-arr[n][m]);
		}
	
		return recursive(arr,n-1,m,cost-arr[n][m])+recursive(arr,n,m-1,cost-arr[n][m]);
		
	}
	public static int memo(int arr[][],int n,int m,int cost,HashMap<String ,Integer> map)
	{
		if(cost<0)
		{
			return 0;
		}
		if(n==0&&m==0)
		{
			return arr[n][m]-cost==0 ? 1:0;
			
		}
		String key=n+" |"+ m+" |"+cost;
		if(!map.containsKey(key))
		{
			if(n==0)
			{
				map.put(key, memo(arr,0,m-1,cost-arr[n][m],map));
			}
			if(m==0)
			{
				map.put(key, memo(arr,0,m-1,cost-arr[n][m],map));
			}
			else {
				map.put(key, memo(arr,0,m-1,cost-arr[n][m],map)+memo(arr,0,m-1,cost-arr[n][m],map));
			}
		}
		
		return map.get(key);
	}
	public static void main(String[] args) {

 Scanner s=new Scanner(System.in);
  int t=s.nextInt();
   while(t-->0)
   {
	   int n=s.nextInt();
	   int m=s.nextInt();
	   int arr[][]=new int[n][m];
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<m;j++)
		   {
			   arr[i][j]=s.nextInt();
		   }
	   }
	   int cost=s.nextInt();
	   int count=countPaths(arr,n-1,m-1,cost);
	   int count1=memo(arr,n-1,m-1,cost,new HashMap<String,Integer>());
	   System.out.println(count);
	   System.out.println(count1);
   }

	}

}
