package back_tracking;

import java.util.*;
class Node4
{
	int x;
	int y;
	public Node4(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
public class rat_in_middle {
    static int arr[][];
    static int count=0;
    static boolean visited[][];
     static final int row[] = { 1, 0, -1, 1 };
	 static final int col[] = { 0, -1, 0, 0 };    
	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  arr=new int[6][6];
	  visited=new boolean[6][6];
	  for(int i=0;i<6;i++)
	  {
		  for(int j=0;j<6;j++)
		  {
			  arr[i][j]=s.nextInt();
		  }
	  }
	  int x=s.nextInt();
	  int y=s.nextInt();
	  if(ans(x,y))
	  { System.out.println();
		System.out.println(count);  
	  }
	  else {
		  System.out.println("no solution exists");
	  }

	}
	private static boolean ans(int x, int y) {
		Queue<Node4> queue=new ArrayDeque<>();
		   Node4 newnode=new Node4(x,y);
		   visited[x][y]=true;
		 queue.add(newnode);
		
		 while(!queue.isEmpty())
		 {   
			 Node4 data=queue.peek();
			   if(isEnd(data.x,data.y))
			   {
				    count=count(x,y,data.x,data.y);  
				   
				   return true;
			   }
			   queue.poll();
			   System.out.println(data.x+" "+data.y);
			  for(int i=0;i<4;i++)
			  {
				  int nextx=data.x+row[i];
				  int nexty=data.y+col[i];
				  if(isSafe(nextx,nexty)&&!visited[nextx][nexty])
				  {
					  
					  
					  visited[nextx][nexty]=true;
					  Node4 new1=new Node4(nextx,nexty);
					 
					  
					  queue.add(new1);
					 
				  }
			  }
			   
			   
		 }
		 
		
		
		return false;
	}
	
	private static int count(int x, int y, int x2, int y2) {
		if(x==x2)return Math.abs(y-y2);
		else if(y==y2)return Math.abs(x-x2);
		else return Math.abs(x-x2)+Math.abs(y-y2);
		
	
	}
	private static boolean isSafe(int nextx, int nexty) {
		
		return nextx>=0&&nextx<6&&nexty>=0&&nexty<6&&arr[nextx][nexty]==1;
	}
	public static boolean isEnd(int x,int y)
	{
		if(x==0) {
			for(int i=0;i<6;i++)
			{
				if(i==y)
					return true;
			}
		}
			else if(y==0)
			{
	            for(int i=0;i<6;i++)
	            {
	            	if(i==x)return true;
	            }
			}
			else if(x==5)
			{
				for(int i=0;i<6;i++)
				{
					if(y==i)return true;
				}
			}
			else if(y==5)
			{
				for(int i=0;i<6;i++)
				{
					if(x==i)return true;
				}
			}
		
		return false;
		
	
	}
	
	

}
