package Constructors;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("I am in the constructor");
	}
	
	public void getdata()
	{

		System.out.println("I am the method");
	}
	
	//will not return values
	//Name of constructor should be class name

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo cd = new ConstructorDemo();
		//When ever you create an object constructor is called
		//Block of code when ever an object is created
	}

}
