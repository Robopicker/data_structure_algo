package z_daa;
import java.util.*;
public class strongly_connected {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		list_graph g1=new list_graph(n);
	    int edge=s.nextInt();
	    while(edge-->0)
	    {
	    	int src=s.nextInt();
	    	int end=s.nextInt();
	    	char ch='e';
	    	g1.addedge(src, end, ch);
	    }
	int ans=    function(g1.adjlist,n);
		 System.out.println(ans);
	}

	private static int function(LinkedList<Integer>[] adjlist, int n) {
	
		Stack<Integer> st=new Stack<>();
	boolean visited[]=new boolean[n];
	for(int i=0;i<n;i++)
	{
		if(!visited[i])
		{
			dfs_util(adjlist,i,visited,st);
		}
	}
	
	list_graph g2=new list_graph(n);
	char ch1='e';
	for(int i=0;i<n;i++)
	{
		for(int j:adjlist[i])
		{
			g2.addedge(j, i, ch1);
		}
		
	}
	
	boolean visited1[]=new boolean[n];
	int count=0;
	while(!st.isEmpty())
	{
		int temp=st.pop();
		if(!visited1[temp])
		{
		dfs_util(g2.adjlist,temp,visited1);
		count++;
		}
	}
	
		return count;
	}
	private static void dfs_util(LinkedList<Integer>[] adjlist, int src, boolean[] visited) {
		
		if(visited[src])return ;
		visited[src]=true;
		for(int i:adjlist[src])
		{
			int temp=i;
			if(!visited[temp])
			{
				dfs_util(adjlist,temp,visited);
			}
		}
		     
	
	}


	private static void dfs_util(LinkedList<Integer>[] adjlist, int src, boolean[] visited, Stack<Integer> st) {
	
		if(visited[src])return ;
		visited[src]=true;
		for(int i:adjlist[src])
		{
			int temp=i;
			if(!visited[temp])
			{
				dfs_util(adjlist,temp,visited,st);
			}
		}
		     
		st.push(src);
	}

	

}
