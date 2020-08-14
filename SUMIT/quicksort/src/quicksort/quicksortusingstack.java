package quicksort;
import java.util.*;
public class quicksortusingstack {
     int quick(int A[],int start,int end)
     {
    	 int loc=0;
    	 loc=start;
    	 int left=start;
    	 int right=end;
    	 while(A[loc]<A[right])
    	 {
    		 right=right-1;
    	 }
    	 if(loc==right)
    	 {
    		 return loc;
    	 }
    	 if(A[loc]>A[right])
    	 {
    		int temp=A[loc];
    		A[loc]=A[right];
    		A[right]=temp;
    		loc=right;
   
    	 }
     }
	
	
	
	public static void main(String[] args) {
	

	}

}
