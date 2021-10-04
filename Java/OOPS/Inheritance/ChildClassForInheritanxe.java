package Inheritance;

public class ChildClassForInheritanxe extends Parent {

	public void Engine() {
		System.out.println("New Engine");
	}
	
	public void color() {
		System.out.println(colour);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClassForInheritanxe ci = new ChildClassForInheritanxe();
		ci.color();
		ci.Brakes();
	}

}
