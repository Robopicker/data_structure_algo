package design_algo; 
import java.util.*; 

class Max_Min { 
    static int max;static int min;
	public static void maxmin(int a[] ,int i, int j)
	{
	 int max1, min1, mid;
	 if(i==j)
	 {
	  max = a[i];
			  min = a[i];
	 }
	 else
	 {
	  if(i == j-1)
	  {
	   if(a[i] <a[j])
	   {
	    max = a[j];
	    min = a[i];
	   }
	   else
	   {
	    max = a[i];
	    min = a[j];
	   }
	  }
	  else
	  {
	   mid = (i+j)/2;
	   maxmin(a,i, mid);
	   max1 = max; min1 = min;
	   maxmin(a,mid+1, j);
	   if(max <max1)
	    max = max1;
	   if(min > min1)
	    min = min1;
	  }
	 }
	}


 public static void main(String[] args) 
 { 
 int arr[] = {2, 3, 4, 5, 7}; 
 int n = arr.length; 
  
   max=arr[0];
   min=arr[0];
   maxmin(arr,1,n-1);
   System.out.println("max: "+max);
   System.out.println("min"+min);
 } 
} 