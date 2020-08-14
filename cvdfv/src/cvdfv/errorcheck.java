package cvdfv;

public class errorcheck {
	public static void selectionSort(int[] arr){ 
        
		for(int i = 0; i < arr.length - 1; i++) {
			int smallest = arr[i];
			int smallestPos = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < smallest) {
					smallest = arr[j];
					smallestPos = j;
				}
			}
			if(smallestPos != i) {
				int temp = arr[i];
				arr[i] = arr[smallestPos];
				arr[smallestPos] = temp;
			}
		}
     }
	public static int maximumProfit(int budget[]) {
	      selectionSort(budget);
	      int maxprofit=0;
	      int price=0;
	      int count=budget.length;
	      for(int i=0;i<budget.length;i++)
	      {   
	    	  if((budget[i]*budget.length-1-i)>price)
	    	  {    price=budget[i];
	    	
	    	  }
	      }
	      System.out.println(price);
	      for(int i=0;i<budget.length;i++)
	      {
	    	  if(price>budget[i])
	    	  {
	    		  count--;
	    	  }
	      }
	    
	      for(int i=budget.length;i>0;i--)
	      {
	    	 int sum=count*price;
	    	 if(sum>maxprofit)
	    	 {
	    		 maxprofit=sum;
	    	 }
	    	 
	      }
	     return maxprofit;
		}
	public static String minLengthWord(String input){
		 int size=-1;int count=0;
	      int sizechar=0;
	      String ans="";
	      for(int j=0;j<input.length();j++)
	      {  
	    	  
	    	  count++;
	        for(int i=0;i<sizechar;i++)
	        {    
	             sizechar++;
	          if(input.charAt(i)==' ')
	          {
	        	  break;
	          }
	        
	       
	        }
	        if(sizechar<size)
	          {
	          size=sizechar;
	          ans=input.substring(count, size);
	          
	           }
	        
	            
	      }
	      return ans;
	         
	      // Write your code here

		}

	public static void main(String[] args) {
	//	int a[]= {30,20,54,14};
		
		//int ans=maximumProfit(a);
	String ans=	minLengthWord("yogesh kum is ");
		System.out.println(ans);
		
	}

}
