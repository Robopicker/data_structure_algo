package z_daa;


import java.util.*;
class Node_list 
{
	int x;
	Node_list next;
	
	
}
public class list {
    
	static Node_list last;
	static Node_list head;
	public static void add(int p)
	{
		if(head==null)
		{
			head=new Node_list();
			head.x=p;
			head.next=null;
			last=new Node_list();
			last=head;
		}
		else
		{
			Node_list newnode=new Node_list();
			newnode.x=p;
			last.next=newnode;
			last=last.next;
			
		}
	}
	public static void addfirst(int pos,int data)
	{
	
		Node_list newnode=new Node_list();
		newnode.x=data;
		if(pos==0)
		{
			newnode.next=head;
			head=newnode;
			return ;
		}
		 
		int c=0;
		Node_list prev=new Node_list();
		Node_list curr=head;
		while(c!=pos)
		{
			prev=curr;
		     curr=curr.next;
			c++;
		}
		
		prev.next=newnode;
		newnode.next=curr;
		
		
	}
	public static void delete(int pos)
	{
		if(pos==0)
		{
			head=head.next;
			return;
		}
		else
		{
			int c=0;
			Node_list prev=new Node_list();
			Node_list curr=head;
			while(c!=pos)
			{
			
				 prev=curr;
				 curr=curr.next;
				c++;
			}
			prev.next=curr.next;
		}
	}
	public static void length()
	{
		Node_list temp=head;
		int c=0;
		while(temp!=null)
		{
			c++;
			temp=temp.next;
		}
		System.out.println(c);
	}
	public static void print()
	{
		Node_list temp=head;
		while(temp!=null)
		{
			System.out.print(temp.x+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  int t=s.nextInt();
	  while(t-->0)
	  {
		  int n=s.nextInt();
		 
		  while(n-->0)
		  {
			  int p=s.nextInt();
			  add(p);
			  
		  }
		
		 
		// addfirst(0,8);
		 delete(4);
		 print();
		 System.out.println();
		 length();
		  System.out.println();
	  }

	}

}
