package z_daa;
import java.util.*;
public class bipartite_graph {
  
	public static boolean answer(LinkedList<Integer> adjlist[])
	{
		boolean visited[] =new boolean[adjlist.length];
		char color[]=new char[adjlist.length];
		Queue<Integer> queue=new LinkedList<>();
		queue.add(0);
		color[0]='b';
		while(!queue.isEmpty())
		{
			int temp=queue.poll();
			Iterator<Integer> li=adjlist[temp].listIterator();
			while(li.hasNext())
			{
				int p=li.next();
				if(!visited[p])
				{
					visited[p]=true;
					color[p]='r';
					queue.add(p);
				}
				else if(visited[p])
				{
				  	if(color[p]==color[temp])
				  	{
				  		return false;
				  	}
				  	
				}
				
			}
		}
	   
		return true;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		list_graph g1=new list_graph(n);
		
		int edge=s.nextInt();
		while(edge-->0)
		{
			int start =s.nextInt();
			int end=s.nextInt();
			g1.addedge(start, end, 'e');
		}
		
		System.out.println(answer(g1.adjlist));
		
		
	}
	
}
