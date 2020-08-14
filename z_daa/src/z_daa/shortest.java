package z_daa;
import java.util.*;
public class shortest {

	
	public static void main(String[] args) {
		int mat[][] =
			{
				{ 7, 1, 3, 5, 3, 6, 1, 1, 7, 5 },
				{ 2, 3, 6, 1, 1, 6, 6, 6, 1, 2 },
				{ 6, 1, 7, 2, 1, 4, 7, 6, 6, 2 },
				{ 6, 6, 7, 1, 3, 3, 5, 1, 3, 4 },
				{ 5, 5, 6, 1, 5, 4, 6, 1, 7, 4 },
				{ 3, 5, 5, 2, 7, 5, 3, 4, 3, 6 },
				{ 4, 1, 4, 3, 6, 4, 5, 3, 2, 6 },
				{ 4, 4, 1, 7, 4, 3, 3, 1, 4, 2 },
				{ 4, 4, 5, 1, 5, 2, 3, 5, 3, 5 },
				{ 3, 6, 3, 5, 2, 2, 6, 4, 2, 1 }
			};

			List<Node> path = new ArrayList<>();
			TreeNode source = new TreeNode(0, 0);

			// Find route in a matrix mat from source cell (0, 0) to
			// destination cell (N-1, N-1)
			if (findPath(mat, path, source))
				printPath(path);

		
	}

	private static void printPath(List<Node> path) {
	
		
	}

	private static boolean findPath(int[][] mat, List<Node> path, TreeNode source) {

      
		return false;
	}

}
