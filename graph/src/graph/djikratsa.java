package graph;
import java.util.*;
public class djikratsa {
       public static void djiktras(int v,int [][] graph)
       {
    	   boolean visited[]=new boolean[v];
    	   int distance[]=new int[v];
    	  // int weight[]=new int[v];
    	   distance[0]=0;
    	   for(int i=1;i<v;i++)
    	   {
    		   distance[i]=Integer.MAX_VALUE;
    	   }
    	   distance[0]=0;
    	   
    	   for(int i=0;i<v;i++)
    	   {
    		   
    		   int minindex=findMin(visited,distance);
    		   visited[minindex]=true;
    		   for(int j=0;j<v;j++)
    		   {
    			   if(!visited[j]&&graph[minindex][j]!=0)
    			   {
    				   if(graph[minindex][j]+distance[minindex]<distance[j])
   					{
   						distance[j]=graph[minindex][j]+distance[minindex];
   						
   						
   					}    			   
    				   
    			   }
    		   }
    	   }
    	   
    	   for(int i=0;i<v;i++)
    	   {
    		   System.out.println(0+"--- >"+i+" "+distance[i] );
    	   }
    	   
    	   
    	   
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  int v=s.nextInt();
  int e=s.nextInt();
  int graph[][]=new int[v][v];
  
  while(e-->0)
  {
	 int src=s.nextInt();
	 int dest=s.nextInt();
	 int weight=s.nextInt();
	 graph[src][dest]=weight;
	 graph[dest][src]=weight;
	  
  }
  
  djiktras(v,graph);
 
		  
	}
	
	

}
