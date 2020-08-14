package back_tracking;
import java.util.*; 
public class rat_maz {
	 static int [][] arr;
	  static int  imove[]= {0,1,1};
	  static int jmove[]= {1,0,1};
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		 arr=new int[5][5];
		 
		 for(int i=0;i<5;i++)
		 {
			 for(int j=0;j<5;j++)
			 {
				 arr[i][j]=s.nextInt();
			 }
		 }
		  arr[0][0]=5;
		 if(!ans(0,0))
		 {
			 System.out.println(" no solution exist");
		 }
		 else {
			 
			 printans();
		 }
	}


	private static void printans() {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}


	private static boolean ans(int x, int y) {
		// TODO Auto-generated method stub
		 if(x==4&&y==4)
		 {
			 return true;
		 }
		 
		for(int k=0;k<3;k++)
		{
			int nexti=x+imove[k];
			int nextj=y+jmove[k];
			
			if(isSafe(nexti,nextj))
			{
				arr[nexti][nextj]=5;
				
				if(ans(nexti,nextj))
				{
					return true;
				}
				else {
					arr[nexti][nextj]=0;
					
				}
			}
		}
		 
		return false;
	}


	private static boolean isSafe(int i,int j) {
		
		return (i>0&&i<5&&j>0&&j<5&&arr[i][j]==0&&arr[i][j]!=5);
		
	}

}
