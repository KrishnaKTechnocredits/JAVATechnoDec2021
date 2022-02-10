package yogeshNimbalkar;

//sum of all numbers in a given statement.
public class Test6_Program3 {

	int sumOfInputs(String str) {
		int sum = 0;
		String[] arr = str.split(" ");
		for(int index=0; index<arr.length; index++) {
			sum = sum + Integer.parseInt(arr[index]);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String input = "10 10 20 30";
		Test6_Program3 program3 = new Test6_Program3();
		System.out.println("Sum of numbers in given statement is: " + program3.sumOfInputs(input));
	}
}
