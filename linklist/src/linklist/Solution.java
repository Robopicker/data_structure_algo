package linklist;
public class Solution {
	    public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		LinkedListNode<Integer> p1=head1;
        LinkedListNode<Integer> p2=head2;
        LinkedListNode<Integer> original=null;
        LinkedListNode<Integer> tail=null;
        if(p1.data>p2.data)       
        {  tail=p1;
         original=p1;
         p1=p1.next;
        }
        else {
             tail=p2;
          original=p2;
          p2=p2.next;
        }
          while(p1!=null&&p2!=null)
          {
            if(p1.data>p2.data)
            {
              tail.next=p1; 
              tail=p1;
            }
            else
              tail.next=p2;
               tail=p2;
          }
       if(p1==null)
       {
         tail.next=p2;
       }
      else if(p2==null)
      {
        tail.next=p1;
      }
      return original;
	}

	public static void main(String[] args) {
		

	}

}
