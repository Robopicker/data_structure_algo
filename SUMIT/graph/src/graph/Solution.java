package graph;

import java.util.Scanner;
import java.util.*;
public class Solution {
   
  static class Graph
  {
    
    int v=0;
    LinkedList<Integer> adjlist[];
    public Graph(int v)
    {
      this.v=v;
      adjlist=new LinkedList[v];
      for(int i=0;i<v;i++)
      {
        adjlist[i]=new LinkedList<>();
      }
    }
  }
  
  public static void addedge(Graph graph,int v1,int v2,boolean check)
  {
	     if(check)
	    {	  
         graph.adjlist[v1].add(v2);
         graph.adjlist[v2].add(v2);
	     }
	     else {
	    	 graph.adjlist[v1].add(v2);
	     }
  }
  
  /*public static void print(Graph g)
  { 
    boolean visited[]=new boolean[g.adjlist.length];
       
    for(int v=0;v<g.v;v++)
    {
      if(visited[v]==false)
      {
        dfsutil(g,v,visited);
        System.out.println();
      }
    }
    
   }
  public static void dfsutil(Graph g,int v,boolean visited[])
  {
    visited[v]=true;
    System.out.print(v+" ");
    LinkedList<Integer> head= g.adjlist[v];
    Iterator<Integer> i=head.listIterator();
    while(i.hasNext())
    {
      int n=i.next();
      if(!visited[n])
      {
        dfsutil(g,n,visited);
      }
    }
    
  }
 */
  public static void print(Graph g)
  {
	  int l=g.v;
	  for(int i=0;i<l;i++)
	  {
		  System.out.print(i);
		  LinkedList<Integer> head=  g.adjlist[i];
		  Iterator<Integer> j=head.listIterator();
		  while(j.hasNext())
		  {
			  int n=j.next();
			  System.out.print("->"+n);
		  }
		  System.out.println();
	  }
  }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
         
      Graph g=new Graph(V);
      while(E-->0)
      {
        int v1=s.nextInt();
        int v2=s.nextInt();
        addedge(g,v1,v2,false);
        
      }
      print(g);
      
      
	}
}