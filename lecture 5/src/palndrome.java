
public class palndrome {
	public static String reverseEachWord(String input) {
		String p="";String a1="";
		int x=1,j=0;
		int count=0;
		for(int i=0;i<input.length();i++)
		    {   if(input.charAt(i)!=' ')
		    {      count=count+1;
		    	continue;
		    }
		    
	       while(count>j)
	       {
	    	   a1=a1+input.charAt(count);
	    	   count--;
	       }
	       j=count+1;
	       
	       
//		for(int j=count;j>0;j++)
//		{
//		   for(int a=x+1;a>0;a--)
//		     {
//		    	char c=input.charAt(a);
//		    	p=p+c; 
//		    }
//		}
		    }
		return p;
	}
//	public static void printSubstrings(String str)
//	{
////		System.out.println(str.substring(0));
//		for(int i=0;i<str.length();i++)
//		{
//		   //System.out.println(str.substring(0,i+1));
//		
//		for(int j=i;j<str.length();j++)
//		{   
//			System.out.println(str.substring(i,j+1));
//		}
//		}
//		
//		//System.out.println(str.charAt(str.length()-1));
//	}
//	public static int countWords(String str) {
//		int count =1;
//		if(str.isEmpty())
//		{
//			count=0;
//			return count;
//		}
//		for(int i=0;i<str.length();i++)
//		{
//			if(str.charAt(i)==' ')
//			{
//				count =count +1;
//			}
//		}
//		return count;
//	}
//	public static String replaceCharacter(String input, char c1, char c2) {
//		String p="";
//		for(int i=0;i<input.length();i++)
//        {
//          if(input.charAt(i)!=c1)
//          {
//             p=p+input.charAt(i);
//          }
//          else
//        	  p=p+c2;
//           /* Your class should be named Solution
//		 * Don't write main().
//		 * Don't read input, it is passed as function argument.
//		 * Return output and don't print it.
//		 * Taking input and printing output is handled automatically.
//		 */
//     
//	}
//		return p;
//	}
//	public static  boolean checkPalindrome(String str){
//	    String p="";
//	    for(int i=str.length()-1;i>=0;i--)
//	    {  
//	    	char x=str.charAt(i);
//	    	p=p+x;
//	    }
//	    
//	    if(p.equals(str))
//	    {
//	    	return true;
//	    }
//	    
//		return false;
//		
//   	
//	  }
	public static void main(String[] args)
	{ String s="my name is yogesh";
	    s= reverseEachWord(s); //printSubstrings(s); 
	     for(int i=0;i<s.length();i++)
	     {
	    	 System.out.print(s.charAt(i));
	     }
	   
	        
	   //boolean c=checkPalindrome(s);
	  
	}
	
	}



