package lecture9;

public class printsubsets {
	public static void printSubsets(int input[],int ans[][])
	{
		if(input.length==0)
		{
			System.out.println(ans);
		   return;
		}
		   int s[]=new int[input.length-1];
		      for(int i=1;i<input.length;i++)
		       {
		        s[i-1]=input[i];
		        }
		   printSubsets(s,ans);
		   int output[][]=new int[2*input.length][];
       for(int i=0;i<input.length;i++)
       {
    	   output[i]=new int[s.length];
         }
       for(int i=0;i<input.length;i++)
       {
    	   output[i][j]= new int[i]
       }

		   printSubsets(s,output);
	}
	public static void main(String[] args) {
	  int arr[]= {12,15,20};
	  int ans[][]=new int[8][4];
		printSubsets(arr,ans);
		

	}

}
