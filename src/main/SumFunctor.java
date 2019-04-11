package main;

public class SumFunctor implements Functor<Integer> 
{
	private Integer value;
	
	public SumFunctor() {
		value = 0;
	}
	

	@Override
	public Integer getValue() {
		return value;
	}

	@Override
	public void compute(Integer element) {
		value += element;		
	}

}
