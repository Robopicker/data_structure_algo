package z_daa;

import java.util.*;

public class matrix1 {
	
public static	int gcd(int a,int b){ 
		 
	    if(b == 0) 
	        return a; 
	 
	    return gcd(b,a%b); 
	 
	} 
	 
public static	int modularInverse(int a){ 
	 
	    int r1 = 26,r2 = a,t1 = 0,t2 = 1; 

	 
	    while(r2 > 0){ 
	 
	        int q = r1/r2; 
	 
	        int r = (r1 - (q*r2)%26 + 26)%26; 
	        r1 = r2; 
	        r2 = r; 
	 
	        int t = (t1 - (q*t2)%26 + 26)%26; 
	        t1 = t2; 
	        t2 = t; 
	    } 
	 
	    return t1; 
	 
	} 
	 
	public static int find1(int [][] matrix)
	{    
		
		int sum=0;
	  int 	j=-1;
	  boolean flag=true;
		for(int i=0;i<3;i++)
		{
			  j++;
			int x=((matrix[(i+1)%3][(j+1)%3]*matrix[(i+2)%3][(j+2)%3])-(matrix[(i+1)%3][(j+1)%3]*matrix[(i+2)%3][(j+2)%3]));
			if(flag)
			{
		    sum +=(x*matrix[0][j]);
		    flag=!flag;
			}
			else {
			int z=-(x*matrix[0][j]);
			sum+=z;
			flag=!flag;
			}
		}
		
		
		
		
		return sum%26;
	
	}
	
  public static int[][] findinverse(int[][] matrix,int start,int end)
	{
		int a[][]=new int[3][3];
		
		
		for(int i=start;i<end;i++)
		{
			
		}
		return a;
	}
  
  public static int[][] findAdj(int [][]matrix)
  {
	  int newmatrix[][]=new int[3][3];
	 for(int i=0;i<3;i++)
	 {
		 boolean flag=true;
		 for(int j=0;j<3;j++)
		 {
			 int x=((matrix[(i+1)%3][(j+1)%3]*matrix[(i+2)%3][(j+2)%3])-(matrix[(i+1)%3][(j+1)%3]*matrix[(i+2)%3][(j+2)%3]));
			if(flag)
			{
				newmatrix[i][j]=x%26;
				flag=!flag;
			}
			else {
				
				newmatrix[i][j]=-x%26;
				flag=!flag;
			}
			
		 }
	 }
	 return newmatrix;
  }
  
  public static int[][] multiply(int ainv,int adjmatrix[][])
  {
	  for(int i=0;i<3;i++)
    {
	  for(int j=0;j<3;j++)
	  {
		  adjmatrix[i][j]=(adjmatrix[i][j]*ainv)%26;
		  
	  }
     }
	  return adjmatrix;
  }

  public static int[] multiply1(int[] extra,int matrix[][])
  {
	  int ans[]=new int[3];
	  
	  int c=0;
	  for(int i=0;i<3;i++)
	  {
		  for(int j=0;j<3;j++)
		  {
			  ans[c]=+(extra[c]*matrix[i][j])%26;
			  
		  }
		  c++;
	  }
	  return ans;
  }
	public static void main(String[] args) {
      
		Scanner s=new Scanner(System.in);
		int i=0;
		int j=0;
		int matrix[][]=new int[3][4];
		for(i=0;i<3;i++)
		{   int temp=0;
			for(j=0;j<3;j++)
			{
				 temp=s.nextInt();
				matrix[i][j]=temp%26;
				
			}
			
			temp=s.nextInt();
			matrix[i][3]=temp%26;
			
		}
		
		int A=find1(matrix);
		
		int Ainv=0;  
		//if(gcd(A,26)!=1)
	//	{
		//	System.out.println("no output inverse doesnot exist");
			//return ;
		//}
		//else
		{
			
			
		Ainv=modularInverse(A);	
		Ainv=3;
		int smallans[][]=new int[3][3];
		int adjmatrix[][]=findAdj(matrix);
		smallans=multiply(Ainv,adjmatrix);
		
		int extra[]=new int[3];
		int c=0;
		for( i=0;i<3;i++ )
		{
			extra[c]=matrix[i][3];
		}
		int ans[]=new int[3];
		
		
		
		   ans=  multiply1(extra,smallans);
		
		  for( i=0;i<3;i++)
	      {
			  System.out.println(ans[i]);
		   }
	 
		}
	}

}
