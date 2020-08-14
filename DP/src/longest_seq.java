
import java.util.*;
class Node_a
{
	int x;int y;
	int data;
	int dist;
	public Node_a(int x,int y,int data,int dist)
	{
		this.x=x;
		this.y=y;
		this.data=data;
		this.dist=dist;
	}
}
public class longest_seq {
   static int xmove[]= {0,0,1,-1};
   static int ymove[]= {1,-1,0,0};
   public static boolean isCheck(int x1,int y1,int n,boolean visited[][])
   {
	   return x1>=0&&x1<n&&y1>=0&&y1<n&&!visited[x1][y1];
   }
	public static int  bfs(int arr[][],int x,int y,int n,boolean visited[][])
	{
		Queue<Node_a> queue=new LinkedList<>();
		queue.add(new Node_a(x,y,arr[x][y],0));
		visited[x][y]=true;
		int ans=Integer.MIN_VALUE;
		while(!queue.isEmpty())
		{
			Node_a temp=queue.poll();
			if(temp.dist>ans)
			{
				ans=temp.dist;
			}
			
			for(int i=0;i<4;i++)
			{
				int xn=temp.x+xmove[i];
				int yn=temp.y+ymove[i];
				if(isCheck(xn,yn,n,visited))
				{
					if(Math.abs(temp.data-arr[xn][yn])==1)
							{
						queue.add(new Node_a(xn,yn,arr[xn][yn],temp.dist+1));
						visited[xn][yn]=true;
						
							}
					
				}
			}
		}
		return ans;
	}
	public static int function(int arr[][],int n)
	{
	
		boolean visited[][]=new boolean[n][n];
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(!visited[i][j])
				{
					ans=Math.max(ans, bfs(arr,i,j,n,visited));
				}
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int arr[][]=new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					arr[i][j]=s.nextInt();
				}
			}
			int ans=function(arr,n);
			System.out.println(ans);
		}
		
		
	}

}
