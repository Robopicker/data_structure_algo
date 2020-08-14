public class arrayeqllibrium {	
	//arr is the given array in which you need to find the equilibrium index
	public static int arrayEquilibrium(int[] arr){
		int n=arr.length-1;
		int sumend=0;
		int i=0;
		int j=n-1;
		int sumaccess=0;
		while(i<j)
		for( i=0;i<n;i++)
		{
		   sumend=sumend+arr[i];
		for( j=n-i;j>n-i-1;j--)
		{
			sumaccess=sumaccess+arr[j];
			
		}
        
		if(sumend==sumaccess)
		{   System.out.println(arr[j]);
		 return j;
		  }
		 }

		return -1;
		
	}
	public static void print(int n){
		if(n == 1){
			System.out.print(n + " ");
		}
		print(n - 1);
        System.out.print(n+" ");
	}

	public static int count(int n){
		if(n == 0){
			return 0;
		}
		int smallAns = count(n / 10);
		return smallAns + 1;
	}
	public static void main(String []args)
	{
		int arr[]= {-7,1,5,2,-4,3,0};
	//	   int p= arrayEquilibrium(arr);
		    //System.out.println(p);
		//    print(6);
		int x=count(156);
		System.out.println(x);
	}
}