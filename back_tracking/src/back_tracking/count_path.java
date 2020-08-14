package back_tracking;

import java.util.*;

public class count_path {
   
	static int [][] arr;
	static boolean [][] visited;
	static int xmove[]= {0,1};
	static int ymove[]= {1,0};
	  static int count=0;
	public static void main(String[] args) {
		
		arr=new int[4][4];
		visited=new boolean[4][4];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		ans(0,0,3,3);
	     if(count==0)
	     {
	    	 System.out.println("no solution exist");
	     }
	     else System.out.println(count);
	     
		
	}
 
	private static void ans(int x, int y,int destx,int desty) {
		if(x==destx&&y==desty)
		{
			count++;
			return ;
		}
		visited[x][y]=true;
		for(int i=0;i<2;i++)
		{
			int nextx=x+xmove[i];
			int nexty=y+ymove[i];
			
			if(isSafe(nextx,nexty))
			{
			  ans(nextx,nexty,destx,desty);
			}
			
			
			
		}
		visited[x][y]=false;
		
	
		
	}
	
	public static boolean isSafe(int x,int y)
	{
		return ((x>=0&&x<4&&y>=0&&y<4)&&(arr[x][y]==0));
	}

}
