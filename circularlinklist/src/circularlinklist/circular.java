package circularlinklist;

public class circular
{
 class node
 {	
	int data;
	node next;
 }
 node start;
 void insertatfirst(int data)
 {
	 node k = new node();
	 k.data=data;
	 if(start==null)
	 {
		 start=k;
		 start.next=start;
	 }
	 node val = start;
	 k.next=start;
	 start=k;
	 node trav = val;
	 while(trav.next!=val)
	 {
		 trav=trav.next;
	 }
	 trav.next=start;
 }
 void trav()
 {
	if(start==null)
		return ;
	System.out.print(start.data+" ");
	node trav =start.next;
	while(trav!=start)
	{
	  	System.out.print(trav.data+" ");
	  	trav=trav.next;
	}
 }
 void insertlast(int data)
 {
	 
	node k =new node();
	if(start==null)
	{
	k.data=data;	
	start=k;
	start.next=k;
	return;
	}
	k.data=data;
	node trav = start;
	while(trav.next!=start)
	{
	 trav=trav.next;	
	}
	k.next=start;
	trav.next=k;
 }
 void deleteatfirst()
 {
	if(start==null)
		return;
	if(start.next==start){
		start=null;
		return ;
	}
	node l =start;
	start=start.next;
	node trav =start;
	while(trav.next!=l)
	{
	 	trav=trav.next;
	}
	trav.next=start;
 }
}
 class code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     circular c= new circular();
     c.insertlast(10);
c.insertlast(32);
c.insertatfirst(67);
c.deleteatfirst();
c.insertatfirst(90);
c.insertatfirst(67);
c.deleteatfirst();
     c.trav();
	}

}
