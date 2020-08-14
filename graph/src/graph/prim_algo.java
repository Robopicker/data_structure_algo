package graph;

import java.util.*;
public class prim_algo {
    public static  void prims(int [][] graph,int v)
    {
    	boolean visited[]=new boolean[v];
    	int weight[]=new int[v];
    	int parent[]=new int[v];
    	
    	weight[0]=0;
    	parent[0]=-1;
    	for(int i=1;i<v;i++)
    	{
    		weight[i]=Integer.MAX_VALUE;
    	}
    	
    	for(int i=0;i<v;i++)
		{
			int minindex=findMin(visited,weight);
			visited[minindex]=true;
			for(int j=0;j<v;j++)
			{
				if(graph[minindex][j]!=0&&!visited[j])
				{
					if(graph[minindex][j]<weight[j])
					{
						weight[j]=graph[minindex][j];
						
						parent[j]=minindex;
					}
				}
			}
		}
		
		  for(int i=1;i<v;i++)
	 		{
			  if(i<parent[i])
	 			System.out.println(i+" "+parent[i]+" "+weight[i]);
			  else {
				  System.out.println(parent[i]+" "+i+" "+weight[i]);
			  }
	 		}
		
    }
   
	public static void main(String[] args) {
		   Scanner s=new Scanner(System.in);
         int v=s.nextInt();
         int e=s.nextInt();
        int [][] graph=new int[v][v];
        
           while(e-->0)
           {
        	   
           
        		int v1=s.nextInt();
        		int v2=s.nextInt();
        		int weight1=s.nextInt();
        		graph[v1][v2]=weight1;
        		graph[v2][v1]=weight1;
        		
           }
           
           prims(graph,v);
       
	}
	
	public static int findMin(boolean []visited,int weight[]) {
		int ans=Integer.MAX_VALUE;
		int minindex=-1;
		for(int i=0;i<visited.length;i++)
		{
			if(!visited[i]&&weight[i]<ans)
			{
				ans=weight[i];
				minindex=i;
			}
		}
	return minindex;
		
	}

}
