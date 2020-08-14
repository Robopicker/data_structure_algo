package implement;
import java.util.*;
public class priority_queue {

	private static ArrayList<Integer> pr_queue;
	   public priority_queue()
	   {
		   pr_queue=new ArrayList<Integer>();
	   }
	   
	   public static int size()
	   {
		   return pr_queue.size();
	   }
	   public static boolean isEmpty() {
		   return pr_queue.size()==0;
	   }
	   
	   public static void insert (int element)
	   { 
		    pr_queue.add(element);
		    int childindex=pr_queue.size()-1;
		    //int parentindex=(childindex-1)/2;
		    while(childindex>0)
		    {   int parentindex=(childindex-1)/2;
		    	if(pr_queue.get(childindex)<pr_queue.get(parentindex))
		    	{          
		    		int temp=pr_queue.get(childindex);
		    	
		    		pr_queue.set(childindex, pr_queue.get(parentindex));
		    		pr_queue.set(parentindex,temp);
		    		childindex=parentindex;
		    		parentindex=(childindex-1)/2;
		    	}
		    	else {
		    		break;
		    	}
		    	
		    }
		   
	   }
	   public static int remove()
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
	    	   if(pr_queue.get(minindex)>pr_queue.get(leftchildindex))
	    	   {
	    		   minindex=leftchildindex;
	    	   }
	    	   if(rightchildindex<pr_queue.size()&&pr_queue.get(minindex)>pr_queue.get(rightchildindex))
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
