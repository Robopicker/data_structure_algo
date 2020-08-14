package lecture9;

public class returnsubsets {
	public static int[][] subsets(int[] input)
	{ 
	  if(input.length==0)
	    { int output[][]=new int[1][0];
		  return output;
	       }
	      int s[]=new int[input.length-1];
	      for(int i=1;i<input.length;i++)
	       {
	        s[i-1]=input[i];
	        }
	            int smalloutput[][]= subsets(s);
	            int output[][]=new int[2*smalloutput.length][];
				for(int i = 0; i < smalloutput.length; i++) {
					output[i] = new int[smalloutput.length];
		        for(int j=0;j<smalloutput[i].length;j++)
		          {  output[i][j]=smalloutput[i][j];
			       }
				}
				for(int i = 0; i < smalloutput.length; i++) {
				output[i+smalloutput.length]=new int[smalloutput[i].length+1];
				output[i+smalloutput.length][0]=input[0];
				for(int j = 0; j < smalloutput[i].length; j++)
				output[i + smalloutput.length][j+1] =  smalloutput[i][j];
				}
				
				return output;
	   }


	public static void main(String[] args) {
		int array[]= {12,15,20};
	int a[][]=	subsets(array);
   for(int i=0;i<a.length;i++)
   {
	  for(int j=0;j<a[0].length;j++)
	  {
		  System.out.println(a[i][j]);
	  }
   }
	}

}
