package main;

import java.util.function.Predicate;

public class GreaterThanN implements Predicate<Integer> 
{
	
	
	@Override
	public boolean test(Integer t) {
		return t > 2 ? true : false;
	}

}
