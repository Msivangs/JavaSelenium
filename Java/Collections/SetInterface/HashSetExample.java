package SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashset tree set LinkedHashset implements set interface
		//Does not accept duplicate values
		//There is  no guarantee elements stored in sequential order ..Random Order 
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		//hs.add("INDIA");  //Here this is duplicate hashset will avoid duplicate values
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		//System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterator
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext()){
		System.out.println(i.next());
		
		}
	} 

}
