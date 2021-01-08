/**
 * 57: Working with Streams
 */
package streams.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStreams {

	public static void main(String[] args) throws IOException {

		// print each line within range 1-10, but does not take last value (123456789)
		IntStream
			.range(1, 10)
			.forEach((x) -> System.out.print(x));
		
		System.out.println();
		
		// Integer Stream with skip - skip 5 elements of the stream (6789)
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach((x) -> System.out.print(x));
				
		System.out.println();

		
		// Integer Stream with sum (6 = 1+2+3+4)
		int value = IntStream
						.range(1, 4)
						.sum();
						
		System.out.println(value);
		
		
		// Stream.of, sorted, findFirst
		Stream.of("hello", "bottle", "africa")
			.sorted()
			.findFirst() 
			.ifPresent((x) -> System.out.print(x));		

		System.out.println();
		
		
		// Stream from Array, sort, filter and print
		String[] items= {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
		
		Stream.of(items)
			.filter((x) -> x.startsWith("t"))
			.sorted()
			.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		
		// Average of squares of an Integer array (220/5) 
		Arrays.stream(new int[] {2, 4, 6, 8, 10})		
			.map((x) -> x * x)
			.average()
			.ifPresent((n) -> System.out.print(n));	
				
		System.out.println();

		
		// Stream from a list
		List<String> listItems= Arrays.asList("car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy");	
		listItems.stream()
			.map(x -> x.toLowerCase())
			.filter(x -> x.startsWith("c"))
			.sorted()
			.forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		
		// Stream from file
		Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
		lines.sorted()
			 .filter(l -> l.length() > 8)
			 .forEach(x -> System.out.print(x + ", "));
		
		lines.close();
		
		System.out.println();

		
		// List from file
		List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
								  .filter(x -> x.contains("th"))
								  .collect(Collectors.toList());
		
		words.forEach(x -> System.out.print(x + ", "));
		
		System.out.println();
		
		
		// count rows with more than 3 elements
		Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
		int rowCount = (int) rows
			.map(x -> x.split(","))
			.filter(x -> x.length > 3)		// more than 3 elements per row
			.count();
		
		System.out.println(rowCount + " good rows.");
		
		rows.close();
		

		// count rows with more than 3 elements
		Stream<String> row = Files.lines(Paths.get("files/stockDataCsv.txt"));
		
		//x is entire line as a text -> split that line with ',' and treats hole line as array 
		row.map(x -> x.split(","))			 
		   .filter(x -> x.length > 3)							//array where length > 3 
		   .filter(x -> Integer.parseInt(x[1].trim()) > 50)	//number on first position > 50
		   .forEach(x -> System.out.println(x[0].trim() + ", " + 
									        x[2].trim() + ", " + 
										    x[3].trim() + ". "));				
		row.close();		
		
	}

}
