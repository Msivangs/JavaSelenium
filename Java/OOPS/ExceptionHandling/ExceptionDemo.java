package ExceptionHandling;

public class ExceptionDemo {

	// If I have three lines of code and I dont know there might be error or not in
	// the code in this case we will use exception handling by try catch logic
	// one try can be followed by multiple catch blocks
	// catch should be an immediate catch block after try

	public static void main(String[] args) {

		int b = 7;

		int c = 0;

		try {
			int k = b / c;

			int arr[] = new int[5];

			System.out.println(arr[7]);

			// TODO Auto-generated method stub
		}

		// If you know the kind of exception we can use arithmetic and IndexOutBound
		// If you don't know the exception which we are expecting, in this case we will
		// use try catch as (Exception e).

		catch (ArithmeticException et) {
			System.out.println("I catched the Arithmetic/Exception");
		}

		catch (IndexOutOfBoundsException ets) {
			System.out.println("I catched the IndexOutOfBound/Exception");
		}

		catch (Exception e) {
			System.out.println("I catched the error/exception");
		}

	}
}
