package cvdfv;

public class timecomplexity {
	public static int recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
        
        if (start < end) {
            int mid = start + (end - start) / 2;  
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid, key);
                 
            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid+1, end , key);
                 
            } else {
                return mid;   
              }
        }
        return -1;  
    }
	public static void main(String[] args)
	{ int sortedArray[]= {2};
		int x= recursiveBinarySearch( sortedArray, 0,sortedArray.length-1,9 );
		System.out.println(x);
	}
}
