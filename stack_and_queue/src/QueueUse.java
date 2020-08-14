
public class QueueUse {
	
		public static void main(String[] args) throws QueueEmptyException {
			// TODO Auto-generated method stub

			QueueUsingLinkList<Integer> queue = new QueueUsingLinkList<>();
			for(int i = 0; i < 3; i++) {
				queue.enqueue(i);
			}
			System.out.println(queue.size());
			while(!queue.isEmpty()) {
				System.out.println(queue.dequeue());
			}
		
//			System.out.println(queue.dequeue());
//			queue.enqueue(10);
//			System.out.println(queue.dequeue());
		}


	}

