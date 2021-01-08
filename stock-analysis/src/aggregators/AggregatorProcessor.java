package aggregators;

import java.io.IOException;
import java.util.List;
import fileprocessors.StockFileReader;

//any childs of Aggregator or Aggregator can be utilized in this class
public class AggregatorProcessor <T extends Aggregator> {

	T aggregator;
	String file;
	
	public AggregatorProcessor(T aggregator, String file) {
		super();
		this.aggregator = aggregator;
		this.file = file;
	}

	public double runAggregator(int columnId) throws IOException {
		
		StockFileReader fileReader = new StockFileReader(file);
		
		List<String> lines = fileReader.readFileData(); //returns all data for each line in file (excel sheet)
		
		columnId--; 	//bacause array starts with index 0
		
		for(String line : lines) {
			String[] numbers = line.split(",");		//numbers = string value for each column [0-5]
			double value = Double.parseDouble(numbers[columnId]);	//convert to Double each number
			aggregator.add(value);	 			
		}
		
		double number = aggregator.calculate();
		
		return(number);	
	}
}
