package graph;
import java.util.*;

class Edge_k
{
	int src;
	int dest;
	int weight;
	public Edge_k(int src,int dest,int weight)
	{
		this.src=src;
		this.dest=dest;
		this.weight=weight;
	}
	
	
}
class Mycomparator implements Comparator<Edge_k>{
  public int compare(Edge_k e1,Edge_k e2)
  {
	  return e1.weight-e2.weight;
  }
	
}
public class krushkal_algo {

   static	int v;
	static int e;
 	static Edge_k input[];
 	static Edge_k output[];
	static int c;
	public krushkal_algo(int v,int e)
	{
		this.e=e;
		this.v=v;
		input=new Edge_k[e];
		output=new Edge_k[e];
		c=0;
	}
	
	public static void addEdge(int src,int dest,int weight)
	{
		Edge_k newedge=new Edge_k(src,dest,weight);
	     input[c++]=newedge;
	     
	}
	
	public static void main(String args[] )
	{
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		int e=s.nextInt();
		krushkal_algo p=new krushkal_algo(v,e);
		while(e-->0)
		{
			int src1=s.nextInt();
			int dest1=s.nextInt();
			int weight1=s.nextInt();
			p.addEdge(src1, dest1, weight1);
		}
		
		Arrays.sort(input, new Mycomparator());
		
		int parent[]=new int[v];
		for(int i=0;i<v;i++)
		{
			parent[i]=i;
		}
		
		int count=0;
		int num=0;
		while(count!=v-1)
		{
		  Edge_k edge=input[num++];
		   
		 int parent1=findparent(edge.src,parent);
		 int parent2=findparent(edge.dest,parent);
		 if(parent1==parent2)
		 {
			 continue;
		 }
		 else {
			   
			   output[count]=edge;
			  makeunion(parent1,parent2,parent);
			   count++;
			   
		 }
		   
			
			
		}
		
		for(int i=0;i<v-1;i++)
		{
			System.out.println(output[i].src+" "+output[i].dest+" "+output[i].weight);
		}
		
		
	}

	private static void makeunion(int parent1, int parent2, int[] parent) {
	      int Parent =findparent(parent1,parent);
	      parent[parent2]=Parent;
		
	}

	private static int  findparent(int src,int []parent) {
		
		if(src==parent[src])
		{
			return src;
		}
		else {
		return findparent(parent[src],parent);
		}
		
	}
}
