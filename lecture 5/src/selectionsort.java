
public class selectionsort {
	
	public static void selection(int[] arr){
		for(int round=0;round<arr.length-1;round++){	
			{ int x=arr[round];
			int position=round;
         for(int z=round+1;z<arr.length;z++)
        	   { 
              if(x>arr[z])
              {x=arr[z];
            position =z;}
              }
         
            arr[position]=arr[round];
            arr[round]=x;
         
        }
          
        }
// write your code here
    }//write your code here
	
  public static void main(String []args)
  {
	  int arr[]= {4,5,3,6,7,23};
	  selection(arr);
	  for(int i=0;i<arr.length;i++)
	  {  
	  System.out.print(arr[i]+" ");}
  }

}