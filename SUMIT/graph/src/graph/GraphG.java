package graph;
import java.util.*;
public class GraphG {
	  int V;
      LinkedList<Integer> AdjListArray[];
      GraphG(int V)
      {
    	  this.V=V;
    	  AdjListArray=new LinkedList[V];
         for(int i=0;i<V;i++)
         {
        	 AdjListArray[i]=new LinkedList<>();
         }
      
      }
      
}	
class GraphUse
{   
	 void addvertex(GraphG graph,int src,int dest)
	 {
		graph.AdjListArray[src].addFirst(dest);
		graph.AdjListArray[dest].addFirst(src);
	 }
	 void print(GraphG graph)
	 {
		 for(int v=0;v<graph.V;v++)
		 {
			 System.out.print(" list of vertex v"+v);
			 System.out.print(" head");
			 for(Integer p:graph.AdjListArray[v])
			 {
				 System.out.print("->" +p);
			 }
			 System.out.println();
		 }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 5;

      
	}

}
