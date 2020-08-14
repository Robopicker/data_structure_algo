package lecture9;

public class multiplication {

	public static int multiplyTwoIntegers(int m, int n){
	    if(n==0)
	    {
	    	return 0;
	    }
	    return m+multiplyTwoIntegers(m,n-1);
	
	}
	public static double findGeometricSum(int k)
	    {
	     double x=findGeometricSumhelper(k,0);
	    return 1+x;
		    
        	}
	public static double findGeometricSumhelper(int k,int startindex)
	{ if(startindex==k)
	   {
		  return 1;
      	}
	return findGeometricSumhelper((k-1)/2,startindex+1);
		
	}
	
	
	public static int countZerosRec(int input)
	{ 
		if(input == 0)
		       return 0;

		    if(input %10 ==0)
		        return 1 + countZerosRec(input / 10);
		    else
		        return countZerosRec(input/10); 

	
	}
	public static int sumOfDigits(int input) {
		if(input==0)
		{
			return input;
		}
		int x=sumOfDigits(input/10);
		return input%10+x;
		
	}
//	public static boolean isStringPalindrome(String input)
//	{ 
//		if(input.substring(1))
//	{
//		
//	}
//		
//	}
	public static void main(String[] args)
	{
//	    int x=multiplyTwoIntegers(3,5);
//	    System.out.println(x);
//	int x=countZerosRec(10020002);
//		System.out.println(x);
		double x=findGeometricSum(3);
		System.out.println(x);
//		int p=sumOfDigits(12345);
//	System.out.println(p);
	}

}
