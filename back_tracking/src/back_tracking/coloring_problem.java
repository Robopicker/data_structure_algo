package back_tracking;

public class coloring_problem {
	
	
	private static int  nvertex;
	private static int adjmatrix[][];
	private static int [] colors;
    private static int numcolor;
	
	
	coloring_problem(int adjmatrix[][],int numcolor)
	{    
		this.nvertex=adjmatrix.length;
		this.adjmatrix=adjmatrix;
		this.numcolor=numcolor;
		this.colors=new int[adjmatrix.length];
	}


public static void solve()
{
	if(issolve(0))
	{
		print();
	}else {
		System.out.print("their is no solution");
	}
}


private static void print() {
	
	for(int i=0;i<adjmatrix.length;i++)
	{
		System.out.println("colors of "+(i+1) +"    "+ colors[i]);
	}
	
	// TODO Auto-generated method stub
	
}


private static boolean issolve(int currentvertex) {
	  if(currentvertex==nvertex)
	  {     
		  return true;
		  }
			  for(int colorindex=1;colorindex<numcolor;colorindex++) 
			  {
			  if(isfiasble(currentvertex,colorindex))
			  {
				colors[currentvertex]=colorindex;
				  if(issolve(currentvertex+1))
				  {
					  return true;
				  }  
			  }
			  
		  }
		
	  
	
	// TODO Auto-generated method stub
	return false;
}


private static boolean isfiasble(int currentvertex, int colorindex) {
	// TODO Auto-generated method stub
	    for(int j=0;j<adjmatrix.length;j++)
	    {
	    	if(adjmatrix[currentvertex][j]==1&&colorindex==colors[j])
	    	{
	    		return false;
	    	}
	    }
	   
	return true;
}

}