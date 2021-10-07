package SetInterface;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm =new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "Gudbye");
		hm.put(2, "morning");
		hm.put(3, "evening");
		System.out.println(hm.get(2));
		
	}

}
