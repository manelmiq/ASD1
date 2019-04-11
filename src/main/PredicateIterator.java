package main;

import java.util.Iterator;
import java.util.function.Predicate;

public class PredicateIterator<Integer> implements Iterator<Integer> {

	MyVector<Integer> myVector;
	Predicate<Integer> myPredicate;
	int position = 0;
	
	public PredicateIterator(MyVector<Integer> myVector, Predicate<Integer> myPredicate) {
		this.myVector = myVector;
		this.myPredicate = myPredicate;
	}	
	
	@Override
	public boolean hasNext() {
		if (position >= myVector.size())
			return false;
		return true;
	}

	@Override
	public Integer next() {
		Integer i = myVector.get(position);		
		position++;
		
		if (myPredicate.test(i))
			return i;
		else 
			return null;
	}

}
