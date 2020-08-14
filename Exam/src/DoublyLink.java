import java.util.*;
class Node
{
	String name;
	int RollNo;
   String yoga;
   String Music;
   Node Forward;
   Node Backward;
	Node (String name,String yoga,String Music,int RollNo)
	{
		this.RollNo=RollNo;
		this.name=name;
		this.yoga=yoga;
		this.Music=Music;
		Forward=null;
		Backward=null;
	}
}
public class DoublyLink {
  Node head;
  Node yt;
  Node mp;
     DoublyLink()
     {
    	 head=null;
    	 yt=head;
    	 mp=head;
     }
     void insert(String name,String yoga,String music,int rollno )
     {     Node newnode=new Node(name,yoga,music,rollno);
         
    	     if(head==null)
        	 {
    		 head=newnode;
    	     head.Forward=head;
    	     head.Backward=null;
//    	     if(yoga!=null&&yt==head)
//    	     {
//    	    	 yt.Forward=newnode;
//    	     }
//    	     else if(music!=null&&mp==head)
//    	     {
//    	    	 mp.Forward=newnode;
//    	     }
    	 }
    	 Node p=head;
    	 while(p.RollNo<rollno&&p.Forward!=head&&p!=null)
    	 {
    		 p=p.Forward;
    	 }
    	 if(p.Forward==head)
    	 {
    		p.Forward=newnode;
    		newnode.Backward=p;
    		newnode.Forward=head;
    		head.Backward=newnode;
    	 }
    	 Node temp=p.Forward;
    	 newnode.Forward=temp;
    	 newnode.Backward=p;
    	 temp.Backward=newnode;
    	 p.Forward=newnode;
    	 
    	 if(yoga!=null)
    	 {    
    		 Node YN=yt;
    		 while(YN.Forward!=head&&YN.yoga==null&&YN!=null)
    		 {
    			 YN=YN.Forward;
    		 }
    		 if(yt==head)
    		 {
    			 yt.Forward=newnode;
    		 }
    		 yt.Forward=YN;
    		
    	 }
    	 if(music!=null)
    	 {
    		 Node MN=mp;
    		 while(MN.Forward!=head&&MN.yoga==null&&MN!=null)
    		 {
    			 MN=MN.Forward;
    		 }
    		 mp.Forward=MN;
    		
    	 }
     }
    void  delete(int rollno)
    {
    	Node Temp=head;
    	while(Temp.Forward!=null&&Temp.RollNo!=rollno)
    	{
    		Temp=Temp.Forward;
    	}
    	if(Temp.Forward==head)//if delete item is last item of link list
    	{
    		head.Backward=Temp.Backward;
    	Temp.Backward.Forward=head;
    	}
    	Node X=Temp.Forward.Forward;
    	X.Backward=Temp;
    	Temp.Forward=X;
    }
     void printAll()
     {
    	 Node temp=head;
    	 System.out.println(temp.name+" "+temp.RollNo+" "+temp.Music+" "+temp.yoga);
    	 while(temp.Forward!=head)
    	 {
    		 System.out.print(temp.name+" "+temp.RollNo+" "+temp.Music+" "+temp.yoga);
    		 System.out.println();
    		 temp=temp.Forward;
    	 }
     }
     void printyoga()
     {
    	 Node temp=yt;
    	 System.out.println(temp.name+" "+temp.RollNo+" "+temp.yoga);
    	 while(temp.Forward!=head)
    	 {
    		 System.out.println(temp.name+" "+temp.RollNo);
    		 temp=temp.Forward;
    	 }
     }
     void printmusic()
     {   
    	Node temp=mp;
    	System.out.println(temp.name+" "+temp.RollNo+" "+temp.Music);
    	while(temp.Forward!=head)
    	{
    		System.out.println(temp.name+" "+temp.RollNo);
    	}
     }
	public static void main(String[] args) {
		DoublyLink p=new DoublyLink();
	//	Scanner s=new Scanner(System.in);
	p.insert("varun", "yoga", "", 100);
	p.insert("rahul", "yoga", "", 101);
	p.insert("amit", "yoga", "music", 102);
		//p.printAll();
		p.printyoga();
	}

}
