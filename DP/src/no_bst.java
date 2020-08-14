import java.util.*;
public class no_bst {
    
     public static int bst(int n)
    {
      int arr[]=new int[n+1];
     return bst1(n,arr);
     }
    		 
    public static int  bstDP(int n)
     {
    	int arr[]=new int[n+1];
    	arr[0]=1;
    	arr[1]=1;
    	for(int i=2;i<=n;i++)
    	{
    		arr[i]=arr[i-1]*arr[i-1]+2*arr[i-1]*arr[i-2];
    	}
    	return arr[n];
    			 
   	 }
	public static int bst1(int n,int arr[])
	{
		if(n<=1)
		{
			return 1;
		}
		int mod=(int)Math.pow(10,9)+7;
		
		if(arr[n-1]==0)
		{
	arr[n-1]=bst1(n-1,arr);
	
		}
		if(arr[n-2]==0)
		{
		arr[n-2]=bst1(n-2,arr);
	
		}
		int temp=(int)(((long)arr[n-1]*arr[n-1])%mod);
		int temp2=(int)((2*(long)arr[n-1]*arr[n-2])%mod);
		return (temp+temp2)%mod;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
		System.out.print(bstDP(n));
	}

}
