package Interface;

public class AustralianTraffic implements InterfaceDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo a=new AustralianTraffic();
		a.redStop();
		a.flashYellow();
		a.greenGo();
	}

	

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		// Write your code here
		
		System.out.println("Redstop method implemented");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		// Write your code here
		System.out.println("flashYellow method implemented");
	}



	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo method implemented");
	}

}
