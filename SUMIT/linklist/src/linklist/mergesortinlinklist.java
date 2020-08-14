package linklist;

public class mergesortinlinklist {

}

public class Solution {
public static LinkedListNode<Integer> Middel(LinkedListNode<Integer> head) {
      LinkedListNode<Integer> temp=head;
      LinkedListNode<Integer> temp1=head.next;
  if(head==null)
  {
    return head;
  }
      while(temp1!=null&&temp1.next!=null)
       {
          temp=temp.next;
        temp1=temp1.next.next;
       }
      
     return temp;
      
    }
  public static LinkedListNode<Integer> mergesort(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		LinkedListNode<Integer> original=null;
       
    if(head1==null)
    { return head2;
    }
    if(head2==null)
    {
      return head1;
    }
    
    if(head1.data>head2.data)       
        { 
         original=head2;
         original.next=mergesort(head1,head2.next);
        }
    else if(head1.data<=head2.data)
    {
      original=head1;
      original.next=mergesort(head1.next,head2);
      
    }
     
      return original;
   
		
	}


	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
      if(head==null||head.next==null)
      { 
        return head;
      }
     
      LinkedListNode<Integer> head2=Middel(head);
       LinkedListNode<Integer> middlenext=head2.next;
           
      head2.next=null;
     LinkedListNode<Integer> left= mergeSort(head);
         LinkedListNode<Integer> right= mergeSort(middlenext);
         LinkedListNode<Integer> newhead= mergesort(left,right);
      return newhead;
       

	}

}
