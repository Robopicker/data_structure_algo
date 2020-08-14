package recursionlecture;

public class permu {
	public static String[] permutations(String input) { 
	   return permutations("", input); 
         	}

	private static String[] permutations(String prefix, String input) {
	    int n = input.length();
	    if (n == 0) { 
	    	String p[]= {""};
	    	return p;
	     }
	    
	    else {
	        for (int i = 0; i < n; i++)
	        {
	         String sm[]=   permutations(prefix + input.charAt(i), input.substring(0, i) + input.substring(i+1, n));
	       
	       }
	   
	    }

	}
	public static void main(String[] args) {
	   String s[]=   permutations("xyz");
      for(int i=0;i<s.length;i++)
      {
    	  System.out.println(s[i]);
      }
	}

}
