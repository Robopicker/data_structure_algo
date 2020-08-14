

public class StackUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,20,30,40};
		StackUsingArray stack = new StackUsingArray();
		
		for(int i = 0; i < arr.length; i++) {
			try {
				stack.push(arr[i]);
			} catch (StackFullException e) {
			
			}
		}
		
		while(! stack.isEmpty()) {
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				//Never reach here
			}
		}
		
		
//		try {
//			int a = stack.top();
//		} catch (StackEmptyException e) {
//			
//		}
//		stack.push(10);
//		stack.push(20);
		
		

		
		
	}

}

