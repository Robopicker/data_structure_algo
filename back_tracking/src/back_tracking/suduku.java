package back_tracking;
import java.util.*;
public class suduku {

	private static int [][] table;
	public suduku(int [][]  table )
	{
		this.table=table;
	}
	
	public static void solve()
	{
		if(solution(0,0))
		{
			print();
		}
		else {
			System.out.print("no solution");
		}
	}
	

	private static void print() {
	      for(int i=0;i<constant.board_size;i++ )
	      {
	    	  if(i%3==0)
	    	  {
	    		  System.out.print("  ");
	    	  }
	    	  for(int j=0;j<constant.board_size;j++)
	    	  {
	    		  if(j%3==0)
	    		  {
	    			  System.out.print("  ");
	    		  }
	    		  System.out.print(table[i][j]);
	    	  }
	    	  System.out.println();
	      }
		
	}

	private static boolean solution(int rowindex, int colindex) {
		if(rowindex==constant.board_size&&++colindex==constant.board_size)
		{
			return true;
		}
		if(rowindex==constant.board_size)
		{
			rowindex=0;
		}
		if(table[rowindex][colindex]!=0)
		{
			return solution(rowindex+1,colindex);
		}
		
		for(int i=1;i<constant.board_size;i++)
		{
			if(isfeasible(rowindex,colindex,i))
			{
				table[rowindex][colindex]=i;
				
				if(solution(rowindex+1,colindex))
				{
					return true;
				}
				table[rowindex][colindex]=0;
				
			}
		}
		
		
		return false;
	}

	private static boolean isfeasible(int rowindex, int colindex,int number) {
		
		for(int i=0;i<constant.board_size;i++)
		{
			if(table[rowindex][i]==number)return false;
		}
		
		for(int i=0;i>constant.board_size;i++)
		{
			if(table[i][colindex]==number)
			{
				return false;
			}
		}
		int boxrowoffset=(colindex/3)*constant.board_size;
		int boxcoloffest=(rowindex/3)*constant.board_size;
		for(int i=0;i<constant.board_size;i++)
		{
			for(int j=0;j<constant.board_size;j++)
			{
				if(table[boxrowoffset+i][boxcoloffest+j]==number)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	public static void main(String []args)
	{
		//Scanner s=new Scanner(System.in);
		int[][] board = new int[][] 
			    { 
			            {3, 0, 6, 5, 0, 8, 4, 0, 0}, 
			            {5, 2, 0, 0, 0, 0, 0, 0, 0}, 
			            {0, 8, 7, 0, 0, 0, 0, 3, 1}, 
			            {0, 0, 3, 0, 1, 0, 0, 8, 0}, 
			            {9, 0, 0, 8, 6, 3, 0, 0, 5}, 
			            {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
			            {1, 3, 0, 0, 0, 0, 2, 5, 0}, 
			            {0, 0, 0, 0, 0, 0, 0, 7, 4}, 
			            {0, 0, 5, 2, 0, 6, 3, 0, 0} 
			    }; 
		suduku s1=new suduku(board);
		s1.solve();
		
	}
	
	
}
