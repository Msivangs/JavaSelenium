package SuperKeyword;

public class ChildDemo extends ParentDemo {

	String name = "javaconcepts";

	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo cd = new ChildDemo();
		cd.getStringData();
	}

}
