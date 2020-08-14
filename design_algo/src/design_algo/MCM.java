package design_algo;

import java.util.*;
import java.lang.*;
import java.io.*;

class MCM {
     static int MatrixChainOrder(int p[], int n) 
    { 
        
        int m[][] = new int[n][n]; 
  
        int i, j, k, L, q; 
  
        for (i = 1; i < n; i++) 
            m[i][i] = 0; 
  
      
        for (L=2; L<n; L++) 
        { 
            for (i=1; i<n-L+1; i++) 
            { 
                j = i+L-1; 
                if(j == n) continue; 
                m[i][j] = Integer.MAX_VALUE; 
                for (k=i; k<=j-1; k++) 
                { 
                    
                    q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j]; 
                    if (q < m[i][j]) 
                        m[i][j] = q; 
                } 
            } 
        } 
  
        return m[1][n-1]; 
    } 
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int n=s.nextInt();
		    int p[]=new int[n];
		    for(int i=0;i<n;i++)
		      p[i]=s.nextInt();
		     
		   /*  int m[][]=new int[n][n];
		     int j=0,min;
		      for(int d=1;d<n-1;d++)
		      {
		          
		          for(int i=1;i<n-d;i++)
		          {
		                j=i+d;
		              m[i][j]=Integer.MAX_VALUE;
		               for(int k=i;k<j-1;k++)
		               {
		                   int q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j]; 
                    if (q < m[i][j]) 
                        m[i][j] = q; 
		               }
		              
		                
		          }
		          
		      }
		     */
		       System.out.println(MatrixChainOrder(p,n));
		}
	}
}
