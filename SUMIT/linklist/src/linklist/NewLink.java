package linklist;

    class NewLink {
	static class Node<T> {

		T data;
		Node<T> next;
		
		public Node(T data) {
	    this.data = data;
		}
		
	}

  Node<Integer> head;
  
  public void push(int new_data)
  {
      /* 1 & 2: Allocate the Node &
                Put in the data*/
      Node new_node = new Node(new_data);

      /* 3. Make next of new Node as head */
      new_node.next = head;

      /* 4. Move the head to point to new Node */
      head = new_node;
  }
  public void pushafter(Node<Integer> prev_node,int data)
  {
	  Node newnode=new Node<>(data);
	  Node n=head;
	  while(n!=prev_node)
	  {
		  n=n.next;
		  
	  }
	  Node p= n.next;
	  n.next=newnode;
	  newnode.next=p;
	  
  }
  public void append(int new_data)
  {
     
      Node new_node = new Node(new_data);

     
      if (head == null)
      {
          head = new Node(new_data);
          return;
      }

      new_node.next = null;

      Node last = head; 
      while (last.next != null)
          last = last.next;

      /* 6. Change the next of last node */
      last.next = new_node;
      return;
  }
  
   void printlist()
   {
	   Node<Integer> n=head;
	   while(n!=null)
	   {
		   System.out.println(n.data);
		   n=n.next;
	   }
	  
	   
	   
   }
   void deleteNode(int position)
   {
       // If linked list is empty
       if (head == null)
           return;

       // Store head node
       Node temp = head;

       // If head needs to be removed
       if (position == 0)
       {
           head = temp.next;   // Change head
           return;
       }

       // Find previous node of the node to be deleted
       for (int i=0; temp!=null && i<position-1; i++)
           temp = temp.next;

       // If position is more than number of ndoes
       if (temp == null || temp.next == null)
           return;

       // Node temp->next is the node to be deleted
       // Store pointer to the next of node to be deleted
       Node next = temp.next.next;

       temp.next = next;  // Unlink the deleted node from list
   }   
   
   
   // merge two linklist
   
//   public static Node<Integer> mergeTwoList(Node<Integer> head1,Node<Integer> head2) {
//		Node<Integer> p1=head1;
//       Node<Integer> p2=head2;
//       Node<Integer> original=null;
//      Node<Integer> tail=null;
//       if(p1.data>p2.data)       
//       {  tail=p2;
//        original=p2;
//        p2=p2.next;
//       }
//       else {
//            tail=p1;
//         original=p1;
//        p1=p1.next;
//       }
//         while(p1!=null&&p2!=null)
//         {
//           if(p1.data>p2.data)
//           {
//             tail.next=p2;
//             tail=p2;
//             p2=p2.next;
//           }
//           else if(p1.data<=p2.data)
//           {
//             tail.next=p1;
//              tail=p1;
//           p1=p1.next;
//           }
//         }
//      if(p1==null)
//      {
//        tail.next=p2;
//        
//      }
//     else if(p2==null)
//     {
//       tail.next=p1;
//     }
//     
//     return original;
//   
//	}

   
	public static void main(String[] args) {
       NewLink list=new NewLink();
       NewLink list1=new NewLink();
         list.push(10);
         list.push(30); 
         list.append(20);
         list.pushafter(list.head.next, 5);
          list.deleteNode(3);
          list1.push(23);
          list1.push(4);
          list1.push(15);
          Node<Integer> List3=mergeTwoList( list,list1);
         list3.printlist();
       

	}

}
