package back_tracking;

public class Solution {

	public static void main(String []args)
	{
		//Nqueen queen=new Nqueen(6);
		int adjmatrix[][]= {
				{0,0,0,0,0,0},
				{0,0,0,0,0,1},
				{0,1,0,0,0,1},
				{0,0,0,0,0,1},
				{0,1,0,0,0,0},
				{0,0,0,0,0,0}
				
		};
		
		int grid[][] = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};
	      // suduku ans=new suduku(grid);
	    //   ans.solve();
		maze ans=new maze(adjmatrix);
		ans.solve();
	}
	
}
