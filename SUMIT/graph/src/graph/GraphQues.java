package graph;

import java.util.Scanner;

public class GraphQues {

	
	public static void dfs(int graph[][]) {
		boolean visited[] = new boolean[graph.length];
		dfs(graph, 0, visited);
	}
	
	private static void dfs(int[][] graph, int vertex, boolean visited[]) {
		System.out.print(vertex+" ");
		visited[vertex] = true;
		for(int i = 0; i < graph.length; i++) {
			if(graph[vertex][i] == 1 && !visited[i]) {
				dfs(graph, i, visited);
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int v, e;
		v = s.nextInt();
		e = s.nextInt();
		int graph[][] = new int[v][v];
		for(int i = 0; i < e; i++) {
			int v1, v2;
			v1 = s.nextInt();
			v2 = s.nextInt();
			graph[v1][v2] = 1;
			graph[v2][v1] = 1;
		}
		dfs(graph);
		
		
	}

}
