package implement;
import java.util.*;
public class Krushl_algo {

	class Edge implements Comparable<Edge>{
		
		int src, dest, weight; 
		  
        // Comparator function used for sorting edges  
        // based on their weight 
        public int compareTo(Edge compareEdge) 
        { 
            return this.weight-compareEdge.weight; 
        } 	
		
	}
	
	class subset{
		int parent,rank;
	}
	
	int V,E;
	Edge edge[];
	public Krushl_algo(int V,int E)
	{
		this.E=E;
		this.V=V;
		edge=new  Edge[E];
		for(int i=0;i<E;i++)
		{
			edge[i]=new Edge();
		}
	}
	
	public void KruskalMST() {
		Edge result[]=new Edge[V];
		for(int i=0;i<V;i++)
		{
			result[i]=new Edge();
			
		}
		subset sub[]=new subset[V];
		for(int i=0;i<V;i++)
		{
			sub[i].parent=i;
			sub[i].rank=0;
		}
		
	}
	
	public static void main(String[] args) {
      
		Scanner s=new Scanner(System.in);
		int V=s.nextInt();
		int E=s.nextInt();
		Krushl_algo graph=new Krushl_algo(V,E); 
	    
		for(int i=0;i<V;i++)
		{
			System.out.println("Enter data of"+i+" edge");
			graph.edge[i].src=s.nextInt();
			graph.edge[i].dest=s.nextInt();
			graph.edge[i].weight=s.nextInt();
		}
		
		  graph.KruskalMST(); 
	}



}
