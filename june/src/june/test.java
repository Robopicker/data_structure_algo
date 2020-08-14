package june;
import java.util.*;
public class test {

	public static String replaceCharacter(String input, char c1, char c2) {
	     String output;
	     if(input.length()==1)
	       {
	        if(input.charAt(0)==c1)
	        {   
	          return c2+""; 
	        }
	         else return input;
	       }
      String ans=replaceCharacter(input.substring(1),c1,c2);
      if(input.charAt(0)==c1)
      {
              
        output=c2+ans;
      }else{
        
        output=input.charAt(0)+ans;
      }
      return output;
       

	}
	public static String removeConsecutiveDuplicates(String s) {
		   String output;
	      if(s.length()==1)
	        return s;
	      String ans=removeConsecutiveDuplicates(s.substring(1));
	      if(s.charAt(0)==ans.charAt(0))
	      {
	        output=s.charAt(0)+ans.substring(1);
	      }
	      else{
	        output=s.charAt(0)+ans;
	      }
	return output; 
		}
	  
	  public static String imp(int n)
	  {
		  if(n==1)
		  {
			  return "";
		  }
		  if(n==2)
	        {
	          return "abc";
	        }
	      else if(n==3)
	      {
	        return "def";
	      }
	      else if(n==4)
	      {
	        return "ghi";
	      }
	      else if(n==5)
	      {
	        return "jkl";
	      }
	      else if(n==6)
	      {
	        return "mno";
	      }
	      else if(n==7)
	      {
	        return "pqrs";
	      }
	      else if(n==8)
	      {
	        return "tuv";
	      }
	      else if(n==9)
	      {
	        return "wxyz";
	      }
	      else return "";	  
	  }
	  
	  public static String[] keypad(int n)
	  {
		  if(n==0)
		  {
			  String[] ans= {""};
			  return ans;
		  }
		  
		 int d=n%10;
		  String p[]=keypad(n/10);
		  String a=imp(d);

	      String output[]=new String[p.length*a.length()];
	      int count=0;
		  for(int i=0;i<p.length;i++)
		  {
			  for(int j=0;j<a.length();j++)
			  {
				  output[count++]=p[i]+a.charAt(j);
			  }
		  }
		  
		  return output;
	  }
	  
		public static int binarySearch(int input[], int element) {
			return binarysearch1(input,element,0,input.length-1);

			}
		  public static int binarysearch1(int input[],int element,int l,int r)
		  {   
		  if(l>r)
		  {
			  return -1;
		  }
		    
		 
		      int mid=(l+r)/2;
		      if(input[mid]==element)
		      {
		       return  mid;
		      }
		      else if(input[mid]>element)
		      {
		       return binarysearch1(input,element,l,mid-1);
		      }
		      else{
		      return binarysearch1(input,element,mid+1,r);
		      }
		      
		    }

		  public static String[] subsequence(String input){
		        
		      if(input.length()==0)
		      {   String []temp={""};
		        return temp;
		      }
		      String ans[]=subsequence(input.substring(1));
		         String output[]=new String[2*ans.length];
		      int count=0;
		      for(int i=0;i<input.length();i++)
		      {
		        for(int s=i+1;s<=input.length();s++)
		        {
		          output[count]=input.substring(i,s);
		          count++;
		        }
		      
		      }
		      for(int i=0;i<ans.length;i++)
		      {
		        output[count]=ans[i];
		        count++;
		      }
		   return output;
			}
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		  String p="abc";
		String []temp=  subsequence(p);
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
	}
}
