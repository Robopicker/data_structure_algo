/*package whatever //do not write package name here */
package z_daa;
import java.util.*;
import java.lang.*;
import java.io.*;
class sort implements Comparator<String>
{
	public int compare(String str1,String str2)
	{
		return str1.compareTo(str2);
	}
}
	class GfG{
	
  	public static void main (String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      String arr[]=new String[n];
      int i=0;
      while(i<n)
      {
    	  arr[i++]=s.next();
      }
		Arrays.sort(arr, new sort());
		for(i =0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}