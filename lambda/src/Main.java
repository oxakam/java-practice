/**
 * 54-55: Functional Interface and Lambdas (Anonymous function)
 * 
 * Definitions of Lambda:
 * 
 * - blocks of code that can be passed as an argument to a function call
 * - blocks of code used to implement a method defined by a functional interface
 * - not associate a set of instructions with an object 
 */
public class Main {

	public static void main(String[] args) {

//		Human tom = new Human();
//		walker(tom);
		
//		Robot rob = new Robot();
//		walker(rob);
		
		//create new Walkable class implemented as argument
//		walker(new Walkable() {	
//			@Override
//			public void walk() {
//				System.out.println("Custom object walking...");
//				
//			}
//		});
		
		//lambda expression - short version of anonymous class
		//implementation of walkable interface as argument in walker() method
		walker( () -> System.out.println("Custom object walking...") );
		
		//multiple steps syntax
		walker( () -> {System.out.println("Custom object walking...");
					   System.out.println("The object dancing");
					   } );
		
		//all this code assigned to the functional interface type LambdaInterface
		Walkable blockOfCode = () -> 
			{System.out.println("Custom object walking...");
			 System.out.println("The object dancing");
			};
			
		walker(blockOfCode);
		
/**
* lambda expressions examples
*/		
		//how to specify lambda code for sayHello function?
		//use any functional interface as a type (here LambdaInterface)
		LambdaInterface helloVar = () -> System.out.println("hello");	
		
		
		//lambda expression with arguments
		Calculate sumVar = (a,b) -> a + b;
		helloVar.someMethod();		//without System.out.println since helloVar has it
		System.out.println(sumVar.compute(4, 5));		

		
		//lambda expression with arguments and conditions
		Calculate noneZeroDevider = (a,b) -> {
			if(a == 0) {
				return 0;
			}
			return a/b;
		};
		System.out.println(noneZeroDevider.compute(15, 5));
		
		
		//lambda expression with String arguments and conditions
//		StringWorker reverser = (s) -> {	
		CommonGenericInterface<String> reverser = (s) -> {	 //use generic interface
			String result = "";	
			for(int i = s.length()-1; i >= 0; i--) {
				result += s.charAt(i);
			}
			return result;
		};
		System.out.println(reverser.work("demo"));
		
		
		//lambda expression with String arguments and conditions
//		NumberWorker factorialVar = (n)-> {
		CommonGenericInterface<Integer> factorialVar = (n)-> {		//use generic interface
			int result = 1;	
			for(int i = 1; i <= n; i++) {
				result = i * result;
			}
			return result;
		};
		System.out.println(factorialVar.work(5));					//use generic interface
//		System.out.println(factorialVar.compute(5));
	}	
	
/**
* functions using by lambda expressions
*/
	public void sayHello() {
		System.out.println("hello");
	}
		
	public int sum(int arg1, int arg2) {
		return arg1 + arg2;
	}
	
	public int noneZeroDevide(int arg1, int arg2) {
		if(arg1 == 0) {
			return 0;
		}
		return arg1/arg2;
	}
	
	public String reverse(String str) {
		String result = "";	
		for(int i = str.length()-1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}
	
	public int factorial(int num) {
		int result = 1;	
		for(int i = 1; i <= num; i++) {
			result = i * result;
		}
		return result;
	}
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}
}

/**
* abstract interfaces with arguments 
*/
interface Calculate{	
	public int compute(int a, int b);
}

//generic interface with Type to replace NumberWorker/StringWorker
interface CommonGenericInterface<T>{		
	public T work(T t);
}

//interface NumberWorker{	
//	public int compute(int num);
//}
//
//interface StringWorker{	
//	public String work(String str);
//}

