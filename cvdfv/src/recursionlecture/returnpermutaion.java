package recursionlecture;

public class returnpermutaion {

	   public static String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
	public static String[] permutationOfString(String input)
	{   
		return permutations(input,0,input.length()-1);
	
	}
	public static String[] permutations(String input,int startindex,int endindex)
	{
		if(input.length()==0)
		{
			String arr[]= {""};
			return arr;
		}
		
		String smalloutput[]=permutations(input.substring(1),startindex+1,endindex);
		String output[]=new String[2*smalloutput.length];
		for(int i=0;i<smalloutput.length;i++)
		{
			output[i]=input.charAt(0)+swap(smalloutput,i,i+1);
		  } 
		
		return output;
	}
	
	public static void main(String[] args) {
 String s[]=permutationOfString("abc");
 for(int i=0;i<s.length;i++)
 {  System.out.println(s[i]);
	}

}
}
