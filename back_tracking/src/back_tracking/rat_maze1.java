package back_tracking;

import java.util.*;
class Node
{
	
	int x, y; String dist;

	Node(int x, int y, String dist) {
		this.x = x;
		this.y = y;
		this.dist = dist;
	}
};

class rat_maze1
{
	// M x N matrix
	private static  int N = 0;
	private static  int M = 0;

	// Below arrays details all 4 possible movements from a cell
	private static final int row[] = { -1, 0, 0, 1 };
	private static final int col[] = { 0, -1, 1, 0 };
	  static char ch[]={'U','D','L','R'};

	// Function to check if it is possible to go to position (row, col)
	// from current position. The function returns false if (row, col)
	// is not a valid position or has value 0 or it is already visited
	private static boolean isValid(int mat[][], boolean visited[][],
													int row, int col)
	{
		return (row >= 0) && (row < M) && (col >= 0) && (col < N)
					   && mat[row][col] == 1 && !visited[row][col];
	}

	// Find Shortest Possible Route in a matrix mat from source
	// cell (i, j) to destination cell (x, y)
	private static void BFS(int mat[][], int i, int j, int x, int y)
	{
		// construct a matrix to keep track of visited cells
		boolean[][] visited = new boolean[N][N];

		// create an empty queue
		Queue<Node> q = new ArrayDeque<>();

		// mark source cell as visited and enqueue the source node
		visited[i][j] = true;
		q.add(new Node(i, j, ""));

		// stores length of longest path from source to destination
		int min_dist = Integer.MAX_VALUE;
            ArrayList<String> arr=new ArrayList<>();
		// run till queue is not empty
		while (!q.isEmpty())
		{
			// pop front node from queue and process it
			Node node = q.poll();

			// (i, j) represents current cell and dist stores its
			// minimum distance from the source
			i = node.x;
			j = node.y;
			String dist = node.dist;

			// if destination is found, update min_dist and stop
			if (i == x && j == y)
			{
			      arr.add(dist);
				
			}

			// check for all 4 possible movements from current cell
			// and enqueue each valid movement
			for (int k = 0; k < 4; k++)
			{
				// check if it is possible to go to position
				// (i + row[k], j + col[k]) from current position
				if (isValid(mat, visited, i + row[k], j + col[k]))
				{
					// mark next cell as visited and enqueue it
					visited[i + row[k]][j + col[k]] = true;
					q.add(new Node(i + row[k], j + col[k], dist + ch[k]));
				}
			}
		}

		
		for( i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		}

	// Shortest path in a Maze
	public static void main(String[] args)
	{
		// input maze
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		   int n=s.nextInt();
		   N=n;M=n;
		   int m[][]=new int[n][n];
		   for(int i=0;i<n;i++)
		   {
			   for(int j=0;j<n;j++)
			   {
				   m[i][j]=s.nextInt();
			   }
		   }
		BFS(m, 0, 0, n, n);
		 
		}		
	
	}
}