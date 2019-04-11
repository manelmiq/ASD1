package main.v1;

import java.util.*;

public class VStack {
	private Vector<String> stackvector;

	public VStack() {
		stackvector = new Vector<String>();
	}

	public void push(String obj) {
		stackvector.insertElementAt(obj, 0);
	}

	public String pop() {
		if (stackvector.size() > 0) {
			String obj = stackvector.firstElement();
			stackvector.removeElementAt(0);
			return obj;
		} else
			return null;
	}

	public int getSize() {
		return stackvector.size();
	}

	public Vector<String> getStackVector() {
		return stackvector;
	}

	public void setStackvector(Vector<String> stackvector) {
		this.stackvector = stackvector;
	}
	
	

}
