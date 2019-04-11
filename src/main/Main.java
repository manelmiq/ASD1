package main;

import java.util.Iterator;
import java.util.function.Predicate;

public class Main {

	public static MyVector<Integer> c = new MyVector<Integer>();

	public static void main(String[] args) {
		initializeData();
		// 1 -
		Functor<Integer> sum = new SumFunctor();
		c.doAll(sum);
		System.out.println("1a. Sum:" + sum.getValue());

		// 1b -
		Functor<Integer> average = new AverageFunctor();
		c.doAll(average);
		System.out.println("1b Average:" + average.getValue());

		// 2-
		sum = new SumFunctor();
		average = new AverageFunctor();
		Predicate<Integer> pred = new GreaterThanN();

		Iterator<Integer> iterator = c.iterator(pred);
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			if (i != null)
				sum.compute(i);
		}

		iterator = c.iterator(pred);

		while (iterator.hasNext()) {
			Integer i = iterator.next();
			if (i != null)
				average.compute(i);
		}
		System.out.println();
		System.out.println("2. Sum:" + sum.getValue());
		System.out.println("2. Average:" + average.getValue());
		System.out.println();
		// 3 -
		sum = new SumFunctor();
		average = new AverageFunctor();
		c.doAll(sum, pred);
		System.out.println("3. Sum:" + sum.getValue());
		c.doAll(average, pred);
		System.out.println("3. Average:" + average.getValue());

		// 4-

		sum = new SumFunctor();
		average = new AverageFunctor();
		Iterable<Integer> iterable = c.iterable(pred);

		for (Integer i : iterable) {
			if (i != null)
				sum.compute(i);
		}

		iterable = c.iterable(pred);

		for (Integer i : iterable) {
			if (i != null)
				average.compute(i);
		}
		
		System.out.println();
		System.out.println("4. Sum:" + sum.getValue());
		System.out.println("4. Average:" + average.getValue());
		System.out.println();

	}

	public static void initializeData() {
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		c.add(6);
		c.add(7);
		c.add(8);
		c.add(9);
		c.add(10);
		c.add(11);
	}

}
