package graph;
import java.util.*;
import java.io.*;
public class BFS {
       int V;
       LinkedList<Integer> adj[];
       BFS(int v)
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
		 adj[src].addFirst(dest);
	 }
	void Bfs(int s)
	{
		Boolean visited[]=new Boolean[V];
		//Queue<Integer> q = new LinkedList<>();
		LinkedList<Integer> q = new LinkedList<Integer>();
		visited[s]=true;
	
		q.add(s);	
		while(q.size()!=0)
		{   s=q.poll();
			System.out.print(s+" ");
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext())
			{
				int n=i.next();
				if(!visited[n])
				{
					visited[n]=true;
					q.add(n);
				}
			}
		}
	}
	 // A function used by DFS
	 // A function used by DFS 
    void DFSUtil(int v,boolean visited[]) 
    { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v+" "); 
  
        // Recur for all the vertices adjacent to this vertex 
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
        // Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[V]; 
  
        // Call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited); 
    } 
  
	
	void dfs(int src)
	{
	   boolean visited[]=new boolean[V];
	   dfsUtil(src,visited);
	}
	void dfsUtil(int src,boolean visited[])
	{
		visited[src]=true;
		System.out.println(src);
		LinkedList<Integer> head=adj[src];
		Iterator<Integer> itr=head.listIterator();
		while(itr.hasNext())
		{
			int node1=(int)itr.next();
			if(!visited[node1])
			{
				dfsUtil(node1,visited);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS g=new BFS(5);
		    g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	        
	        System.out.println(" print BfS of Graph");
	       //g.Bfs(0);
	        g.DFS(0);
	        System.out.println("-------");
	      g.dfs(0);
		

	}

}
