package aggregators;

import java.util.ArrayList;
import java.util.List;

public class MinAggregator extends Aggregator{

	public MinAggregator(List<Double> numbers) {
		this.numbers = new ArrayList<Double>(numbers);
	}

	public MinAggregator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculate() {
		double min = numbers.get(0);	//numbers list from abstract Aggregator class
		for(Double number : numbers){
			if(number < min){
				min = number;
			}
		}
		return min;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}

}
