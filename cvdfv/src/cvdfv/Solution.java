package cvdfv;
import java.util.Scanner;
public class Solution {

private static Scanner patternnumber;
	public static void main(String[] args) {
				patternnumber = new Scanner(System.in);
	   int N=patternnumber.nextInt();
	   int count=1;
//	   int val=0;
	   int flag=0;
	   int i=0;
	   for( i=1;i<=N;i++) {
		   for(count=2;count<=2*N;count++)
	   {      if(i>1&&i<=N-N/2)
	            {  for(count=2;count<=4;count++) {
		           System.out.print(" ");}
		           
	                  }
	     if(i>N-N/2) {
	    	 for(count=N-i;count>1;count--) {
	    		 System.out.print(" ");
	    	 }
	     }
			   if(count%2==0) 
			   System.out.print("*");
			   else {  
			   System.out.print(" ");}
			   
			   //	        val=val+1;
		    }
	   System.out.print("\n");
} 
/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		
	}

}
