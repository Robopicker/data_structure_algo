
public class testemp {
	public static void main(String [] args)
	{
		stackusingarrayem stack= new stackusingarrayem(10);
		stack.push(new employee("yogesh",12));
		stack.push(new employee("radhe",13));
		stack.push(new employee("pragi",14));
		//stack.printstack();
		while(! stack.isEmpty()) {
			try {
				System.out.println(stack.pop().Name());
			} catch (StackEmptyException e) {
				//Never reach here
			}
		}
		
	
	}

}
