package back_tracking;
// solve by using bfs -travesal 

import java.util.*;
public class m_color {

	static int graph[][];
	static int ans[];
	static int V;
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		 V=v;
		graph=new int[v][v];
		ans=new int[v];
		for(int i=0;i<v;i++)
		{
			for(int j=0;j<v;j++)
			{
				graph[i][j]=s.nextInt();
			}
		}
		int color[]= {1,2,3};
		solution(color);
print();
	}
	public static void print()
	{
		System.out.println();
		
			for(int j=0;j<V;j++)
			{
				System.out.print(ans[j]+" ");
			}
			System.out.println();
		
	}
	public static void solution(int color[])
	{
		Queue<Integer> queue=new ArrayDeque<>();
		boolean visited[]=new boolean[V];
		queue.add(0);
		visited[0]=true;
		while(!queue.isEmpty())
		{
			int node=queue.peek();
			queue.poll();
			
			for(int i=0;i<3;i++)
			{
				int color1=color[i];
				if(isSafe(node,color1))
				{
					ans[node]=color1;
					
					for(int j=0;j<V;j++)
					{
						if(graph[node][j]==1&&!visited[j])
						{
							visited[j]=true;
							queue.add(j);
						}
					}
					
				}
			}
		}
	}
	private static boolean isSafe(int node, int color1) {
		  for(int i=0;i<V;i++)
		  {
			  if(graph[node][i]==1&&ans[i]==color1)
			  {
				   return false;
			  }
		  }
		  
		return true;
	}

}
