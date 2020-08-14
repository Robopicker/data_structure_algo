package cvdfv;

public class subseqeunce {
//	  public static String option(int n)
//	  {
//		  String option[]= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//		  return option[n];
//	  }
public static int[][] subsets(int[] input) {
		return subsetshelper(input,0,input.length); 
	
	}
public static int[][] subsetshelper(int[] input,int startindex,int endindex)
{ if(startindex==endindex)
   { int output[][]=new int[0][0];
	return output;
     }
   int smalloutput[][]= subsetshelper(input,startindex+1,endindex);
            int output[][]=new int[2*smalloutput.length][];
//			String output[] = new String[2 * smallOutput.length];
//			// Copy
			for(int i = 0; i < 2*smalloutput.length; i++) {
				for(int j = 0; j < smalloutput.length; j++)
				output[i][j] = smalloutput[i][j];
			}
			// Copy and append First char
			for(int i = 0; i < 2*smalloutput.length; i++) {
				for(int j = 0; j < smalloutput.length; j++)
				output[i + smalloutput.length][j] = input[0] + smalloutput[i][j];
			}
			
			return output;
   }


public static void main(String[] args) {
	int arr[]= {1,2,3};
  subsets(arr);
  for(int i=0;i<arr.length;i++)
  {    for(int j=0;j<arr.length;j++)
	  System.out.println(arr[i]+" ");
     }	
}
}
