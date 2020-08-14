package array;

public class selectionsort {
  public static void Selectionsort(int arr[])
  {    for(int round=0;round<arr.length-1;round++)
      { int select=arr[round];
        int position=round;
	    for(int i=round+1;i<arr.length-1;i++)
        {   if(select>arr[i])
           { select=arr[i];
        	   position=i;
             }
    	  
          }
	   int temp=arr[round];
	     arr[round]=arr[position];
	     arr[position]=temp;
          }
	  
  }
	public static void main(String[] args) {
		int arr[]= {2,4,5,1,6,7,12,13};
		Selectionsort(arr);
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}// TODO Auto-generated method stub

	}

}
