package graph;
import java.util.*;
class qNode
{
 String str;
 int dest;
 public qNode(String str,int dest)
 {
	 this.str=str;
	 this.dest=dest;
 }
}
public class word_chain {

   public static int count(String start,String end,String[] array,int n)
   {
	   HashSet<String> map=new HashSet<>();
	   for(int i=0;i<n;i++)
	   {
		   map.add(array[i]);
	   }
	   return count_util(start,end,array,n,map);
   }
   public static boolean isAdjcent(String str1,String str2)
		   {
	          int diff=0;
	          for(int i=0;i<str1.length();i++)
	          {
	        	  if(str1.charAt(i)!=str2.charAt(i))
	        	  {
	        		  diff++;
	        	  }
	        	  if(diff>1)return false;
	          }
	          
	          return diff==1 ?  true : false;
		   }
   public static int count_util(String start,String end,String [] array,int n,HashSet<String> map)
   {
	   Queue<qNode> queue=new LinkedList<>();
	   qNode newnode=new qNode(start,1);
	   queue.add(newnode);
	   map.remove(start);
	   while(!queue.isEmpty())
	   {
		   qNode temp=queue.poll();
		   if(temp.str.equals(end))
		   {
			   return temp.dest;
		   }
		   
		  for(int i=0;i<n;i++)
		  {
			  if(isAdjcent(temp.str,array[i]))
			  {
				  if(map.contains(array[i]))
				  {
					  map.remove(array[i]);
					  qNode node=new qNode(array[i],temp.dest+1);
					  queue.add(node);
				  }
			  }
		  }
		   
		     
	   }
	   return -1;
   }
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     String [] array=new String[n];
     for(int i=0;i<n;i++)
     {
    	 String new1=s.next();
    	 array[i]=new1;
     }
     String start=s.next();
    String end=s.next();
    int count=count(start,end,array,n);
    System.out.println(count);

	}

}
