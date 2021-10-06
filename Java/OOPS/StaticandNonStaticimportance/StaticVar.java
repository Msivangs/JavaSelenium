package StaticandNonStaticimportance;

public class StaticVar {
	
	String name; //Instance Variables
	String address;
	static String city; //Class Variables
	static int i;
	
	static {
		city = "Nashville";
		i=0;
	}
	
	StaticVar(String name, String address){
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
		
	}
	
	public void getAddress() {
		System.out.println(address +city);
	}
	
	public static void getCity() {
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		
		StaticVar obj = new StaticVar("Bob", "Hyans court " );
		StaticVar obj1 = new StaticVar("Ron", "Linden ST " );
		StaticVar obj2 = new StaticVar("Ron", "Linden ST " );
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getCity();
		StaticVar.i = 4;
		obj.address="XYZ";

		
	}

}
