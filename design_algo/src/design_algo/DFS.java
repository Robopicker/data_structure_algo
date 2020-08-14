package design_algo;

import java.util.*;
import java.io.*;
public class DFS {
       int V;
       LinkedList<Integer> adj[];
       DFS(int v)
       {
    	   this.V=v;
    	   adj=new LinkedList[V];
    	   for(int i=0;i<V;i++)
    	   {
    		   adj[i]=new LinkedList<>();
    	   }
    	   
       }
	 void addEdge(int src,int dest)
	 {
		 adj[src].add(dest);
		 adj[dest].add(src);
	 }

    void DFSUtil(int v,boolean visited[])
    {

        visited[v] = true;
        System.out.print(v+" ");
 
      
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
 
    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(int v)
    {
        boolean visited[] = new boolean[V];
 
        DFSUtil(v, visited);
    }
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
			int v=s.nextInt();
			int e=s.nextInt();
			DFS g=new DFS(v);
			while(e-->0)
			{
				int v1=s.nextInt();
				int v2=s.nextInt();
				g.addEdge(v1, v2);
			}
			g.DFS(0);

	}

}
