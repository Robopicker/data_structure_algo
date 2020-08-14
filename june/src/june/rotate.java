package june;

public class rotate {

	static void rotate(int arr[],int d,int n)
	{
		reverseArray(arr,0,d-1);
		reverseArray(arr,d,n-1);
		reverseArray(arr,0,n-1);
	}
	static void reverseArray(int arr[],int start,int end)
	{
		while(start<end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start=start+1;
			end=end-1;
		}
	}
	static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
	public static void main(String []args)
	{
		int arr[]= {1,2,3,4,5,6};
		
		rotate(arr,2,6);
		printArray(arr);
	}
	 
	
}
