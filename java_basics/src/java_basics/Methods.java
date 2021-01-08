package java_basics;

import anotherPackage.testClass;

public class Methods {

	public static void main(String[] args) {
		
		MyUtils.printSomeJunk(27);
		System.out.println(MyUtils.printSomeJunk("hello there"));
		
		MyUtils.sum2number(10, 23);
		
		int myNum = MyUtils.add10(38);
		System.out.println(myNum);
//		or
		System.out.println(MyUtils.add10(99));
		
		testClass.doSmth();
		
		
//		using not static methods
		MyUtils myVar = new MyUtils();
		
		myVar.add100(99);
		
	}

}
