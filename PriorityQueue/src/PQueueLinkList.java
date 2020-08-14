import java.util.*;
public class PQueueLinkList {
   ArrayList<Integer> heap;
   
   PQueueLinkList()
   {
	   heap=new ArrayList<>();
   }
   int size()
   {
	   return heap.size();
   }
   Boolean IsEmpty()
   {
	   return size()==0;
   }

   void insert(int value) {
		heap.add(value);
		// upward heapify
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;
		while(childIndex > 0) {
			if(heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}else {
				return;
			}	
		}	
	}
	
	int getMin() {
		if(heap.size() == 0) {	
			// Exception
			return Integer.MIN_VALUE;
		}	
		return heap.get(0);
	}
	
	int removeMin() {
		if(heap.size() == 0) {	
			// Exception
			return Integer.MIN_VALUE;
		}
		int temp = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		if(heap.size() > 1) {
			downHeapify(0);
		}
		return temp;
	}

	private void downHeapify(int index) {
		int leftChildIndex = 2 * index + 1;
		int rightChildIndex = 2 * index + 2;
		if(leftChildIndex >= heap.size()) {
			return;
		}
		int minIndex = index;
		if(heap.get(leftChildIndex) < heap.get(minIndex)) {
			minIndex = leftChildIndex;
		}
		if(rightChildIndex < heap.size() &&
				heap.get(rightChildIndex) < heap.get(minIndex)) {
			minIndex = rightChildIndex;
		}
		if(minIndex != index) {
			int temp = heap.get(index);
			heap.set(index, heap.get(minIndex));
			heap.set(minIndex, temp);
			downHeapify(minIndex);
		}
		
	}
	

	public static void main(String[] args) {
		
		int arr[] = {8,3,9,1,33,5};
		PQueueLinkList pq = new PQueueLinkList();
		for(int i : arr) {
			pq.insert(i);
		}
		
		while(!pq.IsEmpty()) {
			System.out.print(pq.removeMin()+" ");
		}
		

	}

}
