package generics.client;

public class Container<i1, i2> {	//make class generic with <i1, i2>
	
	i1 item1;	//from Object item1;
	i2 item2;
	
//	public Container(Object item1, Object item2) {
	public Container(i1 item1, i2 item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public void printItems() {
		System.out.println("Content of container: ");
		System.out.println(item1);
		System.out.println(item2);
	}

	public i1 getItem1() {				//from Object getItem1
		return item1;
	}

	public void setItem1(i1 item1) {	//from setItem1(Object item1)
		this.item1 = item1;
	}

	public i2 getItem2() {
		return item2;
	}

	public void setItem2(i2 item2) {
		this.item2 = item2;
	}

	
	
}
