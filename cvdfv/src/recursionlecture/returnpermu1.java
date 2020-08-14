package recursionlecture;

public class returnpermu1 {

 	public static void printSubsets1(int input[],int ans[])
	{
		if(input.length==0)
		{
			System.out.println(input);
		   return;
		}
		   int s[]=new int[input.length-1];
		      for(int i=1;i<input.length;i++)
		       {
		        s[i-1]=input[i];
		        }
		   printSubsets1(s,ans);
		   int output[]=new int[input.length+1];
		   for(int i=0;i<input.length;i++)
		   {   if(i==0)output[0]=input[0]; 
			   output[i]=input[i];
		   }
		   printSubsets1(s,output);
	}
	
	public static void main(String[] args) {
        int ans[]= new int[8];
        int ques[]= {12,15,20};
		printSubsets1(ques,ans);
		for(int i=0;i<8;i++)
		{
			System.out.println(ans[i]);
		}

	}

}
