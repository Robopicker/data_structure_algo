package cvdfv;

public class staircase {
//	public static int findWays(int n)
//	{  if(n==1||n==0)
//	{
//		return 1;
//	}
//	if(n==-1){ return 0;
//		
//	}
//	return findWays(n-1)+findWays(n-2)+findWays(n-3);
//	  }
	public static boolean checkAB(String input) {
		return checkABhelper(input,0);
	}
	public static boolean checkABhelper(String input,int startindex)
	{    if(input.charAt(0)!='a')
	    {
		return false;
	       }
		if(startindex==input.length()-1)
		  {
		   return true;	
		    }
     if(startindex==input.length())
     {   
       return true;
     }
		boolean ans=checkABhelper(input,startindex+1);
		if(input.charAt(0)=='a')
		{
			if(input.charAt(1)!='b'&&input.charAt(2)!='b')
			{   ans=false;
				return ans;
			}
		}

		else if(input.substring(1)=="bb")
		{
			if(input.substring(2)==""||input.charAt(2)=='a')
			{   ans=false;
				return ans;
		}
		   }
		return ans;
	}
	//abababa

	public static void main(String[] args) {
		boolean x=checkAB("abababa");
  System.out.println(x);

	}

}
