package june;
import java.util.*;

public class string {

	public static void Copy(String s)
	
	{
		String p="";
		for(int i=0;i<s.length();i++)
		{
			p=p+s.charAt(i)+" ";
		}
	}
	public static void reverse(String s)
	{
	   String p= "" ;
	   for(int i=s.length()-1;i>=0;i--)
	   {
		  p+=s.charAt(i);   
	   }
	    
	   for(int i=0;i<s.length();i++)
	   {
		   System.out.print(p.charAt(i)+" ");
	   }
	}
	public static void reversewithoutd(char str[])
	{
		int l=0,r=str.length-1;
		while(l<r)
		{
			 if (!Character.isAlphabetic(str[l]))
	                l++;
	            else if(!Character.isAlphabetic(str[r]))
	                r--;
	 
	            // Both str[l] and str[r] are not spacial
	            else
	            {
	                char tmp = str[l];
	                str[l] = str[r];
	                str[r] = tmp;
	                l++;
	                r--;
	            }
		}
	}
	public static char[] removeDuplicate(char str[])
	{      int index=0;
		int i=0;
		for(i=0;i<str.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(str[i]==str[j])
				{
				  break;	
				}
				if(i==j)
				{
					str[index++]=str[i];
				}
			}
			
		}
		return str;
	}
	public static void substring(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				System.out.println(s.substring(i,j));
			}
		}
	}
	public static void substring2(String s)
	{
		for(int i=1;i<=s.length();i++)
		{
			for(int j=0;j<=s.length()-i;j++)
			{  int end=j+i;
				System.out.println(s.substring(j,end));
			}
		}
		
			}
	public static void reverseEachWord(String s)
	{
		String ans="";
		int start=0;
		int end=0;
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!= ' ')
			{    
				continue;
			}
			else if(s.charAt(i)==' ')
			{
			    end=i-1;
			   temp= reverse(s,start,end);
			   ans=ans+temp+" ";
			   start=i+1;
			}
			else if(i==s.length())
			{
				temp=s.substring(start);
				ans=ans+temp+" ";
			}
			
		}
		for(int i=0;i<ans.length();i++)
		{
			System.out.print(ans.charAt(i));
		}
	}
	public static String reverse(String s,int start,int end)
	{
		String ans="";
		for(int i=start;i<=end;i++)
		{
			ans=s.charAt(i)+ans;
		}
		return ans;
	}
	public static String minLengthWord(String input){
		String temp="";
      int count=0;
      int currentstart=0;
      int min=Integer.MAX_VALUE;
      int start=0;
      for(int i=0;i<input.length();i++)
      { 
        if(input.charAt(i)== ' ')
       
       {
        	int currentlength=i-currentstart;
        	if(currentlength<min)
        	{
        		min=currentlength;
        		start=currentstart;
        	}
        

       }
        currentstart=i+1;
      }
      if(minlength==-1)
      return temp;

	}
	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
      if(input1.length()==input2.length())
      {
          int freq[]=new int[256];
        for(int i=0;i<input1.length();i++)
        {
             int t =(int)input1.charAt(i);
          freq[t]++;
          
        }
        for(int i=0;i<input2.length();i++)
        {
          int t= (int)input2.charAt(i);
          freq[t]--;
        }
        for(int i:freq)
        {
        	if(i!=0)
        	{
        		return false;
        	}
        }
       
      }
      else{
        return false;
      }
      return true;
        
	}
	public static String compress(String inputString) {
		int freq[]=new int[256];
		String ans="";
		for(int i=0;i<inputString.length();i++)
		{
			int temp=inputString.charAt(i);
			freq[temp]++;
		}
		for(int i=0;i<256;i++)
		{
			System.out.print(freq[i]);
		}
		for(int i=0;i<inputString.length();i++)
		{   int temp=inputString.charAt(i);
			if(freq[temp]!=0)
			{
				if(freq[temp]>1)
				{
					ans+=inputString.charAt(i)+(char)freq[temp];
					freq[temp]=0;
				}
				else {
					ans+=(char)inputString.charAt(i);
					freq[temp]=0;
				}
			}
		}
		
      return ans;
	}
	public static void main(String []args)
	{
		String s="aabbccaa";
	 String ans=compress(s);
		for(int i=0;i<ans.length();i++)
		{
			System.out.print(ans.charAt(i)+" ");
		}
	}
	
}
