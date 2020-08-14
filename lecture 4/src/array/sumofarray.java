package array;

public class sumofarray {
  public static void Array(int arr[],int num)
  {  int sum=0;
     for(int i=0;i<arr.length-1;i++)
     {
    	 for(int j=i+1;j<arr.length;j++)
    	 {
    		 if(arr[i]+arr[j]==num) {
    			 if(arr[i]<arr[j])System.out.println(arr[i]+" "+arr[j]);
    			 else System.out.println(arr[j]+" "+arr[i]);
    			 }
    	 }
     }
	    
  }
	public static void main(String[] args) {
		int arr[]= {1,3,6,2,5,4,3,2,4};
		int num=7;
		Array(arr,num);

	}

}
