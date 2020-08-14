package back_tracking;
import java.util.*;
public class Nqueen {

	private static int nqueen;
	private static int queenmatrix[][];
	public Nqueen(int numqueen)
	{
		this.nqueen=numqueen;
		queenmatrix=new int[numqueen][numqueen];
	}
	
	public static void solve()
	{
		if(setqueen(0))
		{
			print();
		}
		else {
			System.out.print("there is no solution");
		}
	}

	private static void print() {
		
		for(int i=0;i<nqueen;i++)
		{
			for(int j=0;j<nqueen;j++)
			{
				if(queenmatrix[i][j]==1)
				{
					System.out.print(" * ");
				}
				else {
					System.out.print(" - ");
				}
			}
				System.out.println();
			}
		  System.out.println();
		}
		// TODO Auto-generated method stub
		
	

	private static boolean setqueen(int colindex) {
		if(colindex==nqueen)
		{
			return true;
		}
		
		for(int rowindex=0;rowindex<nqueen;++rowindex)
		{
			if(isplaced(rowindex,colindex))
			{
				queenmatrix[rowindex][colindex]=1;
				
				if(setqueen(colindex+1))
				{
					return true;
				}
				//backtrak
				queenmatrix[rowindex][colindex]=0;
			}
				
		}
		
		return false;
	}

	private static boolean isplaced(int rowindex, int colindex) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<colindex;i++)
		{ if(queenmatrix[rowindex][i]==1)
		{
			return false;
		}
		}
		for(int i=rowindex, j=colindex;i>=0&&j>=0;i--,j--)
		{
			if(queenmatrix[i][j]==1)
			{
				return false;
			}
		}
		for(int i=rowindex,j=colindex;i<queenmatrix.length&&j>=0;i++,j--)
		{
			if(queenmatrix[i][j]==1)return false;
		}
		
		
		
		return true;
	}
	
	
}
