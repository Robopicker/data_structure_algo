package z_daa;
import java.util.*;
class temp_1
{
	int vertex;
	int weight;
	int depth;
	public temp_1(int v,int weight,int depth)
	{
		this.vertex=v;
		this.weight=weight;
		this.depth=depth;
	}
	public temp_1(int v,int dest)
	{
		this.vertex=v;
		this.depth=dest;
	}
	
}
public class dijiktras_directed {
	public static int findMin(boolean visited[],int distance[])
	{
		int ans=Integer.MIN_VALUE;
		int a=-1;
		for(int i=0;i<visited.length;i++)
		{
			if(!visited[i]&&distance[i]>ans)
			{
				ans=distance[i];
				a=i;
			}
		}
		return a;
	}

	public static void maximumpath(int  graph[][],int n)
	{
		
		boolean visited[]=new boolean[n];
		int distance[]=new int[n];
		Arrays.fill(distance,Integer.MIN_VALUE);
		distance[0]=0;
		for(int i=0;i<n;i++)
		{
			int min=findMin(visited,distance);
				visited[min]=true;
				for(int j=0;j<n;j++)
				{
					if(!visited[j]&&graph[min][j]!=0)
					  if(distance[min]+graph[min][j]>distance[j])
					{
						distance[j]=distance[min]+graph[min][j];
					}
					
				}
			
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(i+"--->"+distance[i]);
		}
	}
	public static void least_cost(int graph[][],int n,int m,int k)
	{
		Queue<temp_1> queue=new  LinkedList<>();
		queue.add(new temp_1(0,0,0));
		int ans=Integer.MAX_VALUE;
		while(!queue.isEmpty())
		{
			temp_1 temp=queue.poll();
			if(temp.vertex==k&&temp.depth==m)
			{
				ans=Integer.min(ans, temp.weight);
				
			}
			
			if(temp.depth>m)
			{
				break;
			}
			for(int i=0;i<n;i++)
			{
				if(graph[temp.vertex][i]!=0)
				{
				   queue.add(new temp_1(i,temp.weight+graph[temp.vertex][i],temp.depth+1));	
				}
			}
		}
		System.out.println(ans);
		
	}
	public static int count_path(int graph[][],int n,int src,int dest,int m)
	{
		Queue<temp_1> queue=new LinkedList<>();
		int count=0;
	
		queue.add(new temp_1(src,0));
		while(!queue.isEmpty())
		{
			temp_1 node=queue.poll();
			if(node.vertex==dest&&node.depth==m)
			{
				count++;
			}
			if(node.depth>m)
			{
				break;
			}
			for(int i=0;i<n;i++)
			{
				if(graph[node.vertex][i]!=0)
				{
				queue.add(new temp_1(i,node.depth+1));	
				}
			}
				
		}
			return count;
		
	}
	public static void main(String[] args) {
	 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int edge=s.nextInt();
		int  graph[][]=new int[n][n];
	
		int c=0;
		while(edge-->0)
		{
			int src=s.nextInt();
			int end=s.nextInt();
			int weight=s.nextInt();
			graph[src][end]=weight;
		
		}
		int src=s.nextInt();
		int dest=s.nextInt();
	 //  least_cost(graph,n,m,dest);
		int m=s.nextInt();
	int ans=	count_path(graph,n,src,dest,m);
	System.out.println(ans);
	}

}
