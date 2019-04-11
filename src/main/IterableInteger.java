package main;

import java.util.Iterator;
import java.util.function.Predicate;

public class IterableInteger<Integer> implements Iterable<Integer> {

	private MyVector<Integer> myVector;
	private Predicate<Integer> pred;
	
	public IterableInteger(MyVector<Integer> myVector, Predicate<Integer> pred) {
		this.myVector = myVector;
		this.pred = pred;
	}
	
	@Override
	public Iterator<Integer> iterator() {
		return new PredicateIterator<Integer>(myVector,pred);
	}

}
