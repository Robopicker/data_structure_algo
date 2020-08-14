package graph;
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static boolean hasPath(int src,int dest,int [][]graph,int n)
    {
    	 boolean visited[]=new boolean[n];
     Queue<Integer> queue=new LinkedList<>();
      queue.add(src);
     
      visited[src]=true;
      while(!queue.isEmpty())
      {
          int node=queue.poll();
          if(node==dest)
          {
              return true;
          }
          for(int j=0;j<n;j++)
          {
              if(graph[node][j]==1&&!visited[j])
              {
                  visited[j]=true;
                  queue.add(j);
              }
          }
          
      }
      return false;
    }
	public static void main (String[] args) {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int n=s.nextInt();
	     int graph[][]=new int[n][n];
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            graph[i][j]=s.nextInt();
	        }
	    }
	    int output[][]=new int[n][n];
	    for(int i=0;i<n;i++)
	    {
	        int src=i;
	        for(int j=0;j<n;j++)
	        {
	            int dest=j;
	            if(hasPath(src,dest,graph,n))
	             {
	              System.out.print(1+" ");   
	             }
	             else{
	              System.out.print(0+" ");
	             }
	        }
	    }
	    
	    
	 }
	}
}