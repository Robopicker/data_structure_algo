package array;
import java.util.Scanner;
public class duplicatearray {
   private static Scanner s;
   public static int FindUnique(int arr[])
   {  int uniqueElement=0;
	   for(int i=0;i<arr.length;i++)
	   {
		   boolean isunique=true;
		   for(int j=0;j<arr.length;j++)
		   {
			   if(i!=j&&arr[i]==arr[j])
			   {
				   isunique=false;
			   }
		   }
	   
	   if(isunique)
	   {
		   uniqueElement=arr[i];
		   break;
	   }
	   
	   }
   return uniqueElement;
	   }
	public static void main(String[] args) {
		
		
	}

}
