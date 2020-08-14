package cvdfv;

public class quicksort2 {
	public static int parition(int input[],int start,int end)
	{   int pivot=start;
	    int i=start;
	    int j=end;
	    int count=0;
	    for( i=start;i<end;i++)
	    {
	    	if(input[i]<input[pivot])
	    	{
	    		count++;
	    	   }
	      }
	   
	    for(i=start;i<end;)
	    {
	    	for(j=end;j>start;)
	    	{
	    		if(input[j]>input[pivot])
	    		{
	    			j=j-1;
	    		   }
	    		else if(input[i]<input[pivot])
	    		  {
	    			i=i+1;
	    		     }
	    		if(input[i]>input[j])
    			{  int temp=0;
    				temp=input[count];
    			  input[count]=input[pivot];
    			  input[count]=temp;
    			  
    		   }
    		
	    		if(i==pivot||j==pivot)
    			{
    				return pivot;
    			  }
	    	  }
	      }
	    return pivot;
		 
	}

    public static void quickSort(int []input,int start,int end)
    {
    	if(start>=end)
    	{
    		return;
    	}
    	int pivotposition=parition(input,start,end);
    	quickSort(input,start,pivotposition-1);
    	quickSort(input,pivotposition+1,end);
    }
	public static void main(String[] args) {
		int arr[]= {3,5,4,1,9,7,8};
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(arr[i]+" ");	
		}
		

	}
}
