package Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A container which stores multiple values of same data type

		int a[] = new int[5]; // This step declares an array and allocates memory for the values

		a[0] = 2;
		a[1] = 6;
		a[2] = 1;
		a[3] = 9;
		a[4] = 12; // initialize values into the array

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]); // Retrieve values from that array
		}

	}

}
