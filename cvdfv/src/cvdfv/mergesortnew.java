package cvdfv;

public class mergesortnew {
	// intially - start = 0, end = length - 1
		public static void mergeSort(int input[], int start, int end) {
			if(start >= end) {
				return;
			}
			// Find Mid and split around split
			int mid = (start + end) / 2;		
			// Sort Part 1
			mergeSort(input, start, mid);
			// Sort Part 2
			mergeSort(input, mid + 1, end);
			merge(input, start,mid, end);
			// Merge two sorted parts
		}


		public static void merge(int input[], int start,int mid ,int end) {
			int n1=mid-start+1;
			int n2=end-mid;
		    int L[] = new int [n1];
	        int R[] = new int [n2];
	        for (int i=0; i<n1; ++i)
	            L[i] = input[start + i];
	        for (int j=0; j<n2; ++j)
	            R[j] = input[mid+ 1+ j];
	     
	        int i = 0, j = 0;
	        int k = 1;
	        while (i < n1 && j < n2)
	        {
	            if (L[i] <= R[j])
	            {
	                input[k] = L[i];
	                i++;
	            }
	            else
	            {
	                input[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1)
	        {
	            input[k] = L[i];
	            i++;
	            k++;
	        }
	        while (j < n2)
	        {
	            input[k] = R[j];
	            j++;
	            k++;
	        }
		
		}
		public static void main(String[] args) {
			int arr[]= {1,2,3,9,8,6,5};
		  mergeSort(arr,1,7);
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print(arr[i]+" ");
		     }	
	 }


}
