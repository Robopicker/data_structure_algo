package array;

public class mergearray {

	public static void main(String[] args) {
    int arr1[]= {1,3,4,7,11};
    int arr2[]= {2,4,6,13};
    
      int size=arr1.length+arr2.length;
       int arr[]=new int[size];
       int i=0,j=0,k=0;
    while(k<size)
    {   while(i<arr1.length)
      {
        while(j<arr2.length)
        {
        	if(arr1[i]>arr2[j])
        	{
        		arr[k]=arr2[j];
        		k=k+1;
        		j=j+1;
        		break;
        	}
        	else if(arr1[i]<arr2[j])
        	{
        		arr[k]=arr[i];
        		k=k+1;
        		i=i+1;
        		break;
        	}
        	else {
        		arr[k]=arr1[i];
        		k=k+1;
        		j=j+1;
        		i=i+1;
        		break;
        	}
        		
        }
    }
    	    
       }
   	
    
  for(int p=0;p<size;p++)
  {
  	System.out.print(arr[p]+" "); 
  }
	}
} 
