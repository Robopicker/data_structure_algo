package back_tracking;
import java.util.*;
public class Hamilton {

	private static int nvertex;
	private static int [] hamiltonpath;
	private static int [][]adjmatrix;
	public Hamilton(int [][]adjmatrix)
	{
		nvertex=adjmatrix.length;
	   this.adjmatrix=adjmatrix;
	   this.hamiltonpath=new int[adjmatrix.length];
	  this.hamiltonpath[0]=0;
	  
	  
	}
	public static void solve()
	{
		 if(isolution(1))
		   {
			   print();
		   }
		   else {
			   System.out.print("there is no solution");
		   }
	}
	private static  void print() {
		// TODO Auto-generated method stub
		for(int i=0;i<hamiltonpath.length;i++)
		{
			System.out.print(hamiltonpath[i]+" ");
		}
		System.out.print("0 ");
		
	}
	private static boolean isolution(int position) {
		// TODO Auto-generated method stub
		if(position==nvertex)
		{   if(adjmatrix[hamiltonpath[position-1]][hamiltonpath[0]]==1)
			
			return true;
		}
		for(int vertexindex=1;vertexindex<nvertex;vertexindex++)
		{
			if(ispossible(vertexindex,position))
			{
				hamiltonpath[position]=vertexindex;
				if(isolution(position+1))
				{
					return true;
				}
				//backtrack;
			}
			
		}
		
		return false;
	}
	private static boolean ispossible(int vertexindex, int actualposition) {
		// TODO Auto-generated method stub
		if(adjmatrix[hamiltonpath[actualposition-1]][vertexindex]==0)
		{
			return false;
		}
	for(int i=0;i<actualposition;i++)
	{
		if(hamiltonpath[i]==vertexindex)
		{
			return false;
		}
	}
		
		return true;
	}
	
	
}
