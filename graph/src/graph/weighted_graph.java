package graph;
import java.util.*;

class Edge1
{
	int src;
	int dest;
	int weight;
	
	public Edge1(int src,int dest,int weight)
	{
		this.src=src;
		this.dest=dest;
		this.weight=weight;
	}
	
}
public class weighted_graph {
	
	  static LinkedList<Edge1> adjArray[];
	
	  static int V;
	  static int E;
	
	  
	  
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		int e=s.nextInt();
		V=v;
		E=v;
		adjArray=new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adjArray[i]=new LinkedList<Edge1>();
		}
		
		while(e-->0)
		{
			int src=s.nextInt();
			int dest=s.nextInt();
			int weight=2;
			addEdge(src,dest,weight,false);
		}
		
		int src=s.nextInt();
		int dest=s.nextInt();
//		
//	 ArrayList<Integer> arr=GetPath(src,dest);
//		if(arr==null) {
//			System.out.println("no path exists");
//		}
//		else {
//			
//			for(int i=0;i<arr.size();i++)
//			{
//				System.out.print(arr.get(i)+" ");
//			}
//		}
		//print();
		//allconnectedGraph();
		
		//System.out.println(isCycle(v,adjArray));
	//	alltopological();
	//	int src=s.nextInt();
		//int end=s.nextInt();
		count_path(src,dest);
		//bfs_disconnect();
	}
	
	public static void bfs_disconnect()
	{
		boolean visited[]=new boolean[V];
		 for(int i=0;i<V;i++)
		 {
			 if(!visited[i])
			 {
				 bfs_disconnectutil(i,adjArray,visited);
			 }
		 }
	}
	public static void bfs_disconnectutil(int src,LinkedList<Edge1> [] alist,boolean [] visited)
	{
		Queue<Integer> queue=new LinkedList<>();
		queue.add(src);
		visited[src]=true;
		while(!queue.isEmpty())
		{
			int node1=queue.poll();
			System.out.print(node1+" ");
			Iterator<Edge1> itr=alist[node1].listIterator();
			while(itr.hasNext())
			{
				int data=itr.next().dest;
				if(!visited[data])
				{
					queue.add(data);
					visited[data]=true;
				}
			}
		}
		System.out.println();
	
	}
	
	static int count=0;
	//count path
	public static void count_path(int src,int end)
	{
		
		boolean visited[]=new boolean[V];
		ArrayList<Integer> arr=new ArrayList<>();
	 count_pathutil(src,end,adjArray,visited,arr);
	
	}
  public static void print(ArrayList<Integer> arr )
  {
	  for(int i:arr)
	  {
		  System.out.print(i+" ");
	  }
	  System.out.println();
  }
	public static void count_pathutil(int src,int end,LinkedList<Edge1>[] alist,boolean visited[],ArrayList<Integer> arr)
	{
		 if(src==end)
		 {
			 print(arr);
			 visited[src]=false;
			 return ;
		 }
		
		visited[src]=true;
		//arr.add(src);
		Iterator<Edge1> itr=alist[src].listIterator();
		while(itr.hasNext())
		{
			int node1=(int)itr.next().dest;
			if(!visited[node1])
			{ arr.add(node1);
			count_pathutil(node1,end,alist,visited,arr);
			arr.remove(node1);
			}
		}
		//arr.remove(src);
		visited[src]=false;
		
		
		
		
	}
	
	
	// topological sorting
	public static void alltopological()
	{
		boolean visited[]=new boolean[V];
		int indgree[]=new int[V];
		for(int i=0;i<V;i++)
		{
			LinkedList<Edge1> head=adjArray[i];
			Iterator<Edge1> itr=head.listIterator();
			while(itr.hasNext())
			{
				int node1=(int)itr.next().dest;
				indgree[node1]++;
			}
		}
		
		ArrayList<Integer> arr=new ArrayList<>();
		topological_sort( indgree, visited,adjArray,arr);
	}
	public static void topological_sort(int [] indgree,boolean [] visited,LinkedList<Edge1>[] adjlist ,ArrayList<Integer> stack )
	{
		boolean flag=false;
		for(int i=0;i<V;i++)
		{
			if(!visited[i]&&indgree[i]==0)
			{
				visited[i]=true;
				 stack.add(i);
				Iterator<Edge1> head=adjlist[i].listIterator();
				while(head.hasNext())
				{
					indgree[(int)head.next().dest]--;
				}
				topological_sort(indgree,visited,adjlist,stack);
				visited[i]=false;
				stack.remove(stack.size()-1);
				for(Edge1 j:adjlist[i] )
				{
					indgree[j.dest]++;
					
				}
				
				
			flag=true;	
			}
			
			
		}
		if(!flag)
		{
			for(int i=0;i<stack.size();i++)
			{
				System.out.print(stack.get(i)+" ");
			}
			System.out.println();
		}
		
	}
	public static void topological()
	{
		boolean visited[]=new boolean[V];
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<V;i++)
		{
			if(!visited[i])
			{
				topologicalsort(i,adjArray,visited,stack);
			}
		}
		
		while(!stack.isEmpty())
		{    
			System.out.print(stack.pop()+" ");
		}
	
	}
	public static void topologicalsort(int src,LinkedList<Edge1> [] alist,boolean visited[],Stack<Integer> stack)
	{
		visited[src]=true;
		LinkedList<Edge1> head=alist[src];
		Iterator<Edge1> itr=head.listIterator();
		while(itr.hasNext())
		{
			int node1=(int)itr.next().dest;
			if(!visited[node1])
			{
				topologicalsort(node1,alist,visited,stack);
			//	stack.push(node1);
			}
			
		}
		stack.push(src);
		
		
	}
	
	
	
	public static boolean iscycleHelper(int src,LinkedList<Edge1>[] alist,Set<Integer> whiteset,Set<Integer> grayset,Set<Integer> blackset )
	{
		whiteset.remove(src);
		grayset.add(src);
		LinkedList<Edge1> head=alist[src];
		Iterator<Edge1> itr=head.listIterator();
		while(itr.hasNext())
		{
			int node1=(int)itr.next().dest;
		    if(blackset.contains(node1))
		    {
		    	continue;
		    }
		    if(grayset.contains(node1))
		    {
		    	return true;
		    }
		    if(iscycleHelper(node1,alist,whiteset,grayset,blackset))
		    	return true;
		}
		
		grayset.remove(src);
		blackset.add(src);
		return false;
	}
	public static boolean isCycle(int v,LinkedList<Edge1> [] alist )
	{
		Set<Integer> whiteset=new HashSet<>();
		Set<Integer> grayset=new HashSet<>();
		Set<Integer> blackset=new HashSet<>();
		for(int i=0;i<v;i++)
		{
			if(iscycleHelper(i,alist,whiteset,grayset,blackset))
				return true;
		}
		
		return false;
	}
	
	public static void allconnectedGraph() {
		 boolean visited1[]=new boolean[V];
	  for(int i=0;i<visited1.length;i++)
	  {
		  if(!visited1[i])
		  {
			  DFSUtil(i,visited1);
		  }
		  System.out.println();
	  }
		
	}
	public static void DFSUtil(int v,boolean []visited1) { 
	        // Mark the current node as visited and print it 
	        visited1[v] = true; 
	        System.out.print(v+" "); 
	        LinkedList<Edge1> head=adjArray[v];
	        Iterator<Edge1> itr=head.listIterator();
	        while(itr.hasNext())
	        {
	        	Edge1 node1=(Edge1)itr.next();
	        	if(!visited1[node1.dest])
	        	{
	        		DFSUtil(node1.dest,visited1);
	        	}
	        	
	        }
	        
	    } 
	
	public static void HasPath(int src,int dest)
	{
		Stack<Integer> stack=new Stack<>();
		stack.push(src);
		boolean visited[]=new boolean[V];
		visited[src]=true;
		while(!stack.isEmpty())
		{   int node=stack.pop();
		
		   if(node ==dest)
		   {
			   System.out.println("path exist");
			   return ;
		   }
		  
			   LinkedList<Edge1> head=adjArray[node];
			  Iterator itr=head.listIterator();
			  while(itr.hasNext())
			  {
				  Edge1 node1=(Edge1)itr.next();
				  if(!visited[node1.dest])

				  {
					  visited[node1.dest]=true;
					  stack.push(node1.dest);
				  }
			  }
			   
		   
		  
            			
		}
		
		System.out.println("no path");
	}
	
	public static ArrayList<Integer> GetPath(int src,int dest)
   {
	
		ArrayList<Integer> arr=new ArrayList<>();
		boolean visited[]=new boolean[V];
		Queue<Integer> queue=new LinkedList<>();
		queue.add(src);
		visited[src]=true;
		while(!queue.isEmpty())
		{
			int node=queue.poll();
			if(node ==dest)
			{   arr.add(dest);
				return arr;
			}
			arr.add(node);
			LinkedList<Edge1> head=adjArray[node];
			Iterator<Edge1> itr=head.iterator();
			while(itr.hasNext())
			{
				Edge1 node1=(Edge1)itr.next();
				if(!visited[node1.dest])
				{
					visited[node1.dest]=true;
					queue.add(node1.dest);
				}
			}
			
			
		}
		
		return null;
		
	}
	public static void print()
	{
		for(int i=0;i<V;i++)
		{
			System.out.println(i);
			LinkedList<Edge1> head=adjArray[i];
			
			Iterator<Edge1> itr=head.listIterator();
			while(itr.hasNext())
			{
			   Edge1 edge=(Edge1)itr.next();
			  System.out.println(edge.src+"--"+ edge.weight +"-->"+edge.dest+"-->");
			}
			
			System.out.println("--------");
		}
	}
	
	public static void addEdge(int src,int dest,int weight,boolean check)
	{
		Edge1 newEdge=new Edge1(src,dest,weight);
		if(check)
		{
		   adjArray[src].addLast(newEdge);
		   adjArray[dest].addLast(newEdge);
			
		}
		else {
			adjArray[src].addFirst(newEdge);
		}
	}

}
