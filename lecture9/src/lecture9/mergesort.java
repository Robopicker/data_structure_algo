package lecture9;

public class mergesort {
  public static void mergeSort(int input[],int start,int end)
  {  if(start>=end)
     {
	   return;
        }
      int mid=(start+end)/2;
      mergeSort(input,start,mid);
      mergeSort(input,mid+1,end);
      merge(input,start,end);
      
  }
  public static void merge(int input[],int start,int end)
   { 
	  int mid=(start+end)/2;
   int temp[]=new int[end-start+1];
   int i=start;
   int j=mid+1;
   int k=0;
   while(i<=mid&&j<=end)
      {   if(input[i]>input[j])
         {   temp[k]=input[j];
    	       k=k+1;
    	       j=j+1;
           }
      else if(input[i]<input[j])
       {    temp[k]=input[i];
           k=k+1; 
           i=i+1; 
         }
	   
        }
   input=temp;
   }
 
	public static void main(String[] args) 
	{
	   int arr[]= {	1,23,12,32};
	      mergeSort(arr,0,arr.length-1);
	      for(int j=0;j<arr.length;j++)
	      {
	    	  System.out.print(arr[j]+" ");
	      }
	}

}
