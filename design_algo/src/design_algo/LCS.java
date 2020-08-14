package design_algo;

import java.util.*;
import java.lang.*;
import java.io.*;

class LCS {
	 static int dp[][];
    public static int func(char []arr1,char [] arr2)
    {
        dp=new int[arr1.length+1][arr2.length+1];
         int max=0;
         for(int i=1;i<dp.length;i++)
         {
             for(int j=1;j<dp[i].length;j++)
             {
                 if(arr1[i-1]==arr2[j-1])
                 {
                     dp[i][j]=dp[i-1][j-1]+1;
                 }
                 else{
                     dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                 }
                 if(dp[i][j]>max)
                 {
                     max=dp[i][j];
                 }
             }
         }
         return max;
        
    }
    
   
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{     int l1=s.nextInt();
		    int l2=s.nextInt();
		      s.nextLine();
		    String str1=s.next();
		    String str2=s.next();
		    int ans=func(str1.toCharArray(),str2.toCharArray());
		    System.out.println(ans);
		}
	}
}