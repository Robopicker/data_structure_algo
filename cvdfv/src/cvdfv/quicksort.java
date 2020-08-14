package cvdfv;

public class quicksort {
	public static  int partition(int arr[], int low, int high)
	    {
	        int pivot = arr[high]; 
	        int i = (low-1); // index of smaller element
	        for (int j=low; j<high; j++)
	        {
	            // If current element is smaller than or
	            // equal to pivot
	            if (arr[j] <= pivot)
	            {
	                i++;
	 
	                // swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	 
	        // swap arr[i+1] and arr[high] (or pivot)
	        int temp = arr[i+1];
	        arr[i+1] = arr[high];
	        arr[high] = temp;
	 
	        return i+1;
	    }
	    public static void quickSort2(int []input,int start,int end)
    {
    	if(start>=end)
    	{
    		return;
    	}
    	int pivotposition=partition(input,start,end);
    	quickSort2(input,start,pivotposition-1);
    	quickSort2(input,pivotposition+1,end);
    }
		public static void quickSort(int[] input) {
		quickSort2(input,0,input.length-1);
		}
	public static void main(String[] args) {
		int arr[]= {3,5,4,10,9,7,8};
		quickSort(arr);
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(arr[i]+" ");	
		}
		

	}

}
