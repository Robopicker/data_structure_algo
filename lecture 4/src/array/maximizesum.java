package array;

public class maximizesum {

	public static void main(String[] args) {
		int arr1[]= {1,5,10,15,20,25};
		int arr2[]= {2,4,5,9,15};
		int sumarr2=0;
		int sumarr1=0;
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{  sumarr1=sumarr1+arr1[i];
			for(int j=0;j<arr2.length;j++)
	    	{  sumarr2=sumarr2+arr2[j];
		       if(arr1[i]==arr2[j])
		       {	   
		       if(sumarr2>sumarr1)
		       {  int p=j;
		          while(p>=0)
		          {    sum=sum+arr2[p];
		        	  p=p-1; 
		        	  }
	         System.out.println(sum);
		         }
		       else if(sumarr1>sumarr2) { int p=i;
		         while(p>=0)
		         {
		        	 sum=sum+arr1[p];
		         }
//		         System.out.println(sum);  
		       }
		 }
	  }
 
		}

  }
}