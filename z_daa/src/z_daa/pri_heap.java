package z_daa;
import java.util.*;
public class pri_heap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			 PriorityQueue<Integer> pq = 
                     new PriorityQueue<>(Collections.reverseOrder()); 
			int n=s.nextInt();
			for(int i=0;i<n;i++)
			{
				pq.add(s.nextInt());
			}
			for(int i=0;i<n;i++)
			{
				System.out.println(pq.remove());
			}
		}

	}

}
