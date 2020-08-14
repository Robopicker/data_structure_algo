package z_daa;
import java.util.*;
public class list_graph {
    
	int size;
	LinkedList<Integer> adjlist[];
	list_graph(int n)
	{
		this.size=n;
		adjlist=new LinkedList[n];
		for(int i=0;i<n;i++)
		{
		adjlist[i]=new LinkedList<>();
		}
	}
	public void addedge(int start,int end,char ch)
	{
		if(ch=='b')
		{
			adjlist[start].addLast(end);
			adjlist[end].addLast(start);
		}
		else {
			adjlist[start].addLast(end);
		}
	}
	public void print()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(i+"-->");
			Iterator<Integer> li=adjlist[i].listIterator();
			while(li.hasNext())
			{
				System.out.print(li.next()+" ");
			}
			System.out.println();
		}
	}
	public void bfs()
	{
		boolean visited[]=new boolean[size];
		for(int i=0;i<size;i++)
		{
			if(!visited[i])
			{
				bfsutil(i,visited);
				System.out.println();
			}
		}
	}
	private void bfsutil(int start, boolean[] visited) {

		Queue<Integer> queue=new LinkedList<>();
		queue.add(start);
		visited[start]=true;
		while(!queue.isEmpty())
		{
			int temp=queue.poll();
			System.out.print(temp+" ");
			Iterator<Integer> li=adjlist[temp].listIterator();
			while(li.hasNext())
			{
				int p=li.next();
			  if(adjlist[temp].contains(p)&!visited[p])
			  {
				  queue.add(p);
				  visited[p]=true;
			  }
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		list_graph  g1=new list_graph(n);
		int edge=s.nextInt();
		char ch=s.next().charAt(0);
	     while(edge-->0)
	     {
	    	 int start=s.nextInt();
	    	 int end=s.nextInt();
	    	g1.addedge(start,end,ch);
	     }
	     g1.print();
  System.out.println();
	     g1.bfs();
	}

}
