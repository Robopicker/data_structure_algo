


public class StackUsingArray {

	private  int data[];
	private int top; // Index at which top most element is placed
	// Create a stack with sone initial capacity
	public StackUsingArray(int capacity) {
		data = new int[capacity];
		top = -1;
	}

	public StackUsingArray() {
		data = new int[10];
		top = -1;
	}

	// Number of elements in stack
	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
//			if(top == -1) { // size() == 0
//				return true;
//			}else {
//				return false;
//			}
		return top == -1;
	}

	public void push(int element) throws StackFullException {
		// Stack Overflow
		if(top == data.length - 1) {
			// Throw StackFullException
			throw new StackFullException();
		}
		top++;
		data[top] = element;
	}

	public int top() throws StackEmptyException{
		if(top == -1) {
			// Throw Stack Empty Exception
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}

	public int  pop() throws StackEmptyException{
		if(top == -1) {
			// Throw Stack Empty Exception
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
	}


}
