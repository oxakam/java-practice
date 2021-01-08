package aggregators;

import java.util.ArrayList;
import java.util.List;

public class MaxAggregator extends Aggregator{
	
	public MaxAggregator(List<Double> numbers) {
		this.numbers = new ArrayList<Double>();
	}

	public MaxAggregator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		double max = numbers.get(0);	//numbers list from abstract Aggregator class
		for(Double number : numbers){
			if(number > max){
				max = number;
			}
		}
		return max;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}
	
}
