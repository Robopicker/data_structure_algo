package design_algo;
 import java.util.*;

 class Node{
	 
	 int data;
	 Node next;
	 Node prev;
	 public Node(int data)
	 {
		this.data=data;
		this.next=this.prev=null;
	 }
 }
public class DoubleLinkedList {
	  static  Node head=null;        
	   static Node tail=null;
	  public static  void insert(int data)
	  {    
		  Node newnode=new Node(data); 
		  if(head==null)
		  {
			  head=newnode;
			  head.next=head;
			  tail=head;
		  }
		  else {
			  tail.next=newnode;
			  newnode.prev=tail;
			  tail=tail.next;
			  tail.next=head;
		  }
	  }
	
    public static void print()
    {
    	Node temp=head;
    	do
    	{
    		System.out.print(temp.data+" ");
    		temp=temp.next;
    	}while(temp!=head);
    	
    }
    public static void check(int data)
    {
    	Node temp=head;
    	do
    	{
    		if(temp.data==data)
    		{
    			System.out.print(temp.prev.data+" ");
    			System.out.print(temp.next.data+" ");
    		}
    		temp=temp.next;
    	}while(temp!=head);
    }
    public static void insertinpos(int data,int pos)
    {
    	Node temp=new Node(data);
    	Node start=head;
    	int count=0;
    	do
    	{    count++;
    		if(count==pos-1)
    			
    		{
    		  temp.next=start.next;
    		    start.next=temp;
    		     temp.prev=start;
    		     start.next.prev=temp;
    		}
    		start=start.next;
    	}while(start!=head);
    }
    public static void delete(int pos)
    {     if(pos==1)
       { 
    	    tail.next=head.next;
    	    head=head.next;
         }
    	
    	Node temp=head;
    	int count=0;
    	do
    	{   count++;
    		if(count==pos)
    		{
    			temp.prev.next=temp.next;
    			temp.next.prev=temp.prev.next;
    		}
    		temp=temp.next;
    	}while(temp!=head);
    }
	public static void main(String []args)
	{
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=s.nextInt();
		 insert(arr[i]);
	 }
	 //print();
	  int del=s.nextInt();
	// insertinpos(15,4);
	 delete(del);
	 print();
		
	}
}
