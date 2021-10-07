package ArraList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array list has an dynamic size where we can increase and decrease the values
		// Array have fixed size where as arraylist can grow dynamically
		// you can access and insert any values in any index

		// Can accept duplicate values
		// ArrayList, LinkedList, vector- Implementing List interface

		ArrayList<String> a = new ArrayList<String>();
		a.add("Ram");
		a.add("Rahul");
		System.out.println(a);
		a.add(0, "Student");
		System.out.println(a);
		/*
		 * a.remove(1); System.out.println(a); a.remove("Rahul"); System.out.println(a);
		 */
		System.out.println(a.get(2));
		System.out.println(a.contains("Rahul"));
		System.out.println(a.indexOf("Rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());

	}

}
