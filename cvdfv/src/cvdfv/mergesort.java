package cvdfv;

public class mergesort {
public static void mergeSort(int [] input)
{  
	int n=input.length;
   int mid =n/2;
   if(n<=1)
   {  
	   // int arr[]=new int[0];
	   return;                                                     
  }
   
    int left[]=new int[mid];
    int right[]=new int[n-mid];
    for(int i=0;i<mid;i++)
    {
    	left[i]=input[i];
    	}
   for(int k=mid;k<n;k++) 
   {
	   right[k-mid]=input[k];
   }
   mergeSort(left);
    mergeSort(right);
     mergeArray(left,right);
}
public static void mergeArray(int [] left,int []right)
{   int i=0;int j=0;
    int k=0;
	int ln=left.length;
	int rn=right.length;
	int p=ln+rn;
	int newarray[]=new int[p];
	while(i<ln&&j<rn)
	{
		if(left[i]<=right[i])
		{
			newarray[k]=left[i];
			  i=i+1;
		}
		else { newarray[k]=right[j];
		         j=j+1;
		   }
		k=k+1;
	}
	while(i<ln) {newarray[k]=left[i];i=i+1;k=k+1;}
	while(j<rn) {newarray[k]=right[j];j=j+1;k=k+1;}
	     
	
	
}

	public static void main(String[] args) {
		int arr[]= {1,2,3,9,8,6,5};
	  mergeSort(arr);
	  for(int i=0;i<arr.length;i++)
	  {
		  System.out.print(arr[i]+" ");
	     }	
 }

}
