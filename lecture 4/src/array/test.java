package array;


public class test{
	
	public static void pushZerosAtEnd(int[] arr){
		/* Your class should be named PushZerosAtEnd 
		 * Don't write main().
	         * Don't read input, it is passed as function argument.
     		 * No need to return or print the output.
     		 * Taking input and printing output is handled automatically.
     		 */
      
        int N=arr.length;
        for(int i=0;i<N;i++)
        {
          if(arr[i]==0)
          {   int j=0;
        	  int temp=arr[i];
              for( j=i;i<N;j++)
              { if(j+1==N) break;
                arr[j+1]=arr[j];
              }
                arr[j]=temp;
          }
         else continue;
          
        }
      
      

	}
  static void rotateleft(int arr[],int pos,int size)
  {     int i=0;
    
  }
  public static void main(String []args)
  {
	  int arr[]= {2,0,4,1,3,0,28};
	  pushZerosAtEnd(arr) ;
	  for(int i=0;i<7;i++)
		 System.out.print(arr[i]+" "); 
  }
  
}