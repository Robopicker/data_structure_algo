package design_algo;
import java.io.*; 
import java.util.*; 
  

public class BFS {
  

  public static void bfTraversal(int[][] adjMatrix) {
		Queue<Integer> queue = new LinkedList<>();
		boolean visited[] = new boolean[adjMatrix.length];
		for(int v = 0; v < adjMatrix.length; v++) {
			if(! visited[v]) {
				queue.add(v);
				// As we have added v to queue
				visited[v] = true;
				while(!queue.isEmpty()) {	
					int currentVertex = queue.poll();
					System.out.print(currentVertex +" ");
					for(int i = 0; i < adjMatrix.length; i++ ) {
						if(adjMatrix[currentVertex][i] == 1 && 
								! visited[i]) {
							queue.add(i);
							visited[i] = true;	
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		int adjMatrix[][] = new int[V][V];
		
		for(int i = 0; i < E; i++) {
			int v1, v2, w;
			v1 = s.nextInt();
			v2 = s.nextInt();
	       adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
        bfTraversal(adjMatrix);
		
	}
}