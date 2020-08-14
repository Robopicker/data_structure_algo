package z_daa;
import java.util.*;
//max_priority Queue
public class Priority_queue {
	
	ArrayList<Integer> pr_queue;
	public Priority_queue()
	{
		pr_queue=new ArrayList<>();
	}
	int size()
	{
		return pr_queue.size();
	}
	boolean isEmpty()
	{
		return pr_queue.size()==0;
	}
	void insert(int data)
	{
		pr_queue.add(data);
		int childIndex=pr_queue.size()-1;
		
		while(childIndex>0 )
		{  int parentIndex=(childIndex-1)/2;
			if(pr_queue.get(childIndex)>pr_queue.get(parentIndex))
			{
		 	int temp=pr_queue.get(childIndex);
		     pr_queue.set(childIndex, pr_queue.get(parentIndex));
		     pr_queue.set(parentIndex, temp);
		     childIndex=parentIndex;
		     parentIndex=(childIndex-1)/2;
		    
			}
			else break;
		}
	}
	
	  public  int remove()
	   {    if(pr_queue.size()==0)
	       {
		      return -1;
	         }
	       int temp=pr_queue.get(0);
	       pr_queue.set(0, pr_queue.get(pr_queue.size()-1));
	       pr_queue.remove(pr_queue.size()-1);
	       int parentindex=0;
	       int leftchildindex=(parentindex*2+1);
	       int rightchildindex=(parentindex*2+2);
	       while(leftchildindex<pr_queue.size())
	       {
	    	   int minindex=parentindex;
	    	   if(pr_queue.get(minindex)<pr_queue.get(leftchildindex))
	    	   {
	    		   minindex=leftchildindex;
	    	   }
	    	   if(rightchildindex<pr_queue.size()&&pr_queue.get(minindex)<pr_queue.get(rightchildindex))
	    	   {
	    		   minindex=rightchildindex;
	    	   }
	    	   if(minindex==parentindex)
	    	   {
	    		   break;
	    	   }
	    	   int temp1=pr_queue.get(parentindex);
	    	   pr_queue.set(parentindex, pr_queue.get(minindex));
	    	   pr_queue.set(minindex, temp1);
	    	   parentindex=minindex;
	    	   leftchildindex=2*parentindex+1;
	    	   rightchildindex=2*parentindex+2;
	   
	       }
		return temp;    
	   }
	
}
