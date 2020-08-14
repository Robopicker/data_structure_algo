package implement;
 
public class heap_sort {
	
	static void heapsort(int  arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			 int childindex=i;
			   
			    while(childindex>0)
			    {   int parentindex=(childindex-1)/2;
			    	if(arr[childindex]<arr[parentindex])
			    	{          
			    		int temp=arr[childindex];
			    	
			    		arr[childindex]= arr[parentindex];
			    	  arr[parentindex]=temp;
			    		childindex=parentindex;
			    		parentindex=(childindex-1)/2;
			    	}
			    	else {
			    		break;
			    	}
			    	
			    }
			   
		}
		int size=n;
		while(size>1)
		{
			int temp=arr[0];
			arr[0]=arr[size-1];
			arr[size-1]=temp;
			size--;
			
			 int parentindex=0;
		       int leftchildindex=(parentindex*2+1);
		       int rightchildindex=(parentindex*2+2);
		       while(leftchildindex<size)
		       {
		    	   int minindex=parentindex;
		    	   if(arr[minindex]>arr[leftchildindex])
		    	   {
		    		   minindex=leftchildindex;
		    	   }
		    	   if(rightchildindex<size&&arr[minindex]>arr[rightchildindex])
		    	   {
		    		   minindex=rightchildindex;
		    	   }
		    	   if(minindex==parentindex)
		    	   {
		    		   break;
		    	   }
		    	   int temp1=arr[parentindex];
		    	  arr[parentindex]= arr[minindex];
		    	  arr[minindex] =temp1;
		    	   parentindex=minindex;
		    	   leftchildindex=2*parentindex+1;
		    	   rightchildindex=2*parentindex+2;
		   
		       }

			
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {2,10,4,8,5,1};
		  heapsort(arr,6);
		  for(int i=0;i<6;i++)
		  {
			  System.out.print(arr[i]+" ");
		  }

	}

}
