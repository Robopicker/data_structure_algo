package back_tracking;

public class knight_tour {
	
	private static int [][]solution;
	 private static int xmoves[]={2,1,-1,-2,-2,-1,2,1};
	 private static int ymoves[]= {1,2,-1,-2,-2,-1,1,2};
	 private static int board_size;
	   public knight_tour(int m)
	   {    this.board_size=m; 
		   this.solution=new int[m][m];
		   for(int i=0;i<m;i++)
		   {
			   for(int j=0;j<m;j++)
			   {
				   this.solution[i][j]=Integer.MIN_VALUE;
			   }
		   }
	   }
	   
	   public static  void solve()
	   {     solution[0][0]=1;
		   if(solution(2,0,0))
		   {
			  print(); 
		   }
		   else {
			   System.out.print("no solution");
		   }
	   }

	private static void print() {
		// TODO Auto-generated method stub
		for(int i=0;i<solution.length;i++)
		{
			for(int j=0;j<solution[i].length;i++)
			{
				System.out.print(solution[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static boolean solution(int number, int x, int y) {
		if(number==board_size*board_size+1)
		{
			return true;
		}
		
		for(int nextx=0;nextx<xmoves.length;nextx++)
	     {      
	    	int nextposx=x+xmoves[nextx];
	    	int nextposy=y+ymoves[nextx];
	    	

			if(isfeasible(nextposx,nextposy))
	    	{
	    	   solution[nextposx][nextposy]=number;
	    	   
	    	   if(solution(number+1,nextposx,nextposy))
	    	   {
	    		   return true;
	    	   }
	    	   solution[nextposx][nextposy]=Integer.MIN_VALUE;
	    	}
	    	
	     }
	  
		return false;
	}

	private static boolean isfeasible(int x, int y) {
		// TODO Auto-generated method stub
		
		if(x<0||x>=board_size||y<0||y>=board_size)return false;
		if(solution[x][y]!=Integer.MIN_VALUE)return false;
		return true;
	}

}
