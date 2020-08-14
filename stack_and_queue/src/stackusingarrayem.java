

public class stackusingarrayem {

	private employee[] stack;
	private int top=-1;
	public stackusingarrayem(int capacity)
	{
		stack=new employee[capacity];
		
	}
	public void push(employee emp)
	{
		if(top==stack.length)
		{
		  employee[]newarray=new employee[2*stack.length];
		  System.arraycopy(stack, 0, newarray, 0, stack.length);
		  stack=newarray;
		}
		top=top+1;
		stack[top]=emp;
	}
	public employee pop() throws StackEmptyException
	{  
		if(isEmpty())
		{
			throw new StackEmptyException(); 
		}
	employee emp=stack[top];
	top=top-1;
	return emp;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	public employee peek()
	{
		return stack[top];
	}
	public int size()
	{
		return top+1;
	}
	public void printstack()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack[i].Name());
		}
	}
	
	
}
