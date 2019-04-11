package main;

public class AverageFunctor implements Functor<Integer> {

	private Integer value;
	private int count;
	private int sum;

	public  AverageFunctor() {
		value = 0;
		count = 0;
	}

	@Override
	public Integer getValue() {
		return value;
	}

	@Override
	public void compute(Integer element) 
	{		
		count++;
		sum += element;
		value = sum / count;		
	}

}
