package z_daa;
import java.util.*;
class Node1<T>
{
	T data;
	Node1 next;
	public Node1(T s)
	{
	   this.data=s;	
	}
}
class LinkedList<T>
{
	Node1<T> root;
	Node1<T> tail;
	public LinkedList()
	{
		root=null;
		tail=null;
	}
	public void insert(T data)
	{
		if(root==null)
		{
			root=new Node1<T>(data);
			tail=root;
		}
		else {
			tail.next=new Node1<T>(data);
			tail=tail.next;
		}
	}
	public T poll()
	{
		if(root==null)return null;
		T t=root.data;
		root=root.next;
		return t;
 	}
	
}
class Queue<T>
{
	LinkedList<T> q1;
	public Queue()
	{
		q1=new LinkedList<T>();
	}
	public void add(T data)
	{
		q1.insert(data);
	}
	public T poll()
	{
		return q1.poll();
	}
	public boolean isEmpty()
	{
		return q1.root==null;
	}
}
class Nodea
{
	String x;String y;
	public Nodea(String a,String b)
	{
		this.x=a;
		this.y=b;
	}
}
public class generic_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String arr[]= {"ab","cd","ef","gh","jk","lm"};
         Queue<Nodea> queue=new Queue<>();
         for(int i=0;i<arr.length;i++)
         {
        	 for(int j=i+1;j<arr.length;j++)
        	 {
        	 queue.add(new Nodea(arr[i],arr[j]));
        	 }
         }
        	 
         while(!queue.isEmpty())
         {
        	 Nodea str=queue.poll();
        	 System.out.println(str.x+" "+str.y);
         }
	}

}
