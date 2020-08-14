import java.util.*;
public class traveling_salesman {
 
	public static int function(int graph[][],int start)
	{
		boolean visited[]=new boolean[graph.length];
		visited[start]=true;
		return helper(graph,graph.length-1,start,start,visited);
		
		
	}
	public static boolean allvisited(boolean visited[])
	{
		for(int i=0;i<visited.length;i++)
		{
			if(visited[i]==false)return false;
		}
		return true;
	}
	public static int helper(int graph[][],int n,int pos,int start,boolean visited[])
	{
		
		if(allvisited(visited))
		{
			return graph[pos][start];
		}
		
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<=n;i++)
		{
			if(!visited[i]&&graph[pos][i]!=0)
			{
				visited[i]=true;
				int temp=graph[pos][i]+helper(graph,n,i,start,visited);
				visited[i]=false;
			    ans=Math.min(ans, temp);
			}
		}
		//visited[pos]=false;
		return ans;
	}
	public static void main(String[] args) {
		int graph[][]= {
				 { 0, 20, 42, 25 }, 
			        { 20, 0, 30, 34 }, 
			        { 42, 30, 0, 10 }, 
			        { 25, 34, 10, 0 } 
		               };
	int ans=function(graph,0);
	System.out.println(ans);
	}

}
