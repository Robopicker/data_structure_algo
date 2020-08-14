package design_algo;

public class recursion {

	public static String[] permutation(String input)
	{
		if(input.length()==0)
		{
			String [] ans= {""};
			return ans;
		}
		if(input.length()==1)
		{
			String small[]= {input};
			return small;
		}
		for(int i=0;i<input.length();i++)
		{
		   char attach=input.charAt(i);
		   String sub="";
		   for(int j=0;j<i-1;j++)
		   {
			   sub=sub+input.charAt(j);
		   }
		   for(int j=i+1;j<input.length();j++)
		   {
			   sub=sub+input.charAt(j);
		   }
		   
		   String[] smallans = permutation(sub);
		   String [] output=new String[smallans.length*input.length()];
		   int count=0;
		   for(int small=0;small<smallans.length;small++)
		   {
		   for(int k=0;k<smallans.length+1;k++)
		   {  
			   String string_i=smallans[small];
			   String finals="";
			    
			for(int j=0;j<k-1;j++)
		      {
			      finals=finals+string_i.charAt(j);
		       }
			finals=finals+attach;
		   for(int j=k+1;j<input.length();j++)
		      {
		        finals=finals+string_i.charAt(j);
		        		
		         }
			  output[count]=finals;
			  count++;
			  
		   }
		   }
		   return output;
		}
		
		String [] ans= {""};
		return ans;
	}
	
	public static void main(String []args)
	{
		String s="abc";
		 String[]ans=  permutation(s);
		 for(int i=0;i<ans.length;i++)
		 {
			 System.out.println(ans[i]);
		 }
	}
	
}
