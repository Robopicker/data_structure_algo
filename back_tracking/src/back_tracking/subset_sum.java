package back_tracking;
import java.util.*;
public class subset_sum {

	 static int array[];
	 static ArrayList<Integer> ans;
	
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		array=new int[n];
		ans=new ArrayList<>();
		for(int i=0;i<n;i++)
			array[i]=s.nextInt();
		
		int sum=s.nextInt();
		solution(array,ans,array.length,ans.size(),0,0,30);
		
		
		
		
	}
	public static void solution(int s[], ArrayList<Integer> t,int s_size, int t_size, int sum, int ite, int  target_sum)
	{
	   if(sum==target_sum)
	   {
		   print_subset(t,t_size);
		   
		   solution(s, t, s_size, t_size-1, sum - s[ite], ite + 1, target_sum);
	   }
	   else
	    { 
	        // generate nodes along the breadth 
	        for( int i = ite; i < s_size; i++ ) 
	        { 
	           t.add(t_size,s[i]) ; 
	            // consider next level node (along depth) 
	            solution(s, t, s_size, t_size + 1, sum + s[i], i + 1, target_sum); 
	        } 
	    } 
	   
	   
	}
	private static void print_subset(ArrayList<Integer> t, int t_size) {
	 for(int i=0;i<t_size;i++)
	 {
		 System.out.print(t.get(i)+" ");
	 }
	 System.out.println();
	}
	
}
