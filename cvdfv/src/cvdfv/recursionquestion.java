package cvdfv;

public class recursionquestion {
	public static int checkNumberBetter(int input[]) {
		return checkNumberBetterHelper(input, 0);
	}
	public static int checkNumberBetterHelper(int input[], int startIndex) {
            
		if(startIndex == input.length) {
		
			return input[startIndex-1];
			
		}
	   
		
		else {
		   int smallAns = checkNumberBetterHelper(input,startIndex + 1);
		   if(input[0]>smallAns)
			{
				smallAns=input[0];
			   }
		   
		   return smallAns;
		}
	}
public static boolean sortarray(int arr[])
	{
		
	return sortarrayhelper(arr,0); 
	}
public static boolean sortarrayhelper(int input[],int startindex)
{
    
		if(startindex== input.length-1) {
		
			/*if(input[0]>input[1])       	  
	           {   return false;
	             }*/
			return true;
			
			
		}
		
		
		   boolean  Ans = sortarrayhelper(input,startindex + 1);
		          if(input[startindex]>input[startindex+1])       	  
		           {   Ans=false;
		             }
		           return Ans;     
             
}
public static int lastIndex(int input[], int x) {
	
	return lastIndexhelper(input,x,input.length-1);
}
//2, 6, 9,,4,5,6,9
  public static int lastIndexhelper(int input[],int x,int startindex)
  {  
	  //int Ans=lastIndexhelper(input,x,startindex+1);
	  if(startindex==0)
      {     
	         return -1;
        }
	 
	 int  Ans=lastIndexhelper(input,x,startindex-1);
	 if(input[startindex]==x)
	    {   
		    Ans=startindex;
	       }
    return Ans;
	     
    }
  
	public static void main(String[] args) {
		
   int arr[]= {2,6,9,9,4,5,6,9};
   int p=lastIndex(arr,9);
   
   System.out.println(p);
	}

}