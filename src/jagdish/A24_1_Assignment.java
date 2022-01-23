package jagdish;

public class A24_1_Assignment {

	void splitmethod(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index] + "--> " + arr[index].length());
		}
	}

	public static void main(String[] args) {
		A24_1_Assignment a24 = new A24_1_Assignment();
		a24.splitmethod("Hi Hello");
	}
}