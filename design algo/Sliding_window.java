package design_algo;
import java.util.*;
public class Sliding_window {
	 
    // A Dequeue (Double ended queue) based method for printing maixmum element of
    // all subarrays of size k
   public static void printMax(int arr[],int n, int k)
    {
        // Create a Double Ended Queue, Qi that will store indexes of array elements
        // The queue will store indexes of useful elements in every window and it will
        // maintain decreasing order of values from front to rear in Qi, i.e., 
        // arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order
        Deque<Integer> Qi = new LinkedList<Integer>();
         
        /* Process first k (or first window) elements of array */
        int i;
        for(i = 0; i < k; ++i)
        {
            // For very element, the previous smaller elements are useless so
            // remove them from Qi
            while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();   // Remove from rear
             
            // Add new element at rear of queue
            Qi.addLast(i);
        }
         
        // Process rest of the elements, i.e., from arr[k] to arr[n-1]
        for( ;i < n; ++i)
        {
            // The element at the front of the queue is the largest element of
            // previous window, so print it
            System.out.print(arr[Qi.peek()] + " ");
             
            // Remove the elements which are out of this window
            while((!Qi.isEmpty()) && Qi.peek() <= i-k)
                Qi.removeFirst();
             
            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
             
 
            // Add current element at the rear of Qi
            Qi.addLast(i);
             
        }
         
        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }
	
	
	public static void main( String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		System.out.println();
		printMax(arr,n,k);
		
		
	}
	

	private static void printmax(int[] arr, int k) {
		
		Deque<Integer> queue=new LinkedList<Integer>();
		int i=0;
		for(i=0;i<k;++i)
		{
			while(!queue.isEmpty()&&arr[i]>=arr[queue.peekLast()])
			{
				queue.removeLast();
			}
			queue.addLast(i);
		}
		for(;i<arr.length;++i)
		{
			System.out.print(arr[queue.peek()]+" ");
			while(!queue.isEmpty()&&queue.peek()<=i-k)
			{
				queue.removeFirst();
			}
			while(!queue.isEmpty()&&arr[i]>=arr[queue.peekLast()])
			{
				queue.removeLast();
			}
			queue.addLast(i);
			
			
		}
		System.out.print(arr[queue.peek()]+" ");
		
		
	}
}
