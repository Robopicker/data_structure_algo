package graph;
import java.util.*;

public class Alien_dictionary {

//	static class Edge
//	{
//		int src;
//		int dest;
//		public Edge(int src,int dest)
//		{
//			this.src=src;this.dest=dest;
//		}
//	}
	static class Graph
	{
		int v;
		LinkedList<Integer> alist[];
		public Graph(int v)
		{
			this.v=v;
			alist=new LinkedList[v];
			for(int i=0;i<v;i++)
			{
				alist[i]=new LinkedList<>();
			}
		}
		public  void addEdge(int src,int dest)
		{
			alist[src].add(dest);
		}
	}
	public static void main(String[] args) {
		
		String arr[]=  {"caa", "aaa", "aab"};
		int k=3;
		function(arr,3,k);
	}

	private static void function(String[] arr, int n, int k) {
		Graph g=new Graph(k);
		for(int i=0;i<n-1;i++)
		{
			String word1=arr[i];
			String word2=arr[i+1];
			for(int j=0;j<Math.min(word1.length(),word2.length());j++)
			{
				if(word1.charAt(j)!=word2.charAt(j))
				{
					g.addEdge(word1.charAt(j)-'a',word2.charAt(j)-'a');
					break;
				}
			}
		}
		topological_sort(g,k);
		
	}

	 static void topological_sort(Graph g, int k) {
        Stack<Integer> stack=new Stack<>();
        boolean visited[]=new boolean[k];
        for(int i=0;i<k;i++)
        {
        	if(!visited[i])
        	{
        		helper(g,i,k,visited,stack);
        	}
        }
        
        while (!stack.isEmpty()) 
        { 
            System.out.print((char)('a' + stack.pop()) + " "); 
        }
		
	}
	public static void helper(Graph g,int st,int k,boolean visited[],Stack stack)
	{
	   visited[st]=true;
	     LinkedList<Integer> head=  g.alist[st];
	     Iterator<Integer> li=head.listIterator();
	     while(li.hasNext())
	     {
	    	 int ni=li.next();
	    	 if(!visited[ni])
	    	 {
	    		 helper(g,ni,k,visited,stack);
	    	 }
	    		 
	     }
	     stack.push(st);
		
	}

}
