package main.v1;

import java.util.Stack;

public class Invoker 
{
	private Stack<Command> history = new Stack<>();

	public void push(Command c) 
	{
		history.push(c);		
	}
	
	public Command pop() 
	{
		return history.pop();
	}
	
	public boolean isEmpty() 
	{		
		return history.isEmpty();
	}

	public Stack<Command> getHistory() {
		return history;
	}
	
	
}
