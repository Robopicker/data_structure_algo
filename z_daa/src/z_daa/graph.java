package z_daa;
import java.util.*;
public class graph {

	  int graph[][];
	 
	  public void print()
	  {
		  for(int i=0;i<graph.length;i++)
		  {
			  System.out.print(i+" -->  ");
			  for(int j=0;j<graph[0].length;j++)
			  {
				   if(graph[i][j]==1)
				   {
					   System.out.print(j+" ");
				   }
			  }
			  System.out.println();
		  }
	  }
	  public  void dfs()
	  {
		  boolean visited[]=new boolean[graph.length];
		  for(int i=0;i<graph.length;i++)
		  {
			  if(!visited[i])
			  {
		  dfshelper(i,visited,graph.length);
		  System.out.println();
			  }
		  }
	  }
	  public void dfshelper(int start,boolean visited[],int size)
	  {
		  if(visited[start])
		  {
			  return ;
		  }
		  else {
			  
			  System.out.print(start+" ");
			  visited[start]=true;
			  for(int i=0;i<size;i++)
			  {
				  if(graph[start][i]!=0)
				  {
					  dfshelper(i,visited,size);
				  }
			  }
		  }
			  
		  
	  }

	  public void bfs()
	  {
		  boolean  visited[]=new boolean[graph.length];
		  for(int i=0;i<visited.length;i++)
		  {
			  if(!visited[i])
			  {
				  bfs1(i,visited);
				  System.out.println();
			  }
		  }
		  
	  }
	  public  void  bfs1(int start,boolean visited[])
	  {
		
		 int n=graph.length;
		 Queue<Integer> queue=new LinkedList<>();
		 queue.add(start);
		 visited[start]=true;
		 while(!queue.isEmpty())
		 {
			 int num=queue.poll();
			 System.out.print(num+"  ");
			 for(int i=0;i<n;i++)
			 {
				 if(graph[num][i]!=0&&!visited[i])
				 {
					 queue.add(i);
					 visited[i]=true;
				 }
			 }
		 }
	  }
	  
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			System.out.println("enter graph size");
			int n=s.nextInt();
			
			System.out.println("enter graph behaivor");
			char ch=s.next().charAt(0);
			graph g1=new graph();
			g1.graph=new int[n][n];
		   System.out.println(" enter graph edges ");
		   int k=s.nextInt();
		   while(k-->0)
		   {
			    int start=s.nextInt();
			    int end=s.nextInt();
			    if(ch=='b')
			    {
			    	g1.graph[start][end]=1;
			    	g1.graph[end][start]=1;
			    }
			    else {
			    	g1.graph[start][end]=1;
			    }
		   }
			
			g1.bfs();
			g1.dfs();
		}
	}

}
