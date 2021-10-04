package AbstractClasses;

public class ChildEmirities extends AbstractParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildEmirities cm = new ChildEmirities();
		cm.BodyColour();
		cm.engine();
		cm.SafetyGidelines();

	}

	@Override
	public void BodyColour() {
		// TODO Auto-generated method stub
		System.out.println("Red");
	}

}
