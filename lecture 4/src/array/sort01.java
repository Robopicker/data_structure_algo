package array;

public class sort01 {
   public static void sortBinaryArray(int arr[])
   {
	   int start=0;
	   int end =arr.length-1;
	   while(start<end)
	   {
		  if(arr[start]==0)
		  {
			  start++;
		  }
		  else if(arr[start]==1)
		  {  if(arr[end]==1)end=end-1;
		  else {int temp=arr[start];
			  arr[start]=arr[end];
			  arr[end]=temp;
			  start++;}
			 
		 }
	   
	   }
	  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {0,1,1,0,1};
       sortBinaryArray(arr);
    for(int i=0;i<arr.length;i++)
    {
    	System.out.print(arr[i]);//System.out.println("hello");
    }
	}

}
