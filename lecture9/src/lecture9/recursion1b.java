package lecture9;

public class recursion1b {
	public static String replace(String input){
	
		if(input.length()==0)
		{   
			return "";			
		}
		if(input.length()==1)
		{
			return input;
		}
		String substring=replace(input.substring(1));
		if(input.charAt(0)=='p')
	      	{ if(substring.charAt(0)=='i')
			  {  String p="3.14";   
		     	 return p+input.substring(2);
			    }
			 }
		
		return input.charAt(0)+substring;
	
	}
	public static int binarySearch(int input[], int element)
	{   
		int x=binarySearchHelper(input,0,input.length-1,element);
		return x;
	}
	public static int binarySearchHelper(int input[],int startindex,int endindex,int element)
	{   if(startindex==input.length)
	    {
		  return -1; 
      	  }
		if(input[endindex]==element)
		{
		
		  return endindex;
		}
	
		int smallinput=binarySearchHelper(input,startindex+1,endindex-1,element);
			    if(startindex<endindex) 
				{  int mid=(startindex+endindex)/2;
			       if(input[mid]==element)
			       {   
			    	   return mid;
			       }
				}
			    return smallinput;
		//		int mid=0;
//	      int start=0;
//	      int end=input.length-1;
//	      
//	      while(start<=end)
//	      {   mid=(start+end)/2;
//	        if(input[mid]<element)
//	        {
//	           start=mid+1;
//	        }
//	       if(input[mid]==element)
//	       {
//	         return mid;
//	       }
//	        if(input[mid]>element)
//	        {
//	          end=mid-1;
//	        }
//	        
//	      }
//	      return -1;
		}
	
	
	

	public static String removeX(String input){
	if(input.length()==0)
	    {   String s="";
	        return s;      		
 	      }
	String substring=removeX(input.substring(1));
	if(input.charAt(0)=='x')
	{   String s="";
		return s+substring;
	}
	return input.charAt(0)+substring;
	}
	public static String addStars(String s) {
	if(s.length()==0)
	{
		String q="";
		return q;
	}
	if(s.length()==1)
	{
	   return s;
	}
	String substring=addStars(s.substring(1));
	  if(s.charAt(0)==substring.charAt(0))
	  { 
	     return s.charAt(0)+"*"+substring;
		  
	  }
	  return s.charAt(0)+substring;
	}
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if(disks==1)
        { 
           System.out.println(source+" "+destination);
          return ;
        }
      towerOfHanoi(disks-1,source,destination,auxiliary);
      System.out.println(source+" "+auxiliary);
      towerOfHanoi(disks-1,auxiliary,destination,source);
	}
	public static int convertStringToInt(String input){
	   
	  return convertStringToInthelper(input,0);
	}
	public static int convertStringToInthelper(String input,int startindex)
	{
		if(input.length()==0)
		{
			return 0;
		}
		if(input.length()!=1)
		{  int x=0;
			 x=(x*10)+Integer.parseInt(input);
			return x;
		}
		int s=convertStringToInthelper(input,startindex+1);
		      
			
		return s;
	}
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
		boolean ans=checkABhelper(input,startindex+1);
		if(input.charAt(0)=='a')
		{
			if(input.substring(1)=="b"||input.substring(1)=="bb")
			{
				return true;
			}
		}
		else if(input.substring(1)=="bb")
		{
			if(input.substring(2)==""||input.substring(2)=="a")
			{
				return true;
			}
		   }
		return ans;
	}
	public static int findWays(int n)
	{
		if(n==1)
        {
          return 1;
        }
      if(n==0)
      {
        return 0;
      }
     int x=findWays(n-1);
         if(n>1)
         {
        	 int count =0;
        	 count=count+1;
         }
      return x;
	}
	 public static String removeConsecutiveDuplicates(String s) {
		  if(s.length()==0)
		  {
			  return "";
		  }
		  if(s.length()==1)
		  {
			  return s;
		  }
		  String smallinput=removeConsecutiveDuplicates(s.substring(1));
		  if(s.charAt(0)==smallinput.charAt(0))
		  {
			  return  s.charAt(0)+smallinput.substring(1);
		  }
		  return s.charAt(0)+smallinput;
	  }
	public static void main(String[] args) {
//	  int input[]= {1,2,3,4,5,6,3,4,9,10,20};
//  int p=binarySearch(input,10);
//	  System.out.println(p);
//	int x=  convertStringToInt( "1234");
	//System.out.println(x);
//		boolean A=checkAB("abb");
	//System.out.println(A);
//		int z=findWays(4);
//		System.out.println(z);
	String s=removeConsecutiveDuplicates("abbaaba");
	System.out.println(s);
	}

}
