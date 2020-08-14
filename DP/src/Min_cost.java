
import java.util.*;

class Node
{
	int x;int y;
	int data;
	public Node(int x,int y,int data)
	{
		this.x=x;
		this.y=y;
		this.data=data;
	}
}
public class Min_cost {
	
	static int xmove[]= {0,1};
	static int ymove[]= {1,0};
	public static boolean check(int x,int y,int n,int m)
	{
		return x<n&&y<m;
	}
	public static int  minbfs(int arr[][],int n)
	{
		Queue<Node> queue=new LinkedList<>();
		queue.add(new Node(0,0,arr[0][0]));
		int ans=Integer.MAX_VALUE;
		while(!queue.isEmpty())
		{
			Node temp=queue.poll();
			if(temp.x==n-1&&temp.y==n-1)
			{
				ans=Math.min(ans, temp.data);
			}
			for(int i=0;i<2;i++)
			{
				int x1=temp.x+xmove[i];
				int y1=temp.y+ymove[i];
				if(check(x1,y1,n,n))
				{
					queue.add(new Node(x1,y1,temp.data+arr[x1][y1]));
				}
			}
			
		
		}
	return ans;	
	}

	public static int min_cost(int grid[][],int m,int n)
	{
		int dp[][]=new int[100][100];
		
		dp[0][0]=grid[0][0];
		for(int i=1;i<m;i++)
			dp[0][i]=dp[0][i-1]+grid[0][i];
		for(int j=1;j<n;j++)
		{
			dp[j][0]=dp[j-1][0]+grid[j][0];
		}
		
		for(int row=1;row<m;row++)
		{
			for(int col=1;col<n;col++)
			{
				dp[row][col]=Math.min(dp[row-1][col],dp[row][col-1])+grid[row][col];
			}
		}
		return dp[m-1][n-1];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{1,2,3},
				{4,8,2},
				{1,5,3}				
		};
		System.out.print(minbfs(arr,3));

	}

}
